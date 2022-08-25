package io.github.gldiazcardenas.yahoodsp.service;

import io.github.gldiazcardenas.yahoodsp.Payloads;
import io.github.gldiazcardenas.yahoodsp.client.DspApi;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.service.AuthenticationService;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Gabriel Diaz, Aug 25th 2022.
 */
public class AuthenticationSuccessfulTest implements ServiceTest {

    @Override
    public void started(MockWebServer server, DspApi api) throws Exception {
        // Given
        Authentication expectedAuthentication = Payloads.authentication();
        server.enqueue(new MockResponse().setBody(Payloads.toJson(expectedAuthentication)));

        // When
        AuthenticationService service = api.getAuthenticationService();
        Authentication resultAuthentication = service.authenticate(Payloads.authenticationCredentials());

        // Then
        assertNotNull(resultAuthentication);
        assertEquals(expectedAuthentication.getAccessToken(), resultAuthentication.getAccessToken());
        assertEquals(expectedAuthentication.getTokenType(), resultAuthentication.getTokenType());
        assertEquals(expectedAuthentication.getScope(), resultAuthentication.getScope());
        assertEquals(expectedAuthentication.getExpirationSecs(), resultAuthentication.getExpirationSecs());

        RecordedRequest request = server.takeRequest();
        assertNotNull(request);
        assertEquals(AUTH_PATH + "access_token", request.getPath());
        assertEquals("POST", request.getMethod());
        assertEquals("application/x-www-form-urlencoded", request.getHeader("Content-Type"));
    }

}
