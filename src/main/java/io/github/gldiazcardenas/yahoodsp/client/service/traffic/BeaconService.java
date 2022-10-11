package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Beacon;
import io.github.gldiazcardenas.yahoodsp.client.model.BeaconResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Beaconi13nCodeResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.BeaconsResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
public interface BeaconService {

    BeaconsResponse getBeacons(Authentication auth, BeaconsFilter filter) throws DspApiException;

    BeaconResponse getBeacon(Authentication auth, long beaconId) throws DspApiException;

    BeaconResponse createBeacon(Authentication auth, Beacon beacon) throws DspApiException;

    BeaconResponse updateBeacon(Authentication auth, Beacon beacon) throws DspApiException;

    Beaconi13nCodeResponse getInstrumentationCode(Authentication auth, long beaconId) throws DspApiException;

}
