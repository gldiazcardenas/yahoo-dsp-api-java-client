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

class DataDictionaryServiceImpl implements DataDictionaryService {

    private final DataDictionaryResource resource;

    DataDictionaryServiceImpl(DataDictionaryResource resource) {
        this.resource = resource;
    }

    @Override
    public DictionaryTypesResponse getTypes(Authentication auth) throws DspApiException {
        return resource.getTypes(auth.getAccessToken());
    }

    @Override
    public LayoutsResponse getLayouts(Authentication auth) throws DspApiException {
        return resource.getLayouts(auth.getAccessToken());
    }

    @Override
    public CreativeMimeTypesResponse getCreativeMimeTypes(Authentication auth) throws DspApiException {
        return resource.getCreativeMimeTypes(auth.getAccessToken());
    }

    @Override
    public CurrencyTypesResponse getCurrencyTypes(Authentication auth) throws DspApiException {
        return resource.getCurrencyTypes(auth.getAccessToken());
    }

    @Override
    public LanguagesResponse getLanguages(Authentication auth) throws DspApiException {
        return resource.getLanguages(auth.getAccessToken());
    }

    @Override
    public TargetingTypesResponse getTargetingTypes(Authentication auth) throws DspApiException {
        return resource.getTargetingTypes(auth.getAccessToken());
    }

    @Override
    public TimezonesResponse getTimezones(Authentication auth) throws DspApiException {
        return resource.getTimezones(auth.getAccessToken());
    }

    @Override
    public AdBehaviorTypesResponse getAdBehaviorTypes(Authentication auth) throws DspApiException {
        return resource.getAdBehaviorTypes(auth.getAccessToken());
    }

    @Override
    public PremiumNativeLanguagesResponse getPremiumNativeLanguages(Authentication auth) throws DspApiException {
        return resource.getPremiumNativeLanguages(auth.getAccessToken());
    }

    @Override
    public PremiumNativePredefinedCtaLabelsResponse getPremiumNativePredefinedCtaLabels(Authentication auth) throws DspApiException {
        return resource.getPremiumNativePredefinedCtaLabels(auth.getAccessToken());
    }

    @Override
    public PremiumNativeCountdownPrefixesResponse getPremiumNativeCountdownPrefixes(Authentication auth) throws DspApiException {
        return resource.getPremiumNativeCountdownPrefixes(auth.getAccessToken());
    }


}
