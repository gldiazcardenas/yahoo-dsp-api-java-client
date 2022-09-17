package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.SeatsResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.SecuredResource;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

public interface SeatResource extends SecuredResource {

    @GET("seats")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    SeatsResponse getAll(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken);

}
