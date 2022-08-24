package io.github.gldiazcardenas.yahoodsp.service;


import io.github.gldiazcardenas.yahoodsp.client.CommunicationConfig;
import io.github.gldiazcardenas.yahoodsp.client.DspApi;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.AuthenticationCredentials;
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
            String accessToken = "11111";
            String scope = "dsp-api-access";
            String tokenType = "Bearer";
            int expiresIn = 3600;

            String json = "{\n" +
                    "    \"access_token\": \"" + accessToken + "\",\n" +
                    "    \"scope\": \"" + scope + "\",\n" +
                    "    \"token_type\": \"" + tokenType + "\",\n" +
                    "    \"expires_in\": " + expiresIn + "\n" +
                    "}";

            // Given
            server.start();
            server.enqueue(new MockResponse().setBody(json));

            AuthenticationService service = DspApi.builder()
                    .withCommunicationConfig(CommunicationConfig.builder()
                            .setUserAgent("Automatic-Test")
                            .setAuthApiUrl(server.url("/").toString()))
                    .build()
                    .getAuthenticationService();

            AuthenticationCredentials credentials = AuthenticationCredentials.builder()
                    .setClientId("fake-client-id")
                    .setClientSecret("fake-client-secret")
                    .build();

            // When
            Authentication authentication = service.authenticate(credentials);

            // Then
            assertNotNull(authentication);
            assertEquals(accessToken, authentication.getAccessToken());
            assertEquals(tokenType, authentication.getTokenType());
            assertEquals(scope, authentication.getScope());
            assertEquals(expiresIn, authentication.getExpirationSecs());

            RecordedRequest request = server.takeRequest();
            assertNotNull(request);
            assertEquals("/access_token", request.getPath());
            assertEquals("application/x-www-form-urlencoded", request.getHeader("Content-Type"));
        }
    }

    @Test
    public void test_Authentication_Wrong_Credentials() throws Exception {
        try (MockWebServer server = new MockWebServer()) {
            String json =
                    "{\n" +
                    "    \"error_description\": \"JWT is expired or is not valid\",\n" +
                    "    \"error\": \"invalid_client\"\n" +
                    "}";

            // Given
            server.start();
            server.enqueue(new MockResponse().setResponseCode(401).setBody(json));

            AuthenticationService service = DspApi.builder()
                    .withCommunicationConfig(CommunicationConfig.builder()
                            .setAuthApiUrl(server.url("/").toString()))
                    .build()
                    .getAuthenticationService();

            AuthenticationCredentials credentials = AuthenticationCredentials.builder()
                    .setClientId("wrong-client-id")
                    .setClientSecret("wrong-client-secret")
                    .build();

            // When
            DspApiException exception = assertThrows(DspApiException.class, () -> service.authenticate(credentials));
            assertNotNull(exception);

            DspApiError error = exception.getError();
            assertNotNull(error);
            assertNotNull(error.getTimestamp());
            assertEquals(401, error.getStatusCode());
            assertEquals("invalid_client", error.getMessage());
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

            assertThrows(IllegalArgumentException.class, () -> service.authenticate(AuthenticationCredentials.builder().build()));

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

            assertThrows(IllegalArgumentException.class, () -> service.authenticate(AuthenticationCredentials.builder()
                    .setClientSecret("fake-client-secret")
                    .build()));

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

            assertThrows(IllegalArgumentException.class, () -> service.authenticate(AuthenticationCredentials.builder()
                    .setClientId("fake-client-id")
                    .build()));

            RecordedRequest request = server.takeRequest(1, TimeUnit.SECONDS);
            assertNull(request);
        }
    }

}
