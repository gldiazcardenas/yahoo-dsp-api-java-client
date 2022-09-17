package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Contextual;
import io.github.gldiazcardenas.yahoodsp.client.model.ContextualCategoriesResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.ContextualResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.ContextualsResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.TaxonomyType;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.ContextualResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.ContextualService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.ContextualsFilter;

class ContextualServiceImpl implements ContextualService {

    private final ContextualResource resource;

    ContextualServiceImpl(ContextualResource resource) {
        this.resource = resource;
    }

    @Override
    public ContextualCategoriesResponse getContextualCategories(Authentication auth,
                                                                TaxonomyType taxonomyType) throws DspApiException {
        return resource.getContextualCategories(auth.getAccessToken(), taxonomyType);
    }

    @Override
    public ContextualResponse getContextualById(Authentication auth, long contextualId) throws DspApiException {
        return resource.getContextualById(auth.getAccessToken(), contextualId);
    }

    @Override
    public ContextualsResponse getContextuals(Authentication auth, ContextualsFilter filter) throws DspApiException {
        Preconditions.requireNonNull(filter);
        Preconditions.requireOneNonNull("seatId or accountId is required", filter.getSeatId(), filter.getAccountId());
        return resource.getContextuals(auth.getAccessToken(),
                filter.getSeatId(),
                filter.getAccountId(),
                filter.getQuery(),
                filter.getPage(),
                filter.getLimit(),
                filter.getSort(),
                filter.getDir());
    }

    @Override
    public ContextualResponse createContextual(Authentication auth, Contextual contextual) throws DspApiException {
        return resource.createContextual(auth.getAccessToken(), contextual);
    }

    @Override
    public ContextualResponse updateContextual(Authentication auth, Contextual contextual) throws DspApiException {
        return resource.updateContextual(auth.getAccessToken(), contextual.getId(), contextual);
    }
}
