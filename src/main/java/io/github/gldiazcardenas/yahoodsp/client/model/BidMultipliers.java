package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Oct 20th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BidMultipliers {

    private List<BidMultiplier> bidMultipliers;

    public List<BidMultiplier> getBidMultipliers() {
        return bidMultipliers;
    }

    public void setBidMultipliers(List<BidMultiplier> bidMultipliers) {
        this.bidMultipliers = bidMultipliers;
    }

    @Override
    public String toString() {
        return "BidMultipliers{" +
                "bidMultipliers=" + bidMultipliers +
                '}';
    }
}
