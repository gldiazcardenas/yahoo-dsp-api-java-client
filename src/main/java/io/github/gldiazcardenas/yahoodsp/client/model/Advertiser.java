package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * @author Gabriel Diaz, Sep 19th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Advertiser {

    private Long id;
    private String name;
    @JsonProperty("status")
    private String statusValue;
    private String landingPageUrl;
    private Long iabCategoryId;
    private Long iabSecondaryCategoryId;
    private String timezone;
    private String currency;
    private BigDecimal billingPrice;
    private AdvertiserContact contact;
    private AdvertiserBillingContact billingContact;
    @JsonProperty("isCrossdeviceOff")
    private Boolean crossDeviceOff;

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

    @JsonIgnore
    public Status getStatus() {
        return Status.fromValue(statusValue);
    }

    @JsonIgnore
    public void setStatus(Status status) {
        this.statusValue = status.name();
    }

    public String getStatusValue() {
        return statusValue;
    }

    public void setStatusValue(String statusValue) {
        this.statusValue = statusValue;
    }

    public String getLandingPageUrl() {
        return landingPageUrl;
    }

    public void setLandingPageUrl(String landingPageUrl) {
        this.landingPageUrl = landingPageUrl;
    }

    public Long getIabCategoryId() {
        return iabCategoryId;
    }

    public void setIabCategoryId(Long iabCategoryId) {
        this.iabCategoryId = iabCategoryId;
    }

    public Long getIabSecondaryCategoryId() {
        return iabSecondaryCategoryId;
    }

    public void setIabSecondaryCategoryId(Long iabSecondaryCategoryId) {
        this.iabSecondaryCategoryId = iabSecondaryCategoryId;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getBillingPrice() {
        return billingPrice;
    }

    public void setBillingPrice(BigDecimal billingPrice) {
        this.billingPrice = billingPrice;
    }

    public AdvertiserContact getContact() {
        return contact;
    }

    public void setContact(AdvertiserContact contact) {
        this.contact = contact;
    }

    public AdvertiserBillingContact getBillingContact() {
        return billingContact;
    }

    public void setBillingContact(AdvertiserBillingContact billingContact) {
        this.billingContact = billingContact;
    }

    public Boolean getCrossDeviceOff() {
        return crossDeviceOff;
    }

    public void setCrossDeviceOff(Boolean crossDeviceOff) {
        this.crossDeviceOff = crossDeviceOff;
    }

    @Override
    public String toString() {
        return "Advertiser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + statusValue +
                ", landingPageUrl='" + landingPageUrl + '\'' +
                ", iabCategoryId=" + iabCategoryId +
                ", iabSecondaryCategoryId=" + iabSecondaryCategoryId +
                ", timezone='" + timezone + '\'' +
                ", currency='" + currency + '\'' +
                ", billingPrice=" + billingPrice +
                ", contact=" + contact +
                ", billingContact=" + billingContact +
                ", crossDeviceOff=" + crossDeviceOff +
                '}';
    }
}
