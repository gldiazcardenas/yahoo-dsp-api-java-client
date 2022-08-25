package io.github.gldiazcardenas.yahoodsp.service.traffic;

import io.github.gldiazcardenas.yahoodsp.Payloads;
import io.github.gldiazcardenas.yahoodsp.client.DspApi;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Seat;
import io.github.gldiazcardenas.yahoodsp.client.model.SeatLookup;
import io.github.gldiazcardenas.yahoodsp.client.model.Seats;
import io.github.gldiazcardenas.yahoodsp.client.model.SeatsResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.SeatService;
import io.github.gldiazcardenas.yahoodsp.service.DspApiMockedServerTest;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import java.time.Instant;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Gabriel Diaz, Aug 25th 2022.
 */
public class SeatGetAllSuccessfulTest implements DspApiMockedServerTest {

    @Override
    public void onServerStarted(MockWebServer server, DspApi api) throws Exception {
        // Given
        Authentication auth = Payloads.authentication();
        Seats expectedSeats = new Seats();
        expectedSeats.setCurrentSeat(Collections.singletonList(Payloads.seat()));
        expectedSeats.setSeatLookups(Collections.singletonList(Payloads.seatLookup()));

        SeatsResponse expectedResponse = new SeatsResponse();
        expectedResponse.setResponse(expectedSeats);
        expectedResponse.setTimestamp(Instant.now());

        server.enqueue(new MockResponse().setBody(Payloads.toJson(expectedResponse)));

        // When
        SeatService service = api.getSeatService();
        SeatsResponse actualResponse = service.getAll(auth);

        // Then
        assertNotNull(actualResponse);
        assertNotNull(actualResponse.getResponse());
        assertEquals(expectedResponse.getTimestamp(), actualResponse.getTimestamp());

        Seats actualSeats = actualResponse.getResponse();
        assertNotNull(actualSeats.getCurrentSeat());
        assertNotNull(actualSeats.getSeatLookups());
        assertEquals(expectedSeats.getCurrentSeat().size(), actualSeats.getCurrentSeat().size());
        assertEquals(expectedSeats.getSeatLookups().size(), actualSeats.getSeatLookups().size());

        Seat expectedFirstSeat = expectedSeats.getCurrentSeat().get(0);
        Seat actualFirstSeat = actualSeats.getCurrentSeat().get(0);
        assertNotNull(actualFirstSeat);
        assertEquals(expectedFirstSeat.getId(), actualFirstSeat.getId());
        assertEquals(expectedFirstSeat.getName(), actualFirstSeat.getName());
        assertEquals(expectedFirstSeat.getCurrency(), actualFirstSeat.getCurrency());
        assertEquals(expectedFirstSeat.getTimezone(), actualFirstSeat.getTimezone());

        SeatLookup expectedFirstLookup = expectedSeats.getSeatLookups().get(0);
        SeatLookup actualFirstLookup = actualSeats.getSeatLookups().get(0);
        assertNotNull(actualFirstLookup);
        assertEquals(expectedFirstLookup.getId(), actualFirstLookup.getId());
        assertEquals(expectedFirstLookup.getName(), actualFirstLookup.getName());

        RecordedRequest request = server.takeRequest();
        Assertions.assertRequestDefaults(request, auth);
        assertEquals(TRAFFIC_PATH + "seats", request.getPath());
        assertEquals("GET", request.getMethod());
    }
}
