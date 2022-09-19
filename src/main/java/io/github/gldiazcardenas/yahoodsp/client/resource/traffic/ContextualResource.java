package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Contextual;
import io.github.gldiazcardenas.yahoodsp.client.model.ContextualCategoriesResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.ContextualResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.ContextualsResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.TaxonomyType;
import io.github.gldiazcardenas.yahoodsp.client.resource.SecuredResource;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ContextualResource extends SecuredResource {

    @GET("contextuals/categories/{taxonomyType}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    ContextualCategoriesResponse getContextualCategories(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                                         @Path("taxonomyType") TaxonomyType taxonomyType);

    @GET("contextuals/{contextualId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    ContextualResponse getContextualById(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                         @Path("contextualId") long contextualId);

    @GET("contextuals")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    ContextualsResponse getContextuals(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                       @Query("seatId") Long seatId,
                                       @Query("accountId") Long accountId,
                                       @Query("query") String query,
                                       @Query("page") Integer page,
                                       @Query("limit") Integer limit,
                                       @Query("sort") String sort,
                                       @Query("dir") String dir);

    @POST("contextuals")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    ContextualResponse createContextual(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                        @Body Contextual contextual);


    @PUT("contextuals/{contextualId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    ContextualResponse updateContextual(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                        @Path("contextualId") long contextualId,
                                        @Body Contextual contextual);


}
