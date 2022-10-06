package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.ExchangesResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
public interface ExchangeService {

    default ExchangesResponse getExchanges(Authentication auth) throws DspApiException {
        return getExchanges(auth, new ExchangesFilter());
    }

    ExchangesResponse getExchanges(Authentication auth, ExchangesFilter filter) throws DspApiException;

}
