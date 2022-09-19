package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.GeosResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.SegmentType;
import io.github.gldiazcardenas.yahoodsp.client.model.SegmentsResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.SecuredResource;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface TargetingResource extends SecuredResource {

    @GET("targeting/geos")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    GeosResponse getGeos(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                         @Query("query") String query,
                         @Query("countryCode") String countryCode,
                         @Query("sort") String sort,
                         @Query("dir") String dir);

    @GET("targeting/countries")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    GeosResponse getCountries(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                              @Query("query") String query);


    @GET("targeting/availablesegments/search")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    SegmentsResponse getAvailableSegments(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                          @Query("accountId") long accountId,
                                          @Query("query") String query,
                                          @Query("country_codes") String countryCodesCsv,
                                          @Query("lineId") Long lineId,
                                          @Query("limit") Integer limit,
                                          @Query("page") Integer page,
                                          @Query("type") SegmentType type,
                                          @Query("minAudienceSize") Integer minAudienceSize,
                                          @Query("maxAudienceSize") String maxAudienceSize);


}
