package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.SiteList;
import io.github.gldiazcardenas.yahoodsp.client.model.SiteListResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.SiteListResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.SiteListService;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
class SiteListServiceImpl implements SiteListService {

    private final SiteListResource resource;

    SiteListServiceImpl(SiteListResource resource) {
        this.resource = resource;
    }

    @Override
    public SiteListResponse getSiteList(Authentication auth, long siteListId) throws DspApiException {
        return resource.getSiteList(auth.getAccessToken(), siteListId);
    }

    @Override
    public SiteListResponse createSiteList(Authentication auth, SiteList siteList) throws DspApiException {
        Preconditions.requireNonNull(siteList);
        return resource.createSiteList(auth.getAccessToken(), siteList);
    }

    @Override
    public SiteListResponse updateSiteList(Authentication auth, SiteList siteList) throws DspApiException {
        Preconditions.requireNonNull(siteList);
        Preconditions.requireNonNull(siteList.getId());
        return resource.updateSiteList(auth.getAccessToken(), siteList.getId(), siteList);
    }
}
