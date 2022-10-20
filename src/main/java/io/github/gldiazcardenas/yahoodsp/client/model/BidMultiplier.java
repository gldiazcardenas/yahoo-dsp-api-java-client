package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * @author Gabriel Diaz, Oct 20th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BidMultiplier {

    public enum TargetType {
        AD,
        EXCHANGE,
        DEAL,
        AUCTION_TYPE,
        DAY_PARTING,
        SEGMENT,
        AD_POSITION,
        DOMAIN,
        DEVICE,
        WEATHER_CONDITION
    }

    private Long id;
    private String name;
    private Long lineId;
    private String targetType;
    private Object targetValue;
    private String targetDomain;
    @JsonProperty("isAppName")
    private Boolean appName;
    private BigDecimal multiplier;

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

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public Object getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(Object targetValue) {
        this.targetValue = targetValue;
    }

    public String getTargetDomain() {
        return targetDomain;
    }

    public void setTargetDomain(String targetDomain) {
        this.targetDomain = targetDomain;
    }

    public Boolean getAppName() {
        return appName;
    }

    public void setAppName(Boolean appName) {
        this.appName = appName;
    }

    public BigDecimal getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(BigDecimal multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public String toString() {
        return "BidMultiplier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lineId=" + lineId +
                ", targetType='" + targetType + '\'' +
                ", targetValue=" + targetValue +
                ", targetDomain='" + targetDomain + '\'' +
                ", appName=" + appName +
                ", multiplier=" + multiplier +
                '}';
    }
}
