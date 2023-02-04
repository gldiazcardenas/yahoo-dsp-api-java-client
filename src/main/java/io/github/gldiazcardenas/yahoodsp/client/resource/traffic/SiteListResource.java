package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.SiteList;
import io.github.gldiazcardenas.yahoodsp.client.model.SiteListResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.SecuredResource;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
public interface SiteListResource extends SecuredResource {

    String NAME = "sitelists";

    @GET(NAME + "/{siteListId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    SiteListResponse getSiteList(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                 @Path("siteListId") long siteListId);

    @POST(NAME)
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    SiteListResponse createSiteList(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                    @Body SiteList siteList);

    @PUT(NAME + "/{siteListId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    SiteListResponse updateSiteList(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                    @Path("siteListId") long siteListId,
                                    @Body SiteList siteList);

}
