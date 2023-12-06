package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.NativeList;
import io.github.gldiazcardenas.yahoodsp.client.model.NativeListResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.NativeListsResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.NativeListResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.NativeListService;

import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.accessToken;
import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.requireNonNull;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
class NativeListServiceImpl implements NativeListService {

    private final NativeListResource resource;

    NativeListServiceImpl(NativeListResource resource) {
        this.resource = resource;
    }

    @Override
    public NativeListResponse getNativeList(Authentication auth, long nativeListId) throws DspApiException {
        return resource.getNativeList(accessToken(auth), nativeListId);
    }

    @Override
    public NativeListResponse createNativeList(Authentication auth, NativeList nativeList) throws DspApiException {
        requireNonNull(nativeList);
        return resource.createNativeList(accessToken(auth), nativeList);
    }

    @Override
    public NativeListResponse updateNativeList(Authentication auth, NativeList nativeList) throws DspApiException {
        requireNonNull(nativeList);
        requireNonNull(nativeList.getId());
        return resource.updateNativeList(accessToken(auth), nativeList.getId(), nativeList);
    }

    @Override
    public NativeListsResponse queryNativeLists(Authentication auth, long accountId, String query) throws DspApiException {
        return resource.queryNativeLists(accessToken(auth), accountId, query);
    }

}
