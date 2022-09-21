package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Ad;
import io.github.gldiazcardenas.yahoodsp.client.model.AdResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.AdsResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

public interface AdService {

    AdsResponse getAds(Authentication auth, AdsFilter filter) throws DspApiException;

    AdResponse getAd(Authentication auth, long adId) throws DspApiException;

    AdResponse createAd(Authentication auth, Ad ad) throws DspApiException;

    AdResponse updateAd(Authentication auth, Ad ad) throws DspApiException;

}
