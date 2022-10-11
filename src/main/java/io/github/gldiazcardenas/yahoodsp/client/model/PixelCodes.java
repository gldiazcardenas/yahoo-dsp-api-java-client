package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Oct 11th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PixelCodes {

    private String type;
    private String protocol;
    private String instrumentationCode;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getInstrumentationCode() {
        return instrumentationCode;
    }

    public void setInstrumentationCode(String instrumentationCode) {
        this.instrumentationCode = instrumentationCode;
    }

    @Override
    public String toString() {
        return "PixelCodes{" +
                "type='" + type + '\'' +
                ", protocol='" + protocol + '\'' +
                ", instrumentationCode='" + instrumentationCode + '\'' +
                '}';
    }
}
