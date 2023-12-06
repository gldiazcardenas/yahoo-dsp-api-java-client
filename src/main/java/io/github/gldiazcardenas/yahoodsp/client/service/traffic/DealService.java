package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Deal;
import io.github.gldiazcardenas.yahoodsp.client.model.DealResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.DealsResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
public interface DealService {

    default DealsResponse getDeals(Authentication auth) throws DspApiException {
        return getDeals(auth, new DealsFilter());
    }

    DealsResponse getDeals(Authentication auth, DealsFilter filter) throws DspApiException;

    DealResponse getDeal(Authentication auth, long dealId) throws DspApiException;

    DealResponse createDeal(Authentication auth, Deal deal) throws DspApiException;

    DealResponse updateDeal(Authentication auth, Deal deal) throws DspApiException;

}
