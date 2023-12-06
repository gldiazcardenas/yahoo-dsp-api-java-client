package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Advertiser;
import io.github.gldiazcardenas.yahoodsp.client.model.AdvertiserBeaconLookupsResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.AdvertiserResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.AdvertisersResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AdvertiserResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AdvertiserService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AdvertisersFilter;

import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.accessToken;
import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.requireNonNull;

class AdvertiserServiceImpl implements AdvertiserService {

    private final AdvertiserResource resource;

    AdvertiserServiceImpl(AdvertiserResource resource) {
        this.resource = resource;
    }

    @Override
    public AdvertisersResponse getAdvertisers(Authentication auth, AdvertisersFilter filter) throws DspApiException {
        requireNonNull(filter);
        return resource.getAdvertisers(accessToken(auth),
                filter.getQuery(),
                filter.getPage(),
                filter.getLimit(),
                filter.getSort(),
                filter.getDir());
    }

    @Override
    public AdvertiserResponse getAdvertiser(Authentication auth, long advertiserId) throws DspApiException {
        return resource.getAdvertiser(accessToken(auth), advertiserId);
    }

    @Override
    public AdvertiserResponse createAdvertiser(Authentication auth, Advertiser advertiser) throws DspApiException {
        requireNonNull(advertiser);
        requireNonNull(advertiser.getName());
        return resource.createAdvertiser(accessToken(auth), advertiser);
    }

    @Override
    public AdvertiserResponse updateAdvertiser(Authentication auth, Advertiser advertiser) throws DspApiException {
        requireNonNull(advertiser);
        requireNonNull(advertiser.getId());
        return resource.updateAdvertiser(accessToken(auth), advertiser.getId(), advertiser);
    }

    @Override
    public AdvertiserBeaconLookupsResponse getBeaconLookups(Authentication auth, long advertiserId) throws DspApiException {
        return resource.getBeaconLookups(accessToken(auth), advertiserId);
    }
}
