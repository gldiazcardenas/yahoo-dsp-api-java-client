package io.github.gldiazcardenas.yahoodsp.client.model;

import java.time.Duration;

public final class AuthenticationCredentials {

    private final String clientId;
    private final String clientSecret;
    private final Duration expiresIn;
    private final String tokenId;

    AuthenticationCredentials(String clientId, String clientSecret, Duration expiresIn, String tokenId) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.expiresIn = expiresIn;
        this.tokenId = tokenId;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public Duration getExpiresIn() {
        return expiresIn;
    }

    public String getTokenId() {
        return tokenId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String clientId;
        private String clientSecret;
        private Duration expiresIn;
        private String tokenId;

        public Builder setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setExpiresIn(Duration expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        public Builder setTokenId(String tokenId) {
            this.tokenId = tokenId;
            return this;
        }

        public AuthenticationCredentials build() {
            return new AuthenticationCredentials(clientId, clientSecret, expiresIn, tokenId);
        }
    }

}
