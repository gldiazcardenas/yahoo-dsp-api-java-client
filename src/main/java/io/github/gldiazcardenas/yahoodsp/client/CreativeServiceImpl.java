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

import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.accessToken;
import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.requireNonNull;

class CreativeServiceImpl implements CreativeService {

    private final CreativeResource resource;

    CreativeServiceImpl(CreativeResource resource) {
        this.resource = resource;
    }

    @Override
    public CreativesResponse getCreatives(Authentication auth, CreativesFilter filter) throws DspApiException {
        requireNonNull(filter);
        requireNonNull(filter.getAccountId());
        return resource.getCreatives(accessToken(auth),
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
        return resource.getCreative(accessToken(auth), creativeId);
    }

    @Override
    public CreativeResponse createCreative(Authentication auth, Creative creative) throws DspApiException {
        requireNonNull(creative);
        return resource.createCreative(accessToken(auth), creative);
    }

    @Override
    public CreativeResponse updateCreative(Authentication auth, Creative creative) throws DspApiException {
        requireNonNull(creative);
        requireNonNull(creative.getId());
        return resource.updateCreative(accessToken(auth), creative.getId(), creative);
    }

    @Override
    public CreativeBulkUploadResponse bulkUpload(Authentication auth,
                                                 long accountId,
                                                 CreativeBulkUpload bulkUpload) throws DspApiException {
        requireNonNull(bulkUpload);
        requireNonNull(bulkUpload.getCreatives());
        Preconditions.requireNotEmpty(bulkUpload.getCreatives());
        return resource.bulkUpload(accessToken(auth), accountId, bulkUpload.getCreatives());
    }
}
