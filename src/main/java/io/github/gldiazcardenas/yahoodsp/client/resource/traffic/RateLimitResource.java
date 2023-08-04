package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.RateLimitResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.SecuredResource;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

public interface RateLimitResource extends SecuredResource {

    String NAME = "ratelimit";

    @GET(NAME)
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    RateLimitResponse get(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken);

}
