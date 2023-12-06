package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.SeatsResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.SeatResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.SeatService;

import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.accessToken;

class SeatServiceImpl implements SeatService {

    private final SeatResource resource;

    SeatServiceImpl(SeatResource resource) {
        this.resource = resource;
    }

    @Override
    public SeatsResponse getAll(Authentication auth) throws DspApiException {
        return resource.getAll(accessToken(auth));
    }

}
