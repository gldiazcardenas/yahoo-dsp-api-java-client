package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Ad;
import io.github.gldiazcardenas.yahoodsp.client.model.AdResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.AdsResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AdResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AdService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AdsFilter;

class AdServiceImpl implements AdService {

    private final AdResource resource;

    AdServiceImpl(AdResource resource) {
        this.resource = resource;
    }

    @Override
    public AdsResponse getAds(Authentication auth, AdsFilter filter) throws DspApiException {
        Preconditions.requireNonNull(filter);
        Preconditions.requireNonNull(filter.getLineId());
        return resource.getAds(auth.getAccessToken(),
                filter.getLineId(),
                filter.getQuery(),
                filter.getPage(),
                filter.getLimit(),
                filter.getSort(),
                filter.getDir());
    }

    @Override
    public AdResponse getAd(Authentication auth, long adId) throws DspApiException {
        return resource.getAd(auth.getAccessToken(), adId);
    }

    @Override
    public AdResponse createAd(Authentication auth, Ad ad) throws DspApiException {
        Preconditions.requireNonNull(ad);
        Preconditions.requireNonNull(ad.getLineId());
        return resource.createAd(auth.getAccessToken(), ad);
    }

    @Override
    public AdResponse updateAd(Authentication auth, Ad ad) throws DspApiException {
        Preconditions.requireNonNull(ad);
        Preconditions.requireNonNull(ad.getId());
        return resource.updateAd(auth.getAccessToken(), ad.getId(), ad);
    }
}
