package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AdvertiserResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AdvertiserService;

class AdvertiserServiceImpl implements AdvertiserService {

    private final AdvertiserResource resource;

    AdvertiserServiceImpl(AdvertiserResource resource) {
        this.resource = resource;
    }

}
