package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.AdBehaviorTypesResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.CreativeMimeTypesResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.CurrencyTypesResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.DictionaryTypesResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.LanguagesResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.LayoutsResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.PremiumNativeCountdownPrefixesResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.PremiumNativeLanguagesResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.PremiumNativePredefinedCtaLabelsResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.TargetingTypesResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.TimezonesResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.DataDictionaryResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.DataDictionaryService;

import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.accessToken;

class DataDictionaryServiceImpl implements DataDictionaryService {

    private final DataDictionaryResource resource;

    DataDictionaryServiceImpl(DataDictionaryResource resource) {
        this.resource = resource;
    }

    @Override
    public DictionaryTypesResponse getTypes(Authentication auth) throws DspApiException {
        return resource.getTypes(accessToken(auth));
    }

    @Override
    public LayoutsResponse getLayouts(Authentication auth) throws DspApiException {
        return resource.getLayouts(accessToken(auth));
    }

    @Override
    public CreativeMimeTypesResponse getCreativeMimeTypes(Authentication auth) throws DspApiException {
        return resource.getCreativeMimeTypes(accessToken(auth));
    }

    @Override
    public CurrencyTypesResponse getCurrencyTypes(Authentication auth) throws DspApiException {
        return resource.getCurrencyTypes(accessToken(auth));
    }

    @Override
    public LanguagesResponse getLanguages(Authentication auth) throws DspApiException {
        return resource.getLanguages(accessToken(auth));
    }

    @Override
    public TargetingTypesResponse getTargetingTypes(Authentication auth) throws DspApiException {
        return resource.getTargetingTypes(accessToken(auth));
    }

    @Override
    public TimezonesResponse getTimezones(Authentication auth) throws DspApiException {
        return resource.getTimezones(accessToken(auth));
    }

    @Override
    public AdBehaviorTypesResponse getAdBehaviorTypes(Authentication auth) throws DspApiException {
        return resource.getAdBehaviorTypes(accessToken(auth));
    }

    @Override
    public PremiumNativeLanguagesResponse getPremiumNativeLanguages(Authentication auth) throws DspApiException {
        return resource.getPremiumNativeLanguages(accessToken(auth));
    }

    @Override
    public PremiumNativePredefinedCtaLabelsResponse getPremiumNativePredefinedCtaLabels(Authentication auth) throws DspApiException {
        return resource.getPremiumNativePredefinedCtaLabels(accessToken(auth));
    }

    @Override
    public PremiumNativeCountdownPrefixesResponse getPremiumNativeCountdownPrefixes(Authentication auth) throws DspApiException {
        return resource.getPremiumNativeCountdownPrefixes(accessToken(auth));
    }


}
