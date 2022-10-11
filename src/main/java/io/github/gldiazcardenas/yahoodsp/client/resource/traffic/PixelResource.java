package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Dir;
import io.github.gldiazcardenas.yahoodsp.client.model.Pixel;
import io.github.gldiazcardenas.yahoodsp.client.model.PixelResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.PixelsResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.SecuredResource;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
public interface PixelResource extends SecuredResource {

    @GET("pixels")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    PixelsResponse getPixels(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                              @Query("accountId") long accountId,
                              @Query("query") String query,
                              @Query("page") Integer page,
                              @Query("limit") Integer limit,
                              @Query("sort") String sort,
                              @Query("dir") Dir dir);

    @GET("pixels/{pixelId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    PixelResponse getPixel(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                           @Path("pixelId") long pixelId,
                           @Query("accountId") long accountId);

    @POST("pixels")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    PixelResponse createPixel(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                              @Body Pixel pixel);

}
