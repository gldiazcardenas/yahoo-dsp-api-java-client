package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.RateLimitResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

public interface RateLimitService {

    @Deprecated
    RateLimitResponse get(Authentication auth) throws DspApiException;

    RateLimitResponse getTrafficLimit(Authentication auth) throws DspApiException;

}
