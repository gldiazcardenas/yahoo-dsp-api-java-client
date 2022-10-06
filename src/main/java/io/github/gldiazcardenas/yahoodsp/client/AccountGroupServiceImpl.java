package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.AccountGroup;
import io.github.gldiazcardenas.yahoodsp.client.model.AccountGroupResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.AccountGroupsResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AccountGroupResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AccountGroupService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AccountGroupsFilter;

class AccountGroupServiceImpl implements AccountGroupService {

    private final AccountGroupResource resource;

    AccountGroupServiceImpl(AccountGroupResource resource) {
        this.resource = resource;
    }

    @Override
    public AccountGroupsResponse getAccountGroups(Authentication auth, AccountGroupsFilter filter) throws DspApiException {
        return resource.getAccountGroups(auth.getAccessToken(),
                filter.getQuery(),
                filter.getSort(),
                filter.getDir());
    }

    @Override
    public AccountGroupResponse getAccountGroup(Authentication auth, long accountGroupId) throws DspApiException {
        return resource.getAccountGroup(auth.getAccessToken(), accountGroupId);
    }

    @Override
    public AccountGroupResponse createAccountGroup(Authentication auth, AccountGroup accountGroup) throws DspApiException {
        Preconditions.requireNonNull(accountGroup);
        return resource.createAccountGroup(auth.getAccessToken(), accountGroup);
    }

    @Override
    public AccountGroupResponse updateAccountGroup(Authentication auth, AccountGroup accountGroup) throws DspApiException {
        Preconditions.requireNonNull(accountGroup);
        Preconditions.requireNonNull(accountGroup.getId());
        return resource.updateAccountGroup(auth.getAccessToken(), accountGroup.getId(), accountGroup);
    }
}
