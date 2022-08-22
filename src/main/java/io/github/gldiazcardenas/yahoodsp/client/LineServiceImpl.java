package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.LineResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.LineService;

class LineServiceImpl implements LineService {

    private final LineResource resource;

    LineServiceImpl(LineResource resource) {
        this.resource = resource;
    }

}
