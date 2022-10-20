package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.BidMultiplierCap;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultiplierCapResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultipliersRequest;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultipliersResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.SecuredResource;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
public interface BidMultiplierResource extends SecuredResource {

    @GET("lines/{lineId}/bidmultipliers")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    BidMultipliersResponse getBidMultipliers(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                             @Path("lineId") long lineId);

    @POST("lines/{lineId}/bidmultipliers")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    BidMultipliersResponse updateBidMultipliers(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                                @Path("lineId") long lineId,
                                                @Body BidMultipliersRequest bidMultipliers);


    @GET("lines/{lineId}/bidmultipliercap")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    BidMultiplierCapResponse getBidMultiplierCap(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                                 @Path("lineId") long lineId);

    @POST("lines/{lineId}/bidmultipliercap")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    Object createBidMultiplierCap(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                  @Path("lineId") long lineId,
                                  @Body BidMultiplierCap bidMultiplierCap);

    @POST("lines/{lineId}/bidmultipliercap")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    Object updateBidMultiplierCap(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                  @Path("lineId") long lineId,
                                  @Body BidMultiplierCap bidMultiplierCap);

}
