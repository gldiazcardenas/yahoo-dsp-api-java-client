package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Creative;
import io.github.gldiazcardenas.yahoodsp.client.model.CreativeBulkUpload;
import io.github.gldiazcardenas.yahoodsp.client.model.CreativeBulkUploadResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.CreativeResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.CreativesResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

public interface CreativeService {

    CreativesResponse getCreatives(Authentication auth, CreativesFilter filter) throws DspApiException;

    CreativeResponse getCreative(Authentication auth, long creativeId) throws DspApiException;

    CreativeResponse createCreative(Authentication auth, Creative creative) throws DspApiException;

    CreativeResponse updateCreative(Authentication auth, Creative creative) throws DspApiException;

    CreativeBulkUploadResponse bulkUpload(Authentication auth, long accountId, CreativeBulkUpload bulkUpload) throws DspApiException;

}
