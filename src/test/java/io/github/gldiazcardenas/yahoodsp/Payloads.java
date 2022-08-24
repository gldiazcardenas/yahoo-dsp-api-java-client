package io.github.gldiazcardenas.yahoodsp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.AuthenticationError;

public final class Payloads {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        OBJECT_MAPPER.registerModule(new JavaTimeModule());
    }

    private Payloads() {
        super();
    }

    public static Authentication authentication() {
        return new Authentication()
                .setAccessToken("fake-access-token")
                .setScope("dsp-api-access")
                .setTokenType("Bearer")
                .setExpirationSecs(3600);
    }

    public static AuthenticationError authenticationError() {
        return new AuthenticationError()
                .setError("invalid_client")
                .setDescription("JWT is expired or is not valid");
    }

    public static String toJson(Object object) {
        try {
            return OBJECT_MAPPER.writeValueAsString(object);
        }
        catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
