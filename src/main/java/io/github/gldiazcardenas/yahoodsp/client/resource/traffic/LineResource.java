package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.BidMultiplierCap;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultiplierCapResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultipliersRequest;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultipliersResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Dir;
import io.github.gldiazcardenas.yahoodsp.client.model.Line;
import io.github.gldiazcardenas.yahoodsp.client.model.LineResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.LineTargetingRequest;
import io.github.gldiazcardenas.yahoodsp.client.model.LineTargetingResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.LinesResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.SecuredResource;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface LineResource extends SecuredResource {

    String NAME = "lines";

    @GET(NAME)
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    LinesResponse getLines(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                           @Query("orderId") long orderId,
                           @Query("query") String query,
                           @Query("page") Integer page,
                           @Query("limit") Integer limit,
                           @Query("sort") String sort,
                           @Query("dir") Dir dir);

    @GET(NAME + "/{lineId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    LineResponse getLine(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                         @Path("lineId") long lineId);

    @POST(NAME)
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    LineResponse createLine(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                            @Body Line line);

    @PUT(NAME + "/{lineId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    LineResponse updateLine(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                            @Path("lineId") long lineId,
                            @Body Line line);

    @GET(NAME + "/{lineId}/targeting")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    LineTargetingResponse getTargeting(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                       @Path("lineId") long lineId);

    @POST(NAME + "/{lineId}/targeting")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    LineTargetingResponse updateTargeting(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                          @Path("lineId") long lineId,
                                          @Body LineTargetingRequest targeting);

    @GET(NAME + "/{lineId}/bidmultipliers")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    BidMultipliersResponse getBidMultipliers(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                             @Path("lineId") long lineId);

    @POST(NAME + "/{lineId}/bidmultipliers")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    BidMultipliersResponse updateBidMultipliers(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                                @Path("lineId") long lineId,
                                                @Body BidMultipliersRequest bidMultipliers);

    @GET(NAME + "/{lineId}/bidmultipliercap")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    BidMultiplierCapResponse getBidMultiplierCap(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                                 @Path("lineId") long lineId);

    @POST(NAME + "/{lineId}/bidmultipliercap")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    Object createBidMultiplierCap(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                  @Path("lineId") long lineId,
                                  @Body BidMultiplierCap bidMultiplierCap);

    @POST(NAME + "/{lineId}/bidmultipliercap")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    Object updateBidMultiplierCap(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                  @Path("lineId") long lineId,
                                  @Body BidMultiplierCap bidMultiplierCap);

}
