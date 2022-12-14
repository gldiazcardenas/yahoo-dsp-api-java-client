package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Gabriel Diaz, Aug 24th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Seats {

    @JsonProperty("currentSeat")
    private List<Seat> currentSeat;
    @JsonProperty("seatLookups")
    private List<SeatLookup> seatLookups;

    public List<Seat> getCurrentSeat() {
        return currentSeat;
    }

    public Seats setCurrentSeat(List<Seat> currentSeat) {
        this.currentSeat = currentSeat;
        return this;
    }

    public List<SeatLookup> getSeatLookups() {
        return seatLookups;
    }

    public Seats setSeatLookups(List<SeatLookup> seatLookups) {
        this.seatLookups = seatLookups;
        return this;
    }

}
