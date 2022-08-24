package io.github.gldiazcardenas.yahoodsp.client;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import io.github.gldiazcardenas.yahoodsp.client.model.AuthenticationCredentials;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.resource.AuthenticationResource;
import io.github.gldiazcardenas.yahoodsp.client.service.AuthenticationService;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

class AuthenticationServiceImpl implements AuthenticationService {

    private final AuthenticationResource resource;

    AuthenticationServiceImpl(AuthenticationResource resource) {
        this.resource = resource;
    }

    @Override
    public Authentication authenticate(AuthenticationCredentials credentials) throws DspApiException {
        Preconditions.requireNonNull(credentials);

        String clientId = Preconditions.requireNotEmpty(credentials.getClientId());
        String clientSecret = Preconditions.requireNotEmpty(credentials.getClientSecret());

        String tokenId = Optional.ofNullable(credentials.getTokenId())
                .filter(id -> !id.trim().isEmpty())
                .orElse(DEFAULT_TOKEN_ID);

        Duration expiresIn = Preconditions.requirePositiveLowerThan(
                Optional.ofNullable(credentials.getExpiresIn()).orElse(DEFAULT_ACCESS_TOKEN_TTL),
                MAX_ACCESS_TOKEN_TTL);

        Algorithm algorithm = Algorithm.HMAC256(clientSecret);

        Instant currentTime = Instant.now();
        Instant expirationTime = currentTime.plus(expiresIn);

        String clientAssertion = JWT.create()
                .withAudience(DEFAULT_AUDIENCE)
                .withIssuer(clientId)
                .withSubject(clientId)
                .withIssuedAt(currentTime)
                .withExpiresAt(expirationTime)
                .withJWTId(tokenId)
                .sign(algorithm);

        return resource.authenticate(DEFAULT_GRANT_TYPE, DEFAULT_CLIENT_ASSERTION_TYPE, clientAssertion, DEFAULT_SCOPE, DEFAULT_REALM);
    }

}
