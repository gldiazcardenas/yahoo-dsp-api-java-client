package io.github.gldiazcardenas.yahoodsp.client.service.reporting;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportCobStatusResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportRequest;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportStatusResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

import java.time.LocalDate;

public interface ExtReportingService {

    ReportStatusResponse create(Authentication auth, ReportRequest request) throws DspApiException;

    ReportStatusResponse getStatus(Authentication auth, String customerReportId) throws DspApiException;

    ReportCobStatusResponse getCobStatus(Authentication auth, long advertiserId, LocalDate day) throws DspApiException;

}
