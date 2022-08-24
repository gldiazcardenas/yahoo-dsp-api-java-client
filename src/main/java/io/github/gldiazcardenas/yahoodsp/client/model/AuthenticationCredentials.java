package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Duration;

/**
 * Credentials for the authentication process.
 *
 * @author Gabriel Diaz, Aug 24th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AuthenticationCredentials {

    @JsonProperty("clientId")
    private String clientId;
    @JsonProperty("clientSecret")
    private String clientSecret;
    @JsonProperty("expiresIn")
    private Duration expiresIn;
    @JsonProperty("tokenId")
    private String tokenId;

    public String getClientId() {
        return clientId;
    }

    public AuthenticationCredentials setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public AuthenticationCredentials setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public Duration getExpiresIn() {
        return expiresIn;
    }

    public AuthenticationCredentials setExpiresIn(Duration expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    public String getTokenId() {
        return tokenId;
    }

    public AuthenticationCredentials setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }
}
