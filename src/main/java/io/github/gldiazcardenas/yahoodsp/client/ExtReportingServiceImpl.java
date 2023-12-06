package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportCobStatusResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportRequest;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportStatusResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.reporting.ExtReportingResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.reporting.ExtReportingService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.accessToken;
import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.requireNonNull;
import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.requireNotEmpty;

class ExtReportingServiceImpl implements ExtReportingService {

    private final ExtReportingResource resource;

    ExtReportingServiceImpl(ExtReportingResource resource) {
        this.resource = resource;
    }

    @Override
    public ReportStatusResponse create(Authentication auth, ReportRequest request) throws DspApiException {
        requireNonNull(request);
        return resource.create(accessToken(auth), request);
    }

    @Override
    public ReportStatusResponse getStatus(Authentication auth, String customerReportId) throws DspApiException {
        requireNotEmpty(customerReportId);
        return resource.getStatus(accessToken(auth), customerReportId);
    }

    @Override
    public ReportCobStatusResponse getCobStatus(Authentication auth, long advertiserId, LocalDate day) throws DspApiException {
        requireNonNull(day);
        return resource.getCobStatus(accessToken(auth), advertiserId, DateTimeFormatter.ofPattern("yyyyMMdd").format(day));
    }

}
