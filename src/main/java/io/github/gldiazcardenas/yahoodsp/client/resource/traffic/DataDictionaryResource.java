package io.github.gldiazcardenas.yahoodsp.client.resource.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.AdBehaviorTypesResponse;
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
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface DataDictionaryResource {

    @GET("dictionary")
    DictionaryTypesResponse getTypes(@Header("X-Auth-Method") String xAuthMethod,
                                     @Header("X-Auth-Token") String xAuthToken);

    @GET("dictionary/layouts")
    LayoutsResponse getLayouts(@Header("X-Auth-Method") String xAuthMethod,
                               @Header("X-Auth-Token") String xAuthToken);

    @GET("dictionary/mimeTypes")
    CreativeMimeTypesResponse getCreativeMimeTypes(@Header("X-Auth-Method") String xAuthMethod,
                                                   @Header("X-Auth-Token") String xAuthToken);

    @GET("dictionary/currencyTypes")
    CurrencyTypesResponse getCurrencyTypes(@Header("X-Auth-Method") String xAuthMethod,
                                           @Header("X-Auth-Token") String xAuthToken);

    @GET("dictionary/languages")
    LanguagesResponse getLanguages(@Header("X-Auth-Method") String xAuthMethod,
                                   @Header("X-Auth-Token") String xAuthToken);

    @GET("dictionary/targetingTypes")
    TargetingTypesResponse getTargetingTypes(@Header("X-Auth-Method") String xAuthMethod,
                                             @Header("X-Auth-Token") String xAuthToken);

    @GET("dictionary/timezones")
    TimezonesResponse getTimezones(@Header("X-Auth-Method") String xAuthMethod,
                                   @Header("X-Auth-Token") String xAuthToken);

    @GET("dictionary/adBehaviorTypes")
    AdBehaviorTypesResponse getAdBehaviorTypes(@Header("X-Auth-Method") String xAuthMethod,
                                               @Header("X-Auth-Token") String xAuthToken);

    @GET("dictionary/premiumnative/languages")
    PremiumNativeLanguagesResponse getPremiumNativeLanguages(@Header("X-Auth-Method") String xAuthMethod,
                                                             @Header("X-Auth-Token") String xAuthToken);

    @GET("dictionary/premiumnative/predefinedctalabels")
    PremiumNativePredefinedCtaLabelsResponse getPremiumNativePredefinedCtaLabels(@Header("X-Auth-Method") String xAuthMethod,
                                                                                 @Header("X-Auth-Token") String xAuthToken);

    @GET("dictionary/premiumnative/countdownprefixes")
    PremiumNativeCountdownPrefixesResponse getPremiumNativeCountdownPrefixes(@Header("X-Auth-Method") String xAuthMethod,
                                                                             @Header("X-Auth-Token") String xAuthToken);

}
