package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.CreativeResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.CreativeService;

class CreativeServiceImpl implements CreativeService {

    private final CreativeResource resource;

    CreativeServiceImpl(CreativeResource resource) {
        this.resource = resource;
    }

}
