package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

/**
 * Yahoo DSP Response object, this is used as parent class for all API result objects.
 *
 * @author Gabriel Diaz, Aug 19th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class DspResponse<T> {

    @JsonProperty("response")
    private T response;
    @JsonProperty("timeStamp")
    private Instant timestamp;

    public T getResponse() {
        return response;
    }

    public DspResponse<T> setResponse(T response) {
        this.response = response;
        return this;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public DspResponse<T> setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "response=" + response +
                ", timestamp=" + timestamp +
                '}';
    }

}
