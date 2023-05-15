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

    @JsonProperty("message")
    private String message;
    @JsonProperty("validationErrors")
    private List<DspErrorValidation> validations;

    public DspError() {
        super();
    }

    public DspError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public DspError setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<DspErrorValidation> getValidations() {
        return validations;
    }

    public DspError setValidations(List<DspErrorValidation> validations) {
        this.validations = validations;
        return this;
    }

    @Override
    public String toString() {
        return "YahooDspError{" +
                ", message='" + message + '\'' +
                ", validations=" + validations +
                '}';
    }
}
