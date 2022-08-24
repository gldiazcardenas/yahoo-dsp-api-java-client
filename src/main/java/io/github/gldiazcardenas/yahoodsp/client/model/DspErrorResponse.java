package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Error Yahoo DSP Response object.
 *
 * @author Gabriel Diaz, Aug 19th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DspErrorResponse {

    @JsonProperty("errors")
    private DspError error;
    @JsonProperty("validationMessages")
    private List<DspErrorValidation> validations;
    @JsonProperty("timeStamp")
    private LocalDateTime timestamp;

    public DspError getError() {
        return error;
    }

    public void setError(DspError error) {
        this.error = error;
    }

    public List<DspErrorValidation> getValidations() {
        return validations;
    }

    public void setValidations(List<DspErrorValidation> validations) {
        this.validations = validations;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "DspErrorResponse{" +
                ", error=" + error +
                ", timestamp=" + timestamp +
                '}';
    }

}
