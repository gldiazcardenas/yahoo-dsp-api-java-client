package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Creative;
import io.github.gldiazcardenas.yahoodsp.client.model.CreativeBulkUploadResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.CreativeResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.CreativesResponse;
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

import java.util.List;

public interface CreativeResource extends SecuredResource {

    String NAME = "creatives";

    @GET(NAME)
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    CreativesResponse getCreatives(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                   @Query("accountId") long accountId,
                                   @Query("name") String name,
                                   @Query("creativeIds") String creativeIds,
                                   @Query("nonBriefGet") Boolean nonBriefGet,
                                   @Query("query") String query,
                                   @Query("page") Integer page,
                                   @Query("limit") Integer limit,
                                   @Query("sort") String sort,
                                   @Query("dir") Dir dir);

    @GET(NAME + "/{creativeId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    CreativeResponse getCreative(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                 @Path("creativeId") long creativeId);

    @POST(NAME)
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    CreativeResponse createCreative(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                    @Body Creative creative);

    @PUT(NAME + "/{creativeId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    CreativeResponse updateCreative(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                    @Path("creativeId") long creativeId,
                                    @Body Creative creative);

    @POST(NAME + "/bulkupload")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    CreativeBulkUploadResponse bulkUpload(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                          @Query("accountId") long accountId,
                                          @Body List<Creative> creatives);

}
