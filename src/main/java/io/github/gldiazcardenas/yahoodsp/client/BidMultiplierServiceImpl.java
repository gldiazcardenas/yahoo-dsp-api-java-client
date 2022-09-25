package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.BidMultiplierResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.BidMultiplierService;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
class BidMultiplierServiceImpl implements BidMultiplierService {

    private final BidMultiplierResource resource;

    BidMultiplierServiceImpl(BidMultiplierResource resource) {
        this.resource = resource;
    }

}
