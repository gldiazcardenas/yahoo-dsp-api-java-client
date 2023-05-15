package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
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
    private Instant timestamp;

    public DspErrorResponse() {
        super();
    }

    public DspErrorResponse(DspError error) {
        this.error = error;
    }

    public DspErrorResponse(DspError error, Instant timestamp) {
        this.error = error;
        this.timestamp = timestamp;
    }

    public DspError getError() {
        return error;
    }

    public DspErrorResponse setError(DspError error) {
        this.error = error;
        return this;
    }

    public List<DspErrorValidation> getValidations() {
        return validations;
    }

    public DspErrorResponse setValidations(List<DspErrorValidation> validations) {
        this.validations = validations;
        return this;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public DspErrorResponse setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public String toString() {
        return "DspErrorResponse{" +
                ", error=" + error +
                ", timestamp=" + timestamp +
                '}';
    }

}
