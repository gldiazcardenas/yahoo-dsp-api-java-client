package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Deal;
import io.github.gldiazcardenas.yahoodsp.client.model.DealResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.DealsResponse;
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
public interface DealResource extends SecuredResource {

    String NAME = "deals";

    @GET(NAME)
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    DealsResponse getDeals(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                           @Query("query") String query,
                           @Query("page") Integer page,
                           @Query("limit") Integer limit,
                           @Query("sort") String sort,
                           @Query("dir") Dir dir);

    @GET(NAME + "/{dealId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    DealResponse getDeal(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                         @Path("dealId") long dealId);

    @POST(NAME)
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    DealResponse createDeal(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                            @Body Deal deal);

    @PUT(NAME + "/{dealId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    DealResponse updateDeal(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                            @Path("dealId") long dealId,
                            @Body Deal deal);

}
