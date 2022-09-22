package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.PackageResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.PackageService;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
class PackageServiceImpl implements PackageService {

    private final PackageResource resource;

    PackageServiceImpl(PackageResource resource) {
        this.resource = resource;
    }

}
