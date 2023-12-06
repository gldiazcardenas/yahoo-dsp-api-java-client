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

import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.accessToken;
import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.requireNonNull;

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
        requireNonNull(filter);
        requireNonNull(filter.getAccountId());
        return resource.getBeacons(accessToken(auth),
                filter.getAccountId(),
                filter.getQuery(),
                filter.getPage(),
                filter.getLimit(),
                filter.getSort(),
                filter.getDir());
    }

    @Override
    public BeaconResponse getBeacon(Authentication auth, long beaconId) throws DspApiException {
        return resource.getBeacon(accessToken(auth), beaconId);
    }

    @Override
    public BeaconResponse createBeacon(Authentication auth, Beacon beacon) throws DspApiException {
        requireNonNull(beacon);
        return resource.createBeacon(accessToken(auth), beacon);
    }

    @Override
    public BeaconResponse updateBeacon(Authentication auth, Beacon beacon) throws DspApiException {
        requireNonNull(beacon);
        requireNonNull(beacon.getId());
        return resource.updateBeacon(accessToken(auth), beacon.getId(), beacon);
    }

    @Override
    public Beaconi13nCodeResponse getInstrumentationCode(Authentication auth, long beaconId) throws DspApiException {
        return resource.getInstrumentationCode(accessToken(auth), beaconId);
    }
}
