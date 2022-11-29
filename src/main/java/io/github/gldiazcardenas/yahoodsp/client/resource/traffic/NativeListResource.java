package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.NativeList;
import io.github.gldiazcardenas.yahoodsp.client.model.NativeListResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.NativeListsResponse;
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
public interface NativeListResource extends SecuredResource {

    @GET("nativelists/{nativeListId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    NativeListResponse getNativeList(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                     @Path("nativeListId") long nativeListId);

    @POST("nativelists")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    NativeListResponse createNativeList(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                        @Body NativeList nativeList);

    @PUT("nativelists/{nativeListId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    NativeListResponse updateNativeList(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                        @Path("nativeListId") long nativeListId,
                                        @Body NativeList nativeList);

    @GET("nativelists")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    NativeListsResponse queryNativeLists(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                        @Query("accountId") long accountId,
                                        @Query("query") String query);

}
