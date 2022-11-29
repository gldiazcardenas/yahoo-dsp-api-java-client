package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.NativeList;
import io.github.gldiazcardenas.yahoodsp.client.model.NativeListResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.NativeListsResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
public interface NativeListService {

    NativeListResponse getNativeList(Authentication auth, long nativeListId) throws DspApiException;

    NativeListResponse createNativeList(Authentication auth, NativeList nativeList) throws DspApiException;

    NativeListResponse updateNativeList(Authentication auth, NativeList nativeList) throws DspApiException;

    NativeListsResponse queryNativeLists(Authentication auth, long accountId, String query) throws DspApiException;

}
