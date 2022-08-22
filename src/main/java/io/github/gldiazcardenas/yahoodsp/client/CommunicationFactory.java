package io.github.gldiazcardenas.yahoodsp.client;

import okhttp3.ConnectionPool;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;

final class CommunicationFactory {

    private final Retrofit trafficRetrofit;
    private final Retrofit authRetrofit;
    private final Retrofit reportRetrofit;

    CommunicationFactory(CommunicationConfig config, SerializationFactory serializationFactory) {
        Retrofit.Builder retrofitBuilder = createRetrofitBuilder(config, serializationFactory);
        this.authRetrofit = retrofitBuilder.baseUrl(config.getAuthApiUrl()).build();
        this.trafficRetrofit = retrofitBuilder.baseUrl(config.getTrafficApiUrl()).build();
        this.reportRetrofit = retrofitBuilder.baseUrl(config.getReportApiUrl()).build();
    }

    private Retrofit.Builder createRetrofitBuilder(CommunicationConfig config, SerializationFactory serializationFactory) {
        return new Retrofit.Builder()
                .addConverterFactory(JacksonConverterFactory.create(serializationFactory.getObjectMapper()))
                .addCallAdapterFactory(SynchronousCallAdapter.create())
                .client(createOkHttpClient(config));
    }

    private OkHttpClient createOkHttpClient(CommunicationConfig config) {
        return new OkHttpClient.Builder()
                .addInterceptor(createLoggingInterceptor(config))
                .addInterceptor(new UserAgentInterceptor(config))
                .readTimeout(config.getReadTimeout())
                .writeTimeout(config.getWriteTimeout())
                .connectTimeout(config.getConnectTimeout())
                .connectionPool(new ConnectionPool(
                        config.getMaxIdleConnections(),
                        config.getConnectionsTimeAlive().toMillis(),
                        TimeUnit.MILLISECONDS))
                .build();
    }

    private HttpLoggingInterceptor createLoggingInterceptor(CommunicationConfig config) {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(config.getHttpLogger());

        if (config.isDebug()) {
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            loggingInterceptor.redactHeader("X-Auth-Method");
            loggingInterceptor.redactHeader("X-Auth-Token");
        }
        else {
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        }

        return loggingInterceptor;
    }

    public <E> E createAuthEndpoint(Class<E> clazz) {
        return authRetrofit.create(clazz);
    }

    public <E> E createTrafficEndpoint(Class<E> clazz) {
        return trafficRetrofit.create(clazz);
    }

    public <E> E createReportEndpoint(Class<E> clazz) {
        return reportRetrofit.create(clazz);
    }

    private static final class UserAgentInterceptor implements Interceptor {

        private final CommunicationConfig config;

        private UserAgentInterceptor(CommunicationConfig config) {
            this.config = config;
        }

        @NotNull
        @Override
        public Response intercept(Chain chain) throws IOException {
            return chain.proceed(chain.request().newBuilder().header("User-Agent", config.getUserAgent()).build());
        }

    }

    private static class SynchronousCallAdapter extends CallAdapter.Factory {

        public static SynchronousCallAdapter create() {
            return new SynchronousCallAdapter();
        }

        @Override
        public CallAdapter<Object, Object> get(@NotNull final Type returnType,
                                               @NotNull Annotation[] annotations,
                                               @NotNull Retrofit retrofit) {

            if (returnType instanceof Call || returnType.toString().contains("retrofit2.Call")) {
                return null;
            }

            return new CallAdapter<Object, Object>() {
                @NotNull
                @Override
                public Type responseType() {
                    return returnType;
                }

                @NotNull
                @Override
                public Object adapt(@NotNull Call<Object> call) {
                    return new Object();
                }
            };
        }

    }

}
