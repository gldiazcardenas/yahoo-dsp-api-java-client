package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Dir;
import io.github.gldiazcardenas.yahoodsp.client.model.ExchangesResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.SecuredResource;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
public interface ExchangeResource extends SecuredResource {

    @GET("exchanges")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    ExchangesResponse getExchanges(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                   @Query("query") String query,
                                   @Query("page") Integer page,
                                   @Query("limit") Integer limit,
                                   @Query("sort") String sort,
                                   @Query("dir") Dir dir);

}
