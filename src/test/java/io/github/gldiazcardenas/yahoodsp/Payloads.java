package io.github.gldiazcardenas.yahoodsp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.AuthenticationCredentials;
import io.github.gldiazcardenas.yahoodsp.client.model.AuthenticationError;
import io.github.gldiazcardenas.yahoodsp.client.model.Seat;
import io.github.gldiazcardenas.yahoodsp.client.model.SeatLookup;
import io.github.gldiazcardenas.yahoodsp.client.service.AuthenticationService;

public final class Payloads {

    public static final String CLIENT_ID = "fake-client-id";
    public static final String CLIENT_SECRET = "fake-client-secret";
    public static final String ACCESS_TOKEN = "fake-access-token";

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        OBJECT_MAPPER.registerModule(new JavaTimeModule());
    }

    private Payloads() {
        super();
    }

    public static String toJson(Object object) {
        try {
            return OBJECT_MAPPER.writeValueAsString(object);
        }
        catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static AuthenticationCredentials authenticationCredentials() {
        return new AuthenticationCredentials()
                .setClientId(CLIENT_ID)
                .setClientSecret(CLIENT_SECRET)
                .setExpiresIn(AuthenticationService.DEFAULT_ACCESS_TOKEN_TTL)
                .setTokenId(AuthenticationService.DEFAULT_TOKEN_ID);
    }

    public static Authentication authentication() {
        return new Authentication()
                .setAccessToken(ACCESS_TOKEN)
                .setScope(AuthenticationService.DEFAULT_SCOPE)
                .setTokenType(AuthenticationService.DEFAULT_TOKEN_TYPE)
                .setExpirationSecs((int) AuthenticationService.DEFAULT_ACCESS_TOKEN_TTL.getSeconds());
    }

    public static AuthenticationError authenticationError() {
        return new AuthenticationError()
                .setError("invalid_client")
                .setDescription("JWT is expired or is not valid");
    }

    public static Seat seat() {
        return new Seat()
                .setId("1")
                .setName("seat")
                .setCurrency("USD")
                .setTimezone("America/New_York");
    }


    public static SeatLookup seatLookup() {
        return new SeatLookup()
                .setId("1")
                .setName("seat");
    }

}
