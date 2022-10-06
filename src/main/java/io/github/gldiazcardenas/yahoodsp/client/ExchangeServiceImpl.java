package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.ExchangesResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.ExchangeResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.ExchangeService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.ExchangesFilter;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
class ExchangeServiceImpl implements ExchangeService {

    private final ExchangeResource resource;

    ExchangeServiceImpl(ExchangeResource resource) {
        this.resource = resource;
    }

    @Override
    public ExchangesResponse getExchanges(Authentication auth, ExchangesFilter filter) throws DspApiException {
        return resource.getExchanges(auth.getAccessToken(),
                filter.getQuery(),
                filter.getPage(),
                filter.getLimit(),
                filter.getSort(),
                filter.getDir());
    }
}
