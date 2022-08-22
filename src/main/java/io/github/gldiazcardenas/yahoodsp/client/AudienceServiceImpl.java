package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AudienceResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AudienceService;

class AudienceServiceImpl implements AudienceService {

    private final AudienceResource resource;

    AudienceServiceImpl(AudienceResource resource) {
        this.resource = resource;
    }

}
