package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.SiteList;
import io.github.gldiazcardenas.yahoodsp.client.model.SiteListResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
public interface SiteListService {

    SiteListResponse getSiteList(Authentication auth, long siteListId) throws DspApiException;

    SiteListResponse createSiteList(Authentication auth, SiteList siteList) throws DspApiException;

    SiteListResponse updateSiteList(Authentication auth, SiteList siteList) throws DspApiException;

}
