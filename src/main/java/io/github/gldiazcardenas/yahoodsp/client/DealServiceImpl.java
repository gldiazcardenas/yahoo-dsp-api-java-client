package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.DealResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.DealService;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
class DealServiceImpl implements DealService {

    private final DealResource resource;

    DealServiceImpl(DealResource resource) {
        this.resource = resource;
    }

}
