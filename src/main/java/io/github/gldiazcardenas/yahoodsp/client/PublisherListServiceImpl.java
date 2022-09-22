package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.PublisherListResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.PublisherListService;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
class PublisherListServiceImpl implements PublisherListService {

    private final PublisherListResource resource;

    PublisherListServiceImpl(PublisherListResource resource) {
        this.resource = resource;
    }

}
