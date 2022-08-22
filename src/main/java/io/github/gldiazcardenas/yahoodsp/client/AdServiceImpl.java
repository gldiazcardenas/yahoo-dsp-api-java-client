package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AdResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AdService;

class AdServiceImpl implements AdService {

    private final AdResource resource;

    AdServiceImpl(AdResource resource) {
        this.resource = resource;
    }

}
