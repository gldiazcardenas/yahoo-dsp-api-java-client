package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.NativeList;
import io.github.gldiazcardenas.yahoodsp.client.model.NativeListResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.NativeListsResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.NativeListResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.NativeListService;

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
        return resource.getNativeList(auth.getAccessToken(), nativeListId);
    }

    @Override
    public NativeListResponse createNativeList(Authentication auth, NativeList nativeList) throws DspApiException {
        Preconditions.requireNonNull(nativeList);
        return resource.createNativeList(auth.getAccessToken(), nativeList);
    }

    @Override
    public NativeListResponse updateNativeList(Authentication auth, NativeList nativeList) throws DspApiException {
        Preconditions.requireNonNull(nativeList);
        Preconditions.requireNonNull(nativeList.getId());
        return resource.updateNativeList(auth.getAccessToken(), nativeList.getId(), nativeList);
    }

    @Override
    public NativeListsResponse queryNativeLists(Authentication auth, long accountId, String query) throws DspApiException {
        return resource.queryNativeLists(auth.getAccessToken(), accountId, query);
    }

}
