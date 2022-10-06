package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Advertiser;
import io.github.gldiazcardenas.yahoodsp.client.model.AdvertiserBeaconLookupsResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.AdvertiserResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.AdvertisersResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

public interface AdvertiserService {

    AdvertisersResponse getAdvertisers(Authentication auth, AdvertisersFilter filter) throws DspApiException;

    AdvertiserResponse getAdvertiser(Authentication auth, long advertiserId) throws DspApiException;

    AdvertiserResponse createAdvertiser(Authentication auth, Advertiser advertiser) throws DspApiException;

    AdvertiserResponse updateAdvertiser(Authentication auth, Advertiser advertiser) throws DspApiException;

    AdvertiserBeaconLookupsResponse getBeaconLookups(Authentication auth, long advertiserId) throws DspApiException;

}
