package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Dir;
import io.github.gldiazcardenas.yahoodsp.client.model.Line;
import io.github.gldiazcardenas.yahoodsp.client.model.LineResponse;
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

    @GET("lines")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    LinesResponse getLines(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                           @Query("orderId") long orderId,
                           @Query("query") String query,
                           @Query("page") Integer page,
                           @Query("limit") Integer limit,
                           @Query("sort") String sort,
                           @Query("dir") Dir dir);

    @GET("lines/{lineId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    LineResponse getLine(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                         @Path("lineId") long lineId);

    @POST("lines")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    LineResponse createLine(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                            @Body Line line);

    @PUT("lines/{lineId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    LineResponse updateLine(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                            @Path("lineId") long lineId,
                            @Body Line line);

}
