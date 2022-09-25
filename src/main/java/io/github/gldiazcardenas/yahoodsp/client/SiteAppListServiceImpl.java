package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.SiteAppListResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.SiteAppListService;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
class SiteAppListServiceImpl implements SiteAppListService {

    private final SiteAppListResource resource;

    SiteAppListServiceImpl(SiteAppListResource resource) {
        this.resource = resource;
    }

}
