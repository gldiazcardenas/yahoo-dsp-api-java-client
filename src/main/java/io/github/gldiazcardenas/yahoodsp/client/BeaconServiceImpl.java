package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Beacon;
import io.github.gldiazcardenas.yahoodsp.client.model.BeaconResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Beaconi13nCodeResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.BeaconsResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.BeaconResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.BeaconService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.BeaconsFilter;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
class BeaconServiceImpl implements BeaconService {

    private final BeaconResource resource;

    BeaconServiceImpl(BeaconResource resource) {
        this.resource = resource;
    }

    @Override
    public BeaconsResponse getBeacons(Authentication auth, BeaconsFilter filter) throws DspApiException {
        Preconditions.requireNonNull(filter);
        Preconditions.requireNonNull(filter.getAccountId());
        return resource.getBeacons(auth.getAccessToken(),
                filter.getAccountId(),
                filter.getQuery(),
                filter.getPage(),
                filter.getLimit(),
                filter.getSort(),
                filter.getDir());
    }

    @Override
    public BeaconResponse getBeacon(Authentication auth, long beaconId) throws DspApiException {
        return resource.getBeacon(auth.getAccessToken(), beaconId);
    }

    @Override
    public BeaconResponse createBeacon(Authentication auth, Beacon beacon) throws DspApiException {
        return resource.createBeacon(auth.getAccessToken(), beacon);
    }

    @Override
    public BeaconResponse updateBeacon(Authentication auth, Beacon beacon) throws DspApiException {
        Preconditions.requireNonNull(beacon);
        Preconditions.requireNonNull(beacon.getId());
        return resource.updateBeacon(auth.getAccessToken(), beacon.getId(), beacon);
    }

    @Override
    public Beaconi13nCodeResponse getInstrumentationCode(Authentication auth, long beaconId) throws DspApiException {
        return resource.getInstrumentationCode(auth.getAccessToken(), beaconId);
    }
}
