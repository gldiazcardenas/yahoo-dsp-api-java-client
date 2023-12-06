package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.AccountGroup;
import io.github.gldiazcardenas.yahoodsp.client.model.AccountGroupResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.AccountGroupsResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AccountGroupResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AccountGroupService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AccountGroupsFilter;

import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.accessToken;
import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.requireNonNull;

class AccountGroupServiceImpl implements AccountGroupService {

    private final AccountGroupResource resource;

    AccountGroupServiceImpl(AccountGroupResource resource) {
        this.resource = resource;
    }

    @Override
    public AccountGroupsResponse getAccountGroups(Authentication auth, AccountGroupsFilter filter) throws DspApiException {
        requireNonNull(filter);
        return resource.getAccountGroups(accessToken(auth),
                filter.getQuery(),
                filter.getSort(),
                filter.getDir());
    }

    @Override
    public AccountGroupResponse getAccountGroup(Authentication auth, long accountGroupId) throws DspApiException {
        return resource.getAccountGroup(accessToken(auth), accountGroupId);
    }

    @Override
    public AccountGroupResponse createAccountGroup(Authentication auth, AccountGroup accountGroup) throws DspApiException {
        requireNonNull(accountGroup);
        return resource.createAccountGroup(accessToken(auth), accountGroup);
    }

    @Override
    public AccountGroupResponse updateAccountGroup(Authentication auth, AccountGroup accountGroup) throws DspApiException {
        requireNonNull(accountGroup);
        requireNonNull(accountGroup.getId());
        return resource.updateAccountGroup(accessToken(auth), accountGroup.getId(), accountGroup);
    }
}
