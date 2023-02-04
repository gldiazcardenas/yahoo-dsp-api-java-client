package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Campaign;
import io.github.gldiazcardenas.yahoodsp.client.model.CampaignResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.CampaignsResponse;
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

public interface CampaignResource extends SecuredResource {

    String NAME = "campaigns";

    @GET(NAME)
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    CampaignsResponse getCampaigns(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                   @Query("accountId") long accountId,
                                   @Query("query") String query,
                                   @Query("page") Integer page,
                                   @Query("limit") Integer limit,
                                   @Query("sort") String sort,
                                   @Query("dir") Dir dir);

    @GET(NAME + "/{campaignId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    CampaignResponse getCampaign(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                 @Path("campaignId") long campaignId);

    @POST(NAME)
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    CampaignResponse createCampaign(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                    @Body Campaign campaign);

    @PUT(NAME + "/{campaignId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    CampaignResponse updateCampaign(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                    @Path("campaignId") long campaignId,
                                    @Body Campaign campaign);


}
