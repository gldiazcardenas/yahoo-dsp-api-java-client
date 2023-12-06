package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Deal;
import io.github.gldiazcardenas.yahoodsp.client.model.DealResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.DealsResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.DealResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.DealService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.DealsFilter;

import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.accessToken;
import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.requireNonNull;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
class DealServiceImpl implements DealService {

    private final DealResource resource;

    DealServiceImpl(DealResource resource) {
        this.resource = resource;
    }

    @Override
    public DealsResponse getDeals(Authentication auth, DealsFilter filter) throws DspApiException {
        requireNonNull(filter);
        return resource.getDeals(accessToken(auth),
                filter.getQuery(),
                filter.getPage(),
                filter.getLimit(),
                filter.getSort(),
                filter.getDir());
    }

    @Override
    public DealResponse getDeal(Authentication auth, long dealId) throws DspApiException {
        return resource.getDeal(accessToken(auth), dealId);
    }

    @Override
    public DealResponse createDeal(Authentication auth, Deal deal) throws DspApiException {
        requireNonNull(deal);
        return resource.createDeal(accessToken(auth), deal);
    }

    @Override
    public DealResponse updateDeal(Authentication auth, Deal deal) throws DspApiException {
        requireNonNull(deal);
        requireNonNull(deal.getId());
        return resource.updateDeal(accessToken(auth), deal.getId(), deal);
    }
}
