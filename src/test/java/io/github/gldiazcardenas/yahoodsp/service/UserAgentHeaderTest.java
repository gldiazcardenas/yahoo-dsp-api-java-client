package io.github.gldiazcardenas.yahoodsp.service;

import io.github.gldiazcardenas.yahoodsp.Payloads;
import io.github.gldiazcardenas.yahoodsp.client.DspApi;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Gabriel Diaz, Aug 25th 2022.
 */
public class UserAgentHeaderTest implements ServiceTest {

    @Override
    public void started(MockWebServer server, DspApi api) throws Exception {
        // Given
        Authentication auth = Payloads.authentication();
        server.enqueue(new MockResponse().setBody(Payloads.emptyJson()));

        // When
        api.getSeatService().getAll(auth);

        // Then
        RecordedRequest request = server.takeRequest();
        assertEquals(USER_AGENT, request.getHeader("User-Agent"));
    }

}
