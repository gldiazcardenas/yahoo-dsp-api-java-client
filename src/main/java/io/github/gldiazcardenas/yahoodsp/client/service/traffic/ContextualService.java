package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Contextual;
import io.github.gldiazcardenas.yahoodsp.client.model.ContextualCategoriesResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.ContextualResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.ContextualsResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.TaxonomyType;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

public interface ContextualService {

    ContextualCategoriesResponse getContextualCategories(Authentication auth, TaxonomyType taxonomyType) throws DspApiException;

    ContextualResponse getContextualById(Authentication auth, long contextualId) throws DspApiException;

    ContextualsResponse getContextuals(Authentication auth, ContextualsFilter filter) throws DspApiException;

    ContextualResponse createContextual(Authentication auth, Contextual contextual) throws DspApiException;

    ContextualResponse updateContextual(Authentication auth, Contextual contextual) throws DspApiException;

}
