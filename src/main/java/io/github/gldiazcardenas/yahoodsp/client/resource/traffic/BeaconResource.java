package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Beacon;
import io.github.gldiazcardenas.yahoodsp.client.model.BeaconResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Beaconi13nCodeResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.BeaconsResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Dir;
import io.github.gldiazcardenas.yahoodsp.client.resource.SecuredResource;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
public interface BeaconResource extends SecuredResource {

    String NAME = "beacons";

    @GET(NAME)
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    BeaconsResponse getBeacons(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                               @Query("accountId") long accountId,
                               @Query("query") String query,
                               @Query("page") Integer page,
                               @Query("limit") Integer limit,
                               @Query("sort") String sort,
                               @Query("dir") Dir dir);

    @GET(NAME + "/{beaconId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    BeaconResponse getBeacon(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                             @Path("beaconId") long beaconId);

    @POST(NAME)
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    BeaconResponse createBeacon(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                @Body Beacon beacon);

    @PUT(NAME + "/{beaconId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    BeaconResponse updateBeacon(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                @Path("beaconId") long beaconId,
                                @Body Beacon beacon);

    @GET(NAME + "/{beaconId}/i13n")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    Beaconi13nCodeResponse getInstrumentationCode(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                                  @Path("beaconId") long beaconId);

}
