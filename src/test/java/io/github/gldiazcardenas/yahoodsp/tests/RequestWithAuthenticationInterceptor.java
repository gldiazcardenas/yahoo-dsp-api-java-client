package io.github.gldiazcardenas.yahoodsp.tests;

import io.github.gldiazcardenas.yahoodsp.client.CommunicationConfig;
import io.github.gldiazcardenas.yahoodsp.client.DspApi;
import io.github.gldiazcardenas.yahoodsp.client.model.TargetingTypesResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.SecuredResource;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class RequestWithAuthenticationInterceptor {

    public static void main(String[] args) {
        DspApi api = DspApi.builder()
            .withCommunicationConfig(CommunicationConfig.builder()
                .setInterceptors(new MyAuthInterceptor()))
            .build();

        TargetingTypesResponse response = api.getDataDictionaryService()
            .getTargetingTypes(null);

        System.out.println(response);
    }

    private static class MyAuthInterceptor implements Interceptor {
        @NotNull
        @Override
        public Response intercept(@NotNull Chain chain) throws IOException {
            Request request = chain.request()
                .newBuilder()
                .addHeader(SecuredResource.AUTH_TOKEN_HEADER_NAME, "token")
                .build();
            return chain.proceed(request);
        }
    }

}
