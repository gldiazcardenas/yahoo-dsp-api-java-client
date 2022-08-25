package io.github.gldiazcardenas.yahoodsp.service;

import io.github.gldiazcardenas.yahoodsp.client.CommunicationConfig;
import io.github.gldiazcardenas.yahoodsp.client.DspApi;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.Test;

/**
 * @author Gabriel Diaz, Aug 25th 2022.
 */
public interface DspApiTest {

    String USER_AGENT = "Mocked-Server-Test";
    String AUTH_PATH = "/auth/";
    String REPORTING_PATH = "/reporting/";
    String TRAFFIC_PATH = "/traffic/";

    @Test
    default void run() throws Exception {
        runOnServer(this);
    }

    default void runOnServer(DspApiTest test) throws Exception {
        try (MockWebServer server = new MockWebServer()) {
            server.start();

            try {
                DspApi api = DspApi.builder()
                        .withCommunicationConfig(CommunicationConfig.builder()
                                .setUserAgent(USER_AGENT)
                                .setAuthApiUrl(server.url(AUTH_PATH).toString())
                                .setTrafficApiUrl(server.url(TRAFFIC_PATH).toString())
                                .setReportingApiUrl(server.url(REPORTING_PATH).toString())
                        )
                        .build();

                test.started(server, api);
            }
            finally {
                server.shutdown();
            }
        }
    }

    void started(MockWebServer server, DspApi api) throws Exception;

}
