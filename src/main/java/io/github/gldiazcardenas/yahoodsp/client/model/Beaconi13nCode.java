package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Oct 11th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Beaconi13nCode {

    private Long beaconId;
    private Long pixelId;
    private String urlSecureMultiple;
    private String urlSecureSingle;
    private String customEventScript;

    public Long getBeaconId() {
        return beaconId;
    }

    public void setBeaconId(Long beaconId) {
        this.beaconId = beaconId;
    }

    public Long getPixelId() {
        return pixelId;
    }

    public void setPixelId(Long pixelId) {
        this.pixelId = pixelId;
    }

    public String getUrlSecureMultiple() {
        return urlSecureMultiple;
    }

    public void setUrlSecureMultiple(String urlSecureMultiple) {
        this.urlSecureMultiple = urlSecureMultiple;
    }

    public String getUrlSecureSingle() {
        return urlSecureSingle;
    }

    public void setUrlSecureSingle(String urlSecureSingle) {
        this.urlSecureSingle = urlSecureSingle;
    }

    public String getCustomEventScript() {
        return customEventScript;
    }

    public void setCustomEventScript(String customEventScript) {
        this.customEventScript = customEventScript;
    }

    @Override
    public String toString() {
        return "Beaconi13nCode{" +
                "beaconId=" + beaconId +
                ", pixelId=" + pixelId +
                ", urlSecureMultiple='" + urlSecureMultiple + '\'' +
                ", urlSecureSingle='" + urlSecureSingle + '\'' +
                ", customEventScript='" + customEventScript + '\'' +
                '}';
    }
}
