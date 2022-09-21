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

class AdvertiserServiceImpl implements AdvertiserService {

    private final AdvertiserResource resource;

    AdvertiserServiceImpl(AdvertiserResource resource) {
        this.resource = resource;
    }


    @Override
    public AdvertisersResponse getAdvertisers(Authentication auth, AdvertisersFilter filter) throws DspApiException {
        Preconditions.requireNonNull(filter);
        return resource.getAdvertisers(auth.getAccessToken(),
                filter.getQuery(),
                filter.getPage(),
                filter.getLimit(),
                filter.getSort(),
                filter.getDir());
    }

    @Override
    public AdvertiserResponse getAdvertiser(Authentication auth, long advertiserId) throws DspApiException {
        return resource.getAdvertiser(auth.getAccessToken(), advertiserId);
    }

    @Override
    public AdvertiserResponse createAdvertiser(Authentication auth, Advertiser advertiser) throws DspApiException {
        Preconditions.requireNonNull(advertiser);
        Preconditions.requireNonNull(advertiser.getName());
        return resource.createAdvertiser(auth.getAccessToken(), advertiser);
    }

    @Override
    public AdvertiserResponse updateAdvertiser(Authentication auth, Advertiser advertiser) throws DspApiException {
        Preconditions.requireNonNull(advertiser);
        Preconditions.requireNonNull(advertiser.getId());
        return resource.updateAdvertiser(auth.getAccessToken(), advertiser.getId(), advertiser);
    }

    @Override
    public AdvertiserBeaconLookupsResponse getBeaconLookups(Authentication auth, long advertiserId) throws DspApiException {
        return resource.getBeaconLookups(auth.getAccessToken(), advertiserId);
    }
}
