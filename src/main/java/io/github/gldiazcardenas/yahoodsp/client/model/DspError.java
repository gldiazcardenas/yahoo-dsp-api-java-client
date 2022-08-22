package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Common Yahoo DSP Error.
 *
 * @author Gabriel Diaz, Aug 19th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DspError {

    @JsonProperty("httpStatusCode")
    private int statusCode;
    @JsonProperty("message")
    private String message;
    @JsonProperty("validationErrors")
    private List<String> validations;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getValidations() {
        return validations;
    }

    public void setValidations(List<String> validations) {
        this.validations = validations;
    }

    @Override
    public String toString() {
        return "YahooDspError{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", validations=" + validations +
                '}';
    }
}
