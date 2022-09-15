package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

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
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

/**
 * Data Dictionary related services.
 *
 * @author Gabriel Diaz, Aug 24th 2022.
 */
public interface DataDictionaryService {

    /**
     * Gets all dictionary types supported by the platform.
     * @param auth The authentication.
     * @return Response with the types.
     * @throws DspApiException In case of any failure.
     */
    DictionaryTypesResponse getTypes(Authentication auth) throws DspApiException;

    /**
     * Gets available layouts.
     * @param auth The authentication.
     * @return Response with the layouts.
     * @throws DspApiException In case of any failure.
     */
    LayoutsResponse getLayouts(Authentication auth) throws DspApiException;

    /**
     * Gets available mime types for Ad creatives.
     * @param auth The authentication.
     * @return Response with the supported mime types.
     * @throws DspApiException In case of any failure.
     */
    CreativeMimeTypesResponse getCreativeMimeTypes(Authentication auth) throws DspApiException;

    /**
     * Gets available currency types.
     * @param auth The authentication.
     * @return Response with the supported currency types.
     * @throws DspApiException In case of any failure.
     */
    CurrencyTypesResponse getCurrencyTypes(Authentication auth) throws DspApiException;

    /**
     * Gets available languages.
     * @param auth The authentication.
     * @return Response with the supported languages.
     * @throws DspApiException In case of any failure.
     */
    LanguagesResponse getLanguages(Authentication auth) throws DspApiException;

    /**
     * Gets available targeting types.
     * @param auth The authentication.
     * @return Response with the supported targeting types.
     * @throws DspApiException In case of any failure.
     */
    TargetingTypesResponse getTargetingTypes(Authentication auth) throws DspApiException;

    /**
     * Gets available timezones.
     * @param auth The authentication.
     * @return Response with the supported timezones.
     * @throws DspApiException In case of any failure.
     */
    TimezonesResponse getTimezones(Authentication auth) throws DspApiException;

    /**
     * Gets available ad behavior types.
     * @param auth The authentication.
     * @return Response with the supported ad behavior types.
     * @throws DspApiException In case of any failure.
     */
    AdBehaviorTypesResponse getAdBehaviorTypes(Authentication auth) throws DspApiException;

    /**
     * Gets available premium native languages.
     * @param auth The authentication.
     * @return Response with the supported types.
     * @throws DspApiException In case of any failure.
     */
    PremiumNativeLanguagesResponse getPremiumNativeLanguages(Authentication auth) throws DspApiException;

    /**
     * Gets available premium native predefined cta labels.
     * @param auth The authentication.
     * @return Response with the supported types.
     * @throws DspApiException In case of any failure.
     */
    PremiumNativePredefinedCtaLabelsResponse getPremiumNativePredefinedCtaLabels(Authentication auth) throws DspApiException;

    /**
     * Gets available premium native countdown prefixes.
     * @param auth The authentication.
     * @return Response with the supported types.
     * @throws DspApiException In case of any failure.
     */
    PremiumNativeCountdownPrefixesResponse getPremiumNativeCountdownPrefixes(Authentication auth) throws DspApiException;

}
