package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.AuthenticationResource;
import io.github.gldiazcardenas.yahoodsp.client.service.AuthenticationService;

class AuthenticationServiceImpl implements AuthenticationService {

    private final AuthenticationResource resource;

    AuthenticationServiceImpl(AuthenticationResource resource) {
        this.resource = resource;
    }

}
