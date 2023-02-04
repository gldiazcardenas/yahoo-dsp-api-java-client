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
import io.github.gldiazcardenas.yahoodsp.client.resource.SecuredResource;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

public interface DataDictionaryResource extends SecuredResource {

    String NAME = "dictionary";

    @GET(NAME)
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    DictionaryTypesResponse getTypes(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken);

    @GET(NAME + "/layouts")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    LayoutsResponse getLayouts(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken);

    @GET(NAME + "/mimeTypes")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    CreativeMimeTypesResponse getCreativeMimeTypes(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken);

    @GET(NAME + "/currencyTypes")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    CurrencyTypesResponse getCurrencyTypes(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken);

    @GET(NAME + "/languages")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    LanguagesResponse getLanguages(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken);

    @GET(NAME + "/targetingTypes")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    TargetingTypesResponse getTargetingTypes(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken);

    @GET(NAME + "/timezones")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    TimezonesResponse getTimezones(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken);

    @GET(NAME + "/adBehaviorTypes")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    AdBehaviorTypesResponse getAdBehaviorTypes(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken);

    @GET(NAME + "/premiumnative/languages")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    PremiumNativeLanguagesResponse getPremiumNativeLanguages(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken);

    @GET(NAME + "/premiumnative/predefinedctalabels")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    PremiumNativePredefinedCtaLabelsResponse getPremiumNativePredefinedCtaLabels(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken);

    @GET(NAME + "/premiumnative/countdownprefixes")
    @Headers(AUTH_METHOD_HEADER_WITH_VALUE)
    PremiumNativeCountdownPrefixesResponse getPremiumNativeCountdownPrefixes(@Header(AUTH_TOKEN_HEADER_NAME) String xAuthToken);

}
