package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.SeatResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.SeatService;

class SeatServiceImpl implements SeatService {

    private final SeatResource resource;

    SeatServiceImpl(SeatResource resource) {
        this.resource = resource;
    }

}
