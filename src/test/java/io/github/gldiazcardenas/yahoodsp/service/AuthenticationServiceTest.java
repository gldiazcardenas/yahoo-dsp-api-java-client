package io.github.gldiazcardenas.yahoodsp.service;


import io.github.gldiazcardenas.yahoodsp.Payloads;
import io.github.gldiazcardenas.yahoodsp.client.CommunicationConfig;
import io.github.gldiazcardenas.yahoodsp.client.DspApi;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.AuthenticationCredentials;
import io.github.gldiazcardenas.yahoodsp.client.model.AuthenticationError;
import io.github.gldiazcardenas.yahoodsp.client.service.AuthenticationService;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiError;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class AuthenticationServiceTest {

    @Test
    public void test_Authentication_OK() throws Exception {
        try (MockWebServer server = new MockWebServer()) {
            Authentication expected = Payloads.authentication();

            // Given
            server.start();
            server.enqueue(new MockResponse().setBody(Payloads.toJson(expected)));

            AuthenticationService service = DspApi.builder()
                    .withCommunicationConfig(CommunicationConfig.builder()
                            .setUserAgent("Automatic-Test")
                            .setAuthApiUrl(server.url("/").toString()))
                    .build()
                    .getAuthenticationService();

            AuthenticationCredentials credentials = new AuthenticationCredentials()
                    .setClientId("fake-client-id")
                    .setClientSecret("fake-client-secret");

            // When
            Authentication authentication = service.authenticate(credentials);

            // Then
            assertNotNull(authentication);
            assertEquals(expected.getAccessToken(), authentication.getAccessToken());
            assertEquals(expected.getTokenType(), authentication.getTokenType());
            assertEquals(expected.getScope(), authentication.getScope());
            assertEquals(expected.getExpirationSecs(), authentication.getExpirationSecs());

            RecordedRequest request = server.takeRequest();
            assertNotNull(request);
            assertEquals("/access_token", request.getPath());
            assertEquals("application/x-www-form-urlencoded", request.getHeader("Content-Type"));
        }
    }

    @Test
    public void test_Authentication_Wrong_Credentials() throws Exception {
        try (MockWebServer server = new MockWebServer()) {
            int statusCode = 401;
            AuthenticationError authError = Payloads.authenticationError();

            // Given
            server.start();
            server.enqueue(new MockResponse().setResponseCode(statusCode).setBody(Payloads.toJson(authError)));

            AuthenticationService service = DspApi.builder()
                    .withCommunicationConfig(CommunicationConfig.builder()
                            .setAuthApiUrl(server.url("/").toString()))
                    .build()
                    .getAuthenticationService();

            AuthenticationCredentials credentials = new AuthenticationCredentials()
                    .setClientId("wrong-client-id")
                    .setClientSecret("wrong-client-secret");

            // When
            DspApiException exception = assertThrows(DspApiException.class, () -> service.authenticate(credentials));
            assertNotNull(exception);

            DspApiError error = exception.getError();
            assertNotNull(error);
            assertNotNull(error.getTimestamp());
            assertEquals(statusCode, error.getStatusCode());
            assertEquals(authError.getError(), error.getMessage());
            assertEquals("POST", error.getMethod());
        }
    }

    @Test
    public void test_Authentication_Null_Credential() throws Exception {
        try (MockWebServer server = new MockWebServer()) {
            server.start();

            AuthenticationService service = DspApi.builder()
                    .withCommunicationConfig(CommunicationConfig.builder()
                            .setAuthApiUrl(server.url("/").toString()))
                    .build()
                    .getAuthenticationService();

            assertThrows(NullPointerException.class, () -> service.authenticate(null));

            RecordedRequest request = server.takeRequest(1, TimeUnit.SECONDS);
            assertNull(request);
        }
    }

    @Test
    public void test_Authentication_Null_ClientId_And_ClientSecret() throws Exception {
        try (MockWebServer server = new MockWebServer()) {
            server.start();

            AuthenticationService service = DspApi.builder()
                    .withCommunicationConfig(CommunicationConfig.builder()
                            .setAuthApiUrl(server.url("/").toString()))
                    .build()
                    .getAuthenticationService();

            assertThrows(IllegalArgumentException.class, () -> service.authenticate(new AuthenticationCredentials()));

            RecordedRequest request = server.takeRequest(1, TimeUnit.SECONDS);
            assertNull(request);
        }
    }

    @Test
    public void test_Authentication_Null_ClientId() throws Exception {
        try (MockWebServer server = new MockWebServer()) {
            server.start();

            AuthenticationService service = DspApi.builder()
                    .withCommunicationConfig(CommunicationConfig.builder()
                            .setAuthApiUrl(server.url("/").toString()))
                    .build()
                    .getAuthenticationService();

            assertThrows(IllegalArgumentException.class, () -> service.authenticate(new AuthenticationCredentials()
                    .setClientSecret("fake-client-secret")));

            RecordedRequest request = server.takeRequest(1, TimeUnit.SECONDS);
            assertNull(request);
        }
    }

    @Test
    public void test_Authentication_Null_ClientSecret() throws Exception {
        try (MockWebServer server = new MockWebServer()) {
            server.start();

            AuthenticationService service = DspApi.builder()
                    .withCommunicationConfig(CommunicationConfig.builder()
                            .setAuthApiUrl(server.url("/").toString()))
                    .build()
                    .getAuthenticationService();

            assertThrows(IllegalArgumentException.class, () -> service.authenticate(new AuthenticationCredentials()
                    .setClientId("fake-client-id")));

            RecordedRequest request = server.takeRequest(1, TimeUnit.SECONDS);
            assertNull(request);
        }
    }

}
