package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Authentication Yahoo DSP Error.
 *
 * @author Gabriel Diaz, Aug 19th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthenticationError {

    @JsonProperty("error")
    private String error;

    @JsonProperty("error_description")
    private String description;

    public AuthenticationError() {
        super();
    }

    public AuthenticationError(String error, String description) {
        this.error = error;
        this.description = description;
    }

    public String getError() {
        return error;
    }

    public AuthenticationError setError(String error) {
        this.error = error;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AuthenticationError setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "AuthenticationError{" +
                "error='" + error + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
