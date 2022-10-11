package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Gabriel Diaz, Oct 11th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Beacon {

    public enum RuleType {
        EVENTS,
        DESTINATION_URL,
        APP_URL
    }

    public enum ConversionCategory {
        CONVERSION,
        SIGNUP,
        LEAD,
        ADD_TO_CART,
        APP_INSTALLATIONS,
        OTHERS,
        PURCHASE,
        IN_APP_EVENT,
        VIEW_CONTENT,
        ADD_TO_WISHLIST,
        INITIATE_CHECKOUT,
        ADD_PAYMENT_INFO
    }

    private Long id;
    private String name;
    private Long accountId;
    private Long pixelId;
    private RuleType ruleType;
    @JsonProperty("conversion_default_value")
    private Integer conversionDefaultValue;
    @JsonProperty("conversion_category")
    private ConversionCategory conversionCategory;
    private String destinationUrl;
    private String destinationUrlOperator;
    private String appUrl;
    private String appLocale;
    private String appId;
    private String mobileMeasurementPartner;
    private List<BeaconCondition> conditions;
    private String createdAt;
    private String updatedAt;

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

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getPixelId() {
        return pixelId;
    }

    public void setPixelId(Long pixelId) {
        this.pixelId = pixelId;
    }

    public RuleType getRuleType() {
        return ruleType;
    }

    public void setRuleType(RuleType ruleType) {
        this.ruleType = ruleType;
    }

    public Integer getConversionDefaultValue() {
        return conversionDefaultValue;
    }

    public void setConversionDefaultValue(Integer conversionDefaultValue) {
        this.conversionDefaultValue = conversionDefaultValue;
    }

    public ConversionCategory getConversionCategory() {
        return conversionCategory;
    }

    public void setConversionCategory(ConversionCategory conversionCategory) {
        this.conversionCategory = conversionCategory;
    }

    public String getDestinationUrl() {
        return destinationUrl;
    }

    public void setDestinationUrl(String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }

    public String getDestinationUrlOperator() {
        return destinationUrlOperator;
    }

    public void setDestinationUrlOperator(String destinationUrlOperator) {
        this.destinationUrlOperator = destinationUrlOperator;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public String getAppLocale() {
        return appLocale;
    }

    public void setAppLocale(String appLocale) {
        this.appLocale = appLocale;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMobileMeasurementPartner() {
        return mobileMeasurementPartner;
    }

    public void setMobileMeasurementPartner(String mobileMeasurementPartner) {
        this.mobileMeasurementPartner = mobileMeasurementPartner;
    }

    public List<BeaconCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<BeaconCondition> conditions) {
        this.conditions = conditions;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Beacon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountId=" + accountId +
                ", pixelId=" + pixelId +
                ", ruleType=" + ruleType +
                ", conversionDefaultValue=" + conversionDefaultValue +
                ", conversionCategory=" + conversionCategory +
                ", destinationUrl='" + destinationUrl + '\'' +
                ", destinationUrlOperator='" + destinationUrlOperator + '\'' +
                ", appUrl='" + appUrl + '\'' +
                ", appLocale='" + appLocale + '\'' +
                ", appId='" + appId + '\'' +
                ", mobileMeasurementPartner='" + mobileMeasurementPartner + '\'' +
                ", conditions=" + conditions +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
