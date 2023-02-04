package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Advertiser;
import io.github.gldiazcardenas.yahoodsp.client.model.AdvertiserBeaconLookupsResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.AdvertiserResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.AdvertisersResponse;
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

public interface AdvertiserResource extends SecuredResource {

    String NAME = "advertisers";

    @GET(NAME)
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    AdvertisersResponse getAdvertisers(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                       @Query("query") String query,
                                       @Query("page") Integer page,
                                       @Query("limit") Integer limit,
                                       @Query("sort") String sort,
                                       @Query("dir") Dir dir);

    @GET(NAME + "/{advertiserId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    AdvertiserResponse getAdvertiser(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                     @Path("advertiserId") long advertiserId);

    @POST(NAME)
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    AdvertiserResponse createAdvertiser(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                        @Body Advertiser advertiser);

    @PUT(NAME + "/{advertiserId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    AdvertiserResponse updateAdvertiser(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                        @Path("advertiserId") long advertiserId,
                                        @Body Advertiser advertiser);

    @GET(NAME + "/{advertiserId}/beaconlookups")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    AdvertiserBeaconLookupsResponse getBeaconLookups(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                                     @Path("advertiserId") long advertiserId);

}
