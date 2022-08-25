package io.github.gldiazcardenas.yahoodsp.service;

import io.github.gldiazcardenas.yahoodsp.client.CommunicationConfig;
import io.github.gldiazcardenas.yahoodsp.client.DspApi;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.service.AuthenticationService;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Gabriel Diaz, Aug 25th 2022.
 */
public interface DspApiMockedServerTest {

    String USER_AGENT = "Mocked-Server-Test";
    String AUTH_PATH = "/auth/";
    String REPORTING_PATH = "/reporting/";
    String TRAFFIC_PATH = "/traffic/";

    @Test
    default void run() throws Exception {
        Mocking.runOnServer(this);
    }

    void onServerStarted(MockWebServer server, DspApi api) throws Exception;

    /**
     * Class that simulates a mocked server.
     */
    class Mocking {
        static void runOnServer(DspApiMockedServerTest test) throws Exception {
            try (MockWebServer server = new MockWebServer()) {
                server.start();

                DspApi api = DspApi.builder()
                        .withCommunicationConfig(CommunicationConfig.builder()
                                .setUserAgent(USER_AGENT)
                                .setAuthApiUrl(server.url(AUTH_PATH).toString())
                                .setTrafficApiUrl(server.url(TRAFFIC_PATH).toString())
                                .setReportingApiUrl(server.url(REPORTING_PATH).toString())
                        )
                        .build();

                test.onServerStarted(server, api);
            }
        }
    }

    /**
     * Helper assertions.
     */
    class Assertions {

        public static void assertRequestDefaults(RecordedRequest request, Authentication auth) {
            assertNotNull(request);
            assertEquals(USER_AGENT, request.getHeader("User-Agent"));
            Optional.ofNullable(auth).ifPresent(a -> {
                assertEquals(AuthenticationService.DEFAULT_AUTH_METHOD, request.getHeader("X-Auth-Method"));
                assertEquals(a.getAccessToken(), request.getHeader("X-Auth-Token"));
            });
        }

    }

}
