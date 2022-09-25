package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.DOOHResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.DOOHService;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
class DOOHServiceImpl implements DOOHService {

    private final DOOHResource resource;

    DOOHServiceImpl(DOOHResource resource) {
        this.resource = resource;
    }

}
