package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AccountGroupResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AccountGroupService;

class AccountGroupServiceImpl implements AccountGroupService {

    private final AccountGroupResource resource;

    AccountGroupServiceImpl(AccountGroupResource resource) {
        this.resource = resource;
    }

}
