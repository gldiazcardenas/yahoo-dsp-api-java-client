package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Ad;
import io.github.gldiazcardenas.yahoodsp.client.model.AdResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.AdsResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AdResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AdService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AdsFilter;

import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.accessToken;
import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.requireNonNull;

class AdServiceImpl implements AdService {

    private final AdResource resource;

    AdServiceImpl(AdResource resource) {
        this.resource = resource;
    }

    @Override
    public AdsResponse getAds(Authentication auth, AdsFilter filter) throws DspApiException {
        requireNonNull(filter);
        requireNonNull(filter.getLineId());
        return resource.getAds(accessToken(auth),
                filter.getLineId(),
                filter.getQuery(),
                filter.getPage(),
                filter.getLimit(),
                filter.getSort(),
                filter.getDir());
    }

    @Override
    public AdResponse getAd(Authentication auth, long adId) throws DspApiException {
        return resource.getAd(accessToken(auth), adId);
    }

    @Override
    public AdResponse createAd(Authentication auth, Ad ad) throws DspApiException {
        requireNonNull(ad);
        requireNonNull(ad.getLineId());
        return resource.createAd(accessToken(auth), ad);
    }

    @Override
    public AdResponse updateAd(Authentication auth, Ad ad) throws DspApiException {
        requireNonNull(ad);
        requireNonNull(ad.getId());
        return resource.updateAd(accessToken(auth), ad.getId(), ad);
    }
}
