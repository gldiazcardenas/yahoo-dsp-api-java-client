package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.reporting.ExtReportResource;
import io.github.gldiazcardenas.yahoodsp.client.service.reporting.ExtReportService;

class ExtReportServiceImpl implements ExtReportService {

    private final ExtReportResource resource;

    ExtReportServiceImpl(ExtReportResource resource) {
        this.resource = resource;
    }

}
