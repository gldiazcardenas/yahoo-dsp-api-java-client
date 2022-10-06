package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.AccountGroup;
import io.github.gldiazcardenas.yahoodsp.client.model.AccountGroupResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.AccountGroupsResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

public interface AccountGroupService {

    AccountGroupsResponse getAccountGroups(Authentication auth, AccountGroupsFilter filter) throws DspApiException;

    AccountGroupResponse getAccountGroup(Authentication auth, long accountGroupId) throws DspApiException;

    AccountGroupResponse createAccountGroup(Authentication auth, AccountGroup accountGroup) throws DspApiException;

    AccountGroupResponse updateAccountGroup(Authentication auth, AccountGroup accountGroup) throws DspApiException;

}
