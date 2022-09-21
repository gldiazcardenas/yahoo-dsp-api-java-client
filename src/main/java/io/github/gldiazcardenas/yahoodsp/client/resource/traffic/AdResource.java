package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Ad;
import io.github.gldiazcardenas.yahoodsp.client.model.AdResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.AdsResponse;
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

public interface AdResource extends SecuredResource {

    @GET("ads")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    AdsResponse getAds(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                       @Query("lineId") long lineId,
                       @Query("query") String query,
                       @Query("page") Integer page,
                       @Query("limit") Integer limit,
                       @Query("sort") String sort,
                       @Query("dir") Dir dir);

    @GET("ads/{adId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    AdResponse getAd(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                     @Path("adId") long adId);

    @POST("ads")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    AdResponse createAd(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                        @Body Ad ad);

    @PUT("ads/{adId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    AdResponse updateAd(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                        @Path("adId") long adId,
                        @Body Ad ad);

}
