package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.PixelResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.PixelService;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
class PixelServiceImpl implements PixelService {

    private final PixelResource resource;

    PixelServiceImpl(PixelResource resource) {
        this.resource = resource;
    }

}
