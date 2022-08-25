package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.SeatsResponse;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface SeatResource {

    @GET("seats")
    SeatsResponse getAll(@Header("X-Auth-Method") String xAuthMethod,
                         @Header("X-Auth-Token") String xAuthToken);

}
