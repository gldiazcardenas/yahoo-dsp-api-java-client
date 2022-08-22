package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.ContextualResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.ContextualService;

class ContextualServiceImpl implements ContextualService {

    private final ContextualResource resource;

    ContextualServiceImpl(ContextualResource resource) {
        this.resource = resource;
    }

}
