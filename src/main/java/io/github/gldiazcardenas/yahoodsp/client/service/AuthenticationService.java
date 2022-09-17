package io.github.gldiazcardenas.yahoodsp.client.service;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.AuthenticationCredentials;

import java.time.Duration;

/**
 * Authentication related service.
 *
 * @author Gabriel Diaz, Aug 24th 2022.
 */
public interface AuthenticationService {

    /**
     * Fixed value: '<a href="https://id.b2b.yahooinc.com/identity/oauth2/access_token?realm=dsp">https://id.b2b.yahooinc.com/identity/oauth2/access_token?realm=dsp</a>'.
     */
    String DEFAULT_AUDIENCE = "https://id.b2b.yahooinc.com/identity/oauth2/access_token?realm=dsp";

    /**
     * 15 minutes expiration default.
     */
    Duration DEFAULT_ACCESS_TOKEN_TTL = Duration.ofMinutes(15);

    /**
     * 24 hours maximum expiration.
     */
    Duration MAX_ACCESS_TOKEN_TTL = Duration.ofHours(24);

    /**
     * Fixed value : 'client_credentials'.
     */
    String DEFAULT_GRANT_TYPE = "client_credentials";

    /**
     * Fixed value: 'urn:ietf:params:oauth:client-assertion-type:jwt-bearer'.
     */
    String DEFAULT_CLIENT_ASSERTION_TYPE = "urn:ietf:params:oauth:client-assertion-type:jwt-bearer";

    /**
     * Fixed value: 'dsp-api-access'.
     */
    String DEFAULT_SCOPE = "dsp-api-access";

    /**
     * Fixed value: 'dsp'.
     */
    String DEFAULT_REALM = "dsp";

    /**
     * Fixed value: 'dsp-api-token'.
     */
    String DEFAULT_TOKEN_ID = "dsp-api-token";

    /**
     * Fixed value: 'Bearer'.
     */
    String DEFAULT_TOKEN_TYPE = "Bearer";

    /**
     * Fixed value: 'Oauth2'.
     */
    String DEFAULT_AUTH_METHOD = "Oauth2";

    /**
     * Header for authentication method.
     */
    String HEADER_AUTH_METHOD = "X-Auth-Method";

    /**
     * Header for authentication token.
     */
    String HEADER_AUTH_TOKEN = "X-Auth-Token";

    /**
     * Generates a new Access Token using the given client credentials.  This method encapsulates the generation of the JWT
     * needed to be able to generate the Access Token, so it is required only the {@code clientId} and {@code clientSecret}.
     *
     * @param credentials The client credentials.
     * @return The new Access Token generated.
     * @throws DspApiException In case the authentication fails.
     */
    Authentication authenticate(AuthenticationCredentials credentials) throws DspApiException;

}
