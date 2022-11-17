package io.github.gldiazcardenas.yahoodsp.client.resource.reporting;

import io.github.gldiazcardenas.yahoodsp.client.model.ReportCobStatusResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportRequest;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportStatusResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.SecuredResource;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ExtReportingResource extends SecuredResource {

    @POST("extreport")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    ReportStatusResponse create(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                @Body ReportRequest request);

    @GET("extreport/{customerReportId}")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    ReportStatusResponse getStatus(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                   @Path("customerReportId") String customerReportId);


    @GET("extreport/cob")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    ReportCobStatusResponse getCobStatus(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken,
                                         @Query("advertiserId") long advertiserId,
                                         @Query("day") String day);

}
