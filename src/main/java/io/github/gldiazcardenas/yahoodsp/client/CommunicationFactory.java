package io.github.gldiazcardenas.yahoodsp.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.gldiazcardenas.yahoodsp.client.model.AuthenticationError;
import io.github.gldiazcardenas.yahoodsp.client.model.DspError;
import io.github.gldiazcardenas.yahoodsp.client.model.DspErrorResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.DspErrorValidation;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiError;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import okhttp3.ConnectionPool;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

final class CommunicationFactory {

    private final Retrofit trafficRetrofit;
    private final Retrofit authRetrofit;
    private final Retrofit reportingRetrofit;
    private final CommunicationConfig communication;
    private final ObjectMapper objectMapper;

    CommunicationFactory(CommunicationConfig communication, ObjectMapper objectMapper) {
        this.communication = communication;
        this.objectMapper = objectMapper;

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(communication.getHttpLogger());

        if (communication.isDebug()) {
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            loggingInterceptor.redactHeader("X-Auth-Method");
            loggingInterceptor.redactHeader("X-Auth-Token");
        }
        else {
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        }

        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .addInterceptor(new UserAgentInterceptor())
                .readTimeout(communication.getReadTimeout())
                .writeTimeout(communication.getWriteTimeout())
                .connectTimeout(communication.getConnectTimeout())
                .connectionPool(new ConnectionPool(
                        communication.getMaxIdleConnections(),
                        communication.getConnectionsTimeAlive().toMillis(),
                        TimeUnit.MILLISECONDS));

        Optional.ofNullable(communication.getInterceptors()).ifPresent(iList -> iList.forEach(builder::addInterceptor));

        OkHttpClient okHttpClient = builder.build();

        this.authRetrofit = new Retrofit.Builder()
                .baseUrl(communication.getAuthApiUrl())
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .addCallAdapterFactory(new AuthCallAdapterFactory())
                .client(okHttpClient)
                .build();

        this.trafficRetrofit = new Retrofit.Builder()
                .baseUrl(communication.getTrafficApiUrl())
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .addCallAdapterFactory(new DefaultCallAdapterFactory())
                .client(okHttpClient)
                .build();

        this.reportingRetrofit = new Retrofit.Builder()
                .baseUrl(communication.getReportApiUrl())
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .addCallAdapterFactory(new DefaultCallAdapterFactory())
                .client(okHttpClient)
                .build();
    }

    public <E> E createAuthEndpoint(Class<E> clazz) {
        return authRetrofit.create(clazz);
    }

    public <E> E createTrafficEndpoint(Class<E> clazz) {
        return trafficRetrofit.create(clazz);
    }

    public <E> E createReportingEndpoint(Class<E> clazz) {
        return reportingRetrofit.create(clazz);
    }

    private final class UserAgentInterceptor implements Interceptor {
        @NotNull
        @Override
        public okhttp3.Response intercept(Chain chain) throws IOException {
            return chain.proceed(chain.request().newBuilder().header("User-Agent", communication.getUserAgent()).build());
        }
    }

    private final class AuthCallAdapterFactory extends CallAdapter.Factory {
        @Override
        public CallAdapter<Object, Object> get(@NotNull final Type returnType,
                                               @NotNull Annotation[] annotations,
                                               @NotNull Retrofit retrofit) {

            if (returnType instanceof Call || returnType.toString().contains("retrofit2.Call")) {
                throw new UnsupportedOperationException("Async calls not supported yet!");
            }

            return new CallAdapter<Object, Object>() {
                @NotNull
                @Override
                public Type responseType() {
                    return returnType;
                }

                @Override
                public Object adapt(@NotNull Call<Object> call) {
                    try {
                        Response<Object> response = call.execute();

                        if (response.isSuccessful()) {
                            return response.body();
                        }

                        AuthenticationError authError;

                        try (ResponseBody errorResponse = response.errorBody()) {
                            if (errorResponse == null) {
                                authError = new AuthenticationError();
                                authError.setError(response.message());
                                authError.setDescription(response.toString());
                            }
                            else if (Optional.ofNullable(errorResponse.contentType())
                                    .filter(t -> "application".equalsIgnoreCase(t.type()))
                                    .filter(t -> "json".equalsIgnoreCase(t.subtype()))
                                    .isPresent()) {
                                authError = objectMapper.readValue(errorResponse.bytes(), AuthenticationError.class);
                            }
                            else {
                                authError = new AuthenticationError();
                                authError.setError(Arrays.toString(errorResponse.bytes()));
                                authError.setDescription("(Content-Type:" + errorResponse.contentType() + ")");
                            }
                        }

                        DspApiError apiError = new DspApiError();
                        apiError.setStatusCode(response.code());
                        apiError.setPath(call.request().url().toString());
                        apiError.setMethod(call.request().method());
                        apiError.setMessage(authError.getError());
                        apiError.addValidation(authError.getDescription());
                        apiError.setTimestamp(Instant.now());

                        throw new DspApiException(apiError);
                    }
                    catch (Throwable e) {
                        communication.getHttpLogger().log(e.getLocalizedMessage());
                        if (e instanceof DspApiException) {
                            throw (DspApiException) e;
                        }

                        if (e instanceof RuntimeException) {
                            throw (RuntimeException) e;
                        }

                        throw new DspApiException(e);
                    }
                }
            };
        }
    }

    private final class DefaultCallAdapterFactory extends CallAdapter.Factory {
        @Override
        public CallAdapter<Object, Object> get(@NotNull final Type returnType,
                                               @NotNull Annotation[] annotations,
                                               @NotNull Retrofit retrofit) {

            if (returnType instanceof Call || returnType.toString().contains("retrofit2.Call")) {
                throw new UnsupportedOperationException("Async calls not supported yet!");
            }

            return new CallAdapter<Object, Object>() {
                @NotNull
                @Override
                public Type responseType() {
                    return returnType;
                }

                @Override
                public Object adapt(@NotNull Call<Object> call) {
                    try {
                        Response<Object> response = call.execute();

                        if (response.isSuccessful()) {
                            return response.body();
                        }

                        DspErrorResponse dspErrorResponse;

                        try (ResponseBody errorResponse = response.errorBody()) {
                            if (errorResponse == null) {
                                dspErrorResponse = new DspErrorResponse();
                                dspErrorResponse.setError(new DspError());
                                dspErrorResponse.getError().setMessage(response.message());
                                dspErrorResponse.setTimestamp(Instant.now());
                            }
                            else if (Optional.ofNullable(errorResponse.contentType())
                                    .filter(t -> "application".equalsIgnoreCase(t.type()))
                                    .filter(t -> "json".equalsIgnoreCase(t.subtype()))
                                    .isPresent()) {
                                dspErrorResponse = objectMapper.readValue(errorResponse.bytes(), DspErrorResponse.class);
                            }
                            else {
                                dspErrorResponse = new DspErrorResponse();
                                dspErrorResponse.setError(new DspError());
                                dspErrorResponse.getError().setMessage("(Content-Type:" + errorResponse.contentType() + ") " +
                                        Arrays.toString(errorResponse.bytes()));
                                dspErrorResponse.setTimestamp(Instant.now());
                            }
                        }

                        List<DspErrorValidation> validations = null;

                        if (dspErrorResponse.getValidations() != null && !dspErrorResponse.getValidations().isEmpty()) {
                            validations = new ArrayList<>(dspErrorResponse.getValidations());
                        }

                        if (dspErrorResponse.getError() != null &&
                                dspErrorResponse.getError().getValidations() != null &&
                                !dspErrorResponse.getError().getValidations().isEmpty()) {
                            if (validations == null) {
                                validations = new ArrayList<>();
                            }
                            validations.addAll(dspErrorResponse.getError().getValidations());
                        }

                        DspApiError apiError = new DspApiError();
                        apiError.setStatusCode(response.code());
                        apiError.setPath(call.request().url().toString());
                        apiError.setMethod(call.request().method());
                        apiError.setMessage(Optional.ofNullable(dspErrorResponse.getError()).map(DspError::getMessage).orElse(null));
                        apiError.setTimestamp(Optional.ofNullable(dspErrorResponse.getTimestamp()).orElse(Instant.now()));
                        apiError.setValidations(validations);

                        throw new DspApiException(apiError);
                    }
                    catch (Throwable e) {
                        communication.getHttpLogger().log(e.getLocalizedMessage());
                        if (e instanceof DspApiException) {
                            throw (DspApiException) e;
                        }

                        if (e instanceof RuntimeException) {
                            throw (RuntimeException) e;
                        }

                        throw new DspApiException(e);
                    }
                }
            };
        }
    }

}
