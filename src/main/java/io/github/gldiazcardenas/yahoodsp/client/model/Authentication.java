package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Yahoo DSP Authentication token.
 *
 * @author Gabriel Diaz, Aug 19th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Authentication {

    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("expires_in")
    private int expirationSecs;

    public String getAccessToken() {
        return accessToken;
    }

    public Authentication setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public Authentication setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getTokenType() {
        return tokenType;
    }

    public Authentication setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    public int getExpirationSecs() {
        return expirationSecs;
    }

    public Authentication setExpirationSecs(int expirationSecs) {
        this.expirationSecs = expirationSecs;
        return this;
    }

    @Override
    public String toString() {
        return "DspAccessToken{" +
                "accessToken='" + accessToken + '\'' +
                ", scope='" + scope + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", expirationSecs=" + expirationSecs +
                '}';
    }

}
