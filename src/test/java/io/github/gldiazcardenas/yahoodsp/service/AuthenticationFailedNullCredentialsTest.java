package io.github.gldiazcardenas.yahoodsp.service;

import io.github.gldiazcardenas.yahoodsp.Payloads;
import io.github.gldiazcardenas.yahoodsp.client.DspApi;
import io.github.gldiazcardenas.yahoodsp.client.service.AuthenticationService;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Gabriel Diaz, Aug 25th 2022.
 */
public class AuthenticationFailedNullCredentialsTest implements DspApiTest {

    @Override
    public void started(MockWebServer server, DspApi api) throws Exception {
        AuthenticationService service = api.getAuthenticationService();

        // Null parameter
        assertThrows(NullPointerException.class, () -> service.authenticate(null));

        // Null client-id
        assertThrows(NullPointerException.class, () -> service.authenticate(Payloads.authenticationCredentials()
                .setClientId(null)));

        // Empty client-id
        assertThrows(IllegalArgumentException.class, () -> service.authenticate(Payloads.authenticationCredentials()
                .setClientId("")));

        assertThrows(IllegalArgumentException.class, () -> service.authenticate(Payloads.authenticationCredentials()
                .setClientId("   ")));

        // Null client-secret
        assertThrows(NullPointerException.class, () -> service.authenticate(Payloads.authenticationCredentials()
                .setClientSecret(null)));

        // Empty client-secret
        assertThrows(IllegalArgumentException.class, () -> service.authenticate(Payloads.authenticationCredentials()
                .setClientSecret("")));

        assertThrows(IllegalArgumentException.class, () -> service.authenticate(Payloads.authenticationCredentials()
                .setClientSecret("   ")));

        RecordedRequest request = server.takeRequest(1, TimeUnit.SECONDS);
        assertNull(request);
    }

}
