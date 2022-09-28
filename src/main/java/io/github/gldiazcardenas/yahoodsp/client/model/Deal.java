package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Sep 28th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Deal {

    private Long id;
    private String name;
    private Integer exchangeId;
    private Long exchangeDealId;
    private String description;
    private Integer reservePrice;
    private Boolean spotbuy;
    private Boolean accountIsExcluded;
    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Integer exchangeId) {
        this.exchangeId = exchangeId;
    }

    public Long getExchangeDealId() {
        return exchangeDealId;
    }

    public void setExchangeDealId(Long exchangeDealId) {
        this.exchangeDealId = exchangeDealId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(Integer reservePrice) {
        this.reservePrice = reservePrice;
    }

    public Boolean getSpotbuy() {
        return spotbuy;
    }

    public void setSpotbuy(Boolean spotbuy) {
        this.spotbuy = spotbuy;
    }

    public Boolean getAccountIsExcluded() {
        return accountIsExcluded;
    }

    public void setAccountIsExcluded(Boolean accountIsExcluded) {
        this.accountIsExcluded = accountIsExcluded;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", exchangeId=" + exchangeId +
                ", exchangeDealId=" + exchangeDealId +
                ", description='" + description + '\'' +
                ", reservePrice=" + reservePrice +
                ", spotbuy=" + spotbuy +
                ", accountIsExcluded=" + accountIsExcluded +
                ", status=" + status +
                '}';
    }
}
