package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.TargetingResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.TargetingService;

class TargetingServiceImpl implements TargetingService {

    private final TargetingResource resource;

    TargetingServiceImpl(TargetingResource resource) {
        this.resource = resource;
    }

}
