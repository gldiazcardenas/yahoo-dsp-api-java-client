package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Sep 28th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Deal {

    private Long id;
    private String name;
    private Status status;
    private Integer exchangeId;
    private Long exchangeDealId;
    private String description;
    private Integer reservePrice;
    private Long accountGroupId;
    private Boolean accountIsExcluded;
    private List<Long> accounts;
    private List<Long> accountGroups;
    private Boolean spotbuy;

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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

    public Long getAccountGroupId() {
        return accountGroupId;
    }

    public void setAccountGroupId(Long accountGroupId) {
        this.accountGroupId = accountGroupId;
    }

    public Boolean getAccountIsExcluded() {
        return accountIsExcluded;
    }

    public void setAccountIsExcluded(Boolean accountIsExcluded) {
        this.accountIsExcluded = accountIsExcluded;
    }

    public List<Long> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Long> accounts) {
        this.accounts = accounts;
    }

    public List<Long> getAccountGroups() {
        return accountGroups;
    }

    public void setAccountGroups(List<Long> accountGroups) {
        this.accountGroups = accountGroups;
    }

    public Boolean getSpotbuy() {
        return spotbuy;
    }

    public void setSpotbuy(Boolean spotbuy) {
        this.spotbuy = spotbuy;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", exchangeId=" + exchangeId +
                ", exchangeDealId=" + exchangeDealId +
                ", description='" + description + '\'' +
                ", reservePrice=" + reservePrice +
                ", accountGroupId=" + accountGroupId +
                ", accountIsExcluded=" + accountIsExcluded +
                ", accounts=" + accounts +
                ", accountGroups=" + accountGroups +
                ", spotbuy=" + spotbuy +
                '}';
    }
}
