package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.reporting.ExtReportingResource;
import io.github.gldiazcardenas.yahoodsp.client.service.reporting.ExtReportingService;

class ExtReportingServiceImpl implements ExtReportingService {

    private final ExtReportingResource resource;

    ExtReportingServiceImpl(ExtReportingResource resource) {
        this.resource = resource;
    }

}
