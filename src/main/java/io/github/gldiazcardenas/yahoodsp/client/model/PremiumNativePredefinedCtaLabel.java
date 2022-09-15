package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PremiumNativePredefinedCtaLabel {

    private String callToActionText;
    private String language;

    public String getCallToActionText() {
        return callToActionText;
    }

    public void setCallToActionText(String callToActionText) {
        this.callToActionText = callToActionText;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "PremiumNativePredefinedCtaLabel{" +
                "callToActionText='" + callToActionText + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

}
