package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.RateLimitResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.RateLimitResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.RateLimitService;

import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.accessToken;

public class RateLimitServiceImpl implements RateLimitService {

    private final RateLimitResource resource;

    RateLimitServiceImpl(RateLimitResource resource) {
        this.resource = resource;
    }

    @Override
    public RateLimitResponse get(Authentication auth) throws DspApiException {
        return getTrafficLimit(auth);
    }

    @Override
    public RateLimitResponse getTrafficLimit(Authentication auth) throws DspApiException {
        return resource.getTrafficLimit(accessToken(auth));
    }

}
