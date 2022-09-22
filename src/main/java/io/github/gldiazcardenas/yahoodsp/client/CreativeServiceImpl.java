package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Creative;
import io.github.gldiazcardenas.yahoodsp.client.model.CreativeBulkUpload;
import io.github.gldiazcardenas.yahoodsp.client.model.CreativeBulkUploadResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.CreativeResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.CreativesResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.CreativeResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.CreativeService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.CreativesFilter;

class CreativeServiceImpl implements CreativeService {

    private final CreativeResource resource;

    CreativeServiceImpl(CreativeResource resource) {
        this.resource = resource;
    }

    @Override
    public CreativesResponse getCreatives(Authentication auth, CreativesFilter filter) throws DspApiException {
        return null;
    }

    @Override
    public CreativeResponse getCreative(Authentication auth, long creativeId) throws DspApiException {
        return null;
    }

    @Override
    public CreativeResponse createCreative(Authentication auth, Creative creative) throws DspApiException {
        return null;
    }

    @Override
    public CreativeResponse updateCreative(Authentication auth, Creative creative) throws DspApiException {
        Preconditions.requireNonNull(creative);
        Preconditions.requireNonNull(creative.getId());
        return null;
    }

    @Override
    public CreativeBulkUploadResponse bulkUpload(Authentication auth, long accountId,
                                                 CreativeBulkUpload bulkUpload) throws DspApiException {
        Preconditions.requireNonNull(bulkUpload);
        Preconditions.requireNonNull(bulkUpload.getCreatives());
        Preconditions.requireNotEmpty(bulkUpload.getCreatives());
        return resource.bulkUpload(auth.getAccessToken(), accountId, bulkUpload.getCreatives());
    }
}
