package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.AccountGroup;
import io.github.gldiazcardenas.yahoodsp.client.model.AccountGroupResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.AccountGroupsResponse;
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

public interface AccountGroupResource extends SecuredResource {

    @GET("accountgroups")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    AccountGroupsResponse getAccountGroups(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                           @Query("query") String query,
                                           @Query("sort") String sort,
                                           @Query("dir") Dir dir);

    @GET("accountgroups/{accountGroupId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    AccountGroupResponse getAccountGroup(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                         @Path("accountGroupId") long accountGroupId);

    @POST("accountgroups")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    AccountGroupResponse createAccountGroup(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                            @Body AccountGroup accountGroup);

    @PUT("accountgroups/{accountGroupId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    AccountGroupResponse updateAccountGroup(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                            @Path("accountGroupId") long accountGroupId,
                                            @Body AccountGroup accountGroup);

}
