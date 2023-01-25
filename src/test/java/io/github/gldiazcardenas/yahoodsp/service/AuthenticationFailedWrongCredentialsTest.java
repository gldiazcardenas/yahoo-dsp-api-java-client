package io.github.gldiazcardenas.yahoodsp.service;

import io.github.gldiazcardenas.yahoodsp.Payloads;
import io.github.gldiazcardenas.yahoodsp.client.DspApi;
import io.github.gldiazcardenas.yahoodsp.client.model.AuthenticationCredentials;
import io.github.gldiazcardenas.yahoodsp.client.model.AuthenticationError;
import io.github.gldiazcardenas.yahoodsp.client.service.AuthenticationService;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiError;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import okhttp3.Headers;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Gabriel Diaz, Aug 25th 2022.
 */
public class AuthenticationFailedWrongCredentialsTest implements DspApiMockedServerTest {

    @Override
    public void onServerStarted(MockWebServer server, DspApi api) throws Exception {
        // Given
        int statusCode = 401;
        AuthenticationError authError = Payloads.authenticationError();
        server.enqueue(new MockResponse()
                .setResponseCode(statusCode)
                .setHeaders(Headers.of("Content-Type", "application/json"))
                .setBody(Payloads.toJson(authError)));
        AuthenticationCredentials credentials = Payloads.authenticationCredentials();

        // When
        AuthenticationService service = api.getAuthenticationService();
        DspApiException exception = assertThrows(DspApiException.class, () -> service.authenticate(credentials));
        assertNotNull(exception);

        DspApiError error = exception.getError();
        assertNotNull(error);
        assertNotNull(error.getTimestamp());
        assertEquals(statusCode, error.getStatusCode());
        assertEquals(authError.getError(), error.getMessage());
        assertEquals("POST", error.getMethod());

        RecordedRequest request = server.takeRequest();
        Assertions.assertRequestDefaults(request, null);
        assertEquals(AUTH_PATH + "access_token", request.getPath());
        assertEquals("POST", request.getMethod());
        assertEquals("application/x-www-form-urlencoded", request.getHeader("Content-Type"));
    }

}
