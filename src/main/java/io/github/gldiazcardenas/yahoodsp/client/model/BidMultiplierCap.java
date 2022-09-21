package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

/**
 * @author Gabriel Diaz, Sep 21th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BidMultiplierCap {

    private BigDecimal multiplierCap;

    public BigDecimal getMultiplierCap() {
        return multiplierCap;
    }

    public void setMultiplierCap(BigDecimal multiplierCap) {
        this.multiplierCap = multiplierCap;
    }

    @Override
    public String toString() {
        return "BidMultiplierCap{" +
                "multiplierCap=" + multiplierCap +
                '}';
    }

}
