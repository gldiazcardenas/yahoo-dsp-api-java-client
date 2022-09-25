package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.ExchangeResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.ExchangeService;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
class ExchangeServiceImpl implements ExchangeService {

    private final ExchangeResource resource;

    ExchangeServiceImpl(ExchangeResource resource) {
        this.resource = resource;
    }

}
