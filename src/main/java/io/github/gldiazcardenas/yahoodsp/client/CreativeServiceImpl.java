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

import java.util.Optional;

class CreativeServiceImpl implements CreativeService {

    private final CreativeResource resource;

    CreativeServiceImpl(CreativeResource resource) {
        this.resource = resource;
    }

    @Override
    public CreativesResponse getCreatives(Authentication auth, CreativesFilter filter) throws DspApiException {
        Preconditions.requireNonNull(filter);
        Preconditions.requireNonNull(filter.getAccountId());
        return resource.getCreatives(auth.getAccessToken(),
                filter.getAccountId(),
                filter.getName(),
                Optional.ofNullable(filter.getCreativeIds()).map(l -> String.join(",", l)).orElse(null),
                filter.getNonBriefGet(),
                filter.getQuery(),
                filter.getPage(),
                filter.getLimit(),
                filter.getSort(),
                filter.getDir());
    }

    @Override
    public CreativeResponse getCreative(Authentication auth, long creativeId) throws DspApiException {
        return resource.getCreative(auth.getAccessToken(), creativeId);
    }

    @Override
    public CreativeResponse createCreative(Authentication auth, Creative creative) throws DspApiException {
        Preconditions.requireNonNull(creative);
        return resource.createCreative(auth.getAccessToken(), creative);
    }

    @Override
    public CreativeResponse updateCreative(Authentication auth, Creative creative) throws DspApiException {
        Preconditions.requireNonNull(creative);
        Preconditions.requireNonNull(creative.getId());
        return resource.updateCreative(auth.getAccessToken(), creative.getId(), creative);
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
