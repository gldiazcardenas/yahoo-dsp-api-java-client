package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.BeaconResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.BeaconService;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
class BeaconServiceImpl implements BeaconService {

    private final BeaconResource resource;

    BeaconServiceImpl(BeaconResource resource) {
        this.resource = resource;
    }

}
