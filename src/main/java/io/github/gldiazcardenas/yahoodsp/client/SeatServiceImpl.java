package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Seats;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.SeatResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.SeatService;

import static io.github.gldiazcardenas.yahoodsp.client.service.AuthenticationService.DEFAULT_AUTH_METHOD;

class SeatServiceImpl implements SeatService {

    private final SeatResource resource;

    SeatServiceImpl(SeatResource resource) {
        this.resource = resource;
    }

    @Override
    public Seats getAll(Authentication auth) throws DspApiException {
        return resource.getAll(DEFAULT_AUTH_METHOD, auth.getAccessToken()).getResponse();
    }

}
