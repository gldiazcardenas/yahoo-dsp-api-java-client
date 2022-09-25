package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.UserGroupResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.UserGroupService;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
class UserGroupServiceImpl implements UserGroupService {

    private final UserGroupResource resource;

    UserGroupServiceImpl(UserGroupResource resource) {
        this.resource = resource;
    }

}
