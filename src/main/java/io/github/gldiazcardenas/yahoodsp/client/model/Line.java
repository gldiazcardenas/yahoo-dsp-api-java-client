package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Gabriel Diaz, Sep 21th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Line {

    public enum Status {
        ACTIVE,
        PAUSED,
        INACTIVE,
        STOP_TOTAL_BUDGET,
        STOP_DAILY_BUDGET,
        NOT_STARTED,
        ENDED,
        ERROR;
        public static Status fromValue(String value) {
            if (value != null && !value.isEmpty()) {
                for (Status type : values()) {
                    if (type.name().equals(value)) {
                        return type;
                    }
                }
            }
            throw new UnsupportedOperationException("Unmapped value: " + value);
        }
    }

    public enum GoalType {
        NONE,
        CPI,
        CPC,
        CPA,
        VCPM,
        ROAS,
        MAXINVIEWRATE,
        OCPC,
        CPCV,
        MAXCOMPLETIONRATE,
        MAXCTR,
        COMPLETION_HARD_THRESHOLD,
        ECPM;
        public static GoalType fromValue(String value) {
            if (value != null && !value.isEmpty()) {
                for (GoalType type : values()) {
                    if (type.name().equals(value)) {
                        return type;
                    }
                }
            }
            throw new UnsupportedOperationException("Unmapped value: " + value);
        }
    }

    public enum GoalModeType {
        SOFT,
        HARD;
        public static GoalModeType fromValue(String value) {
            if (value != null && !value.isEmpty()) {
                for (GoalModeType type : values()) {
                    if (type.name().equals(value)) {
                        return type;
                    }
                }
            }
            throw new UnsupportedOperationException("Unmapped value: " + value);
        }
    }

    public enum PacingModeType {
        EVEN,
        ASAP,
        PACE_AHEAD;
        public static PacingModeType fromValue(String value) {
            if (value != null && !value.isEmpty()) {
                for (PacingModeType type : values()) {
                    if (type.name().equals(value)) {
                        return type;
                    }
                }
            }
            throw new UnsupportedOperationException("Unmapped value: " + value);
        }
    }

    public enum AppMarketingObjective {
        APP_INSTALL,
        POST_INSTALL,
        RE_ENGAGEMENT;
        public static AppMarketingObjective fromValue(String value) {
            if (value != null && !value.isEmpty()) {
                for (AppMarketingObjective type : values()) {
                    if (type.name().equals(value)) {
                        return type;
                    }
                }
            }
            throw new UnsupportedOperationException("Unmapped value: " + value);
        }
    }

    public enum BillingMethodType {
        CPM_PRICE,
        CPC,
        MARGIN,
        CPCV,
        CPC_WITH_MARGIN;
        public static BillingMethodType fromValue(String value) {
            if (value != null && !value.isEmpty()) {
                for (BillingMethodType type : values()) {
                    if (type.name().equals(value)) {
                        return type;
                    }
                }
            }
            throw new UnsupportedOperationException("Unmapped value: " + value);
        }
    }

    public enum MarginType {
        TOTAL_BUDGET,
        BUYER_COST;
        public static MarginType fromValue(String value) {
            if (value != null && !value.isEmpty()) {
                for (MarginType type : values()) {
                    if (type.name().equals(value)) {
                        return type;
                    }
                }
            }
            throw new UnsupportedOperationException("Unmapped value: " + value);
        }
    }

    public enum ChannelType {
        DOOH,
        DEFAULT;
        public static ChannelType fromValue(String value) {
            if (value != null && !value.isEmpty()) {
                for (ChannelType type : values()) {
                    if (type.name().equals(value)) {
                        return type;
                    }
                }
            }
            throw new UnsupportedOperationException("Unmapped value: " + value);
        }
    }

    public enum SupplyType {
        YAHOO;
        public static SupplyType fromValue(String value) {
            if (value != null && !value.isEmpty()) {
                for (SupplyType type : values()) {
                    if (type.name().equals(value)) {
                        return type;
                    }
                }
            }
            throw new UnsupportedOperationException("Unmapped value: " + value);
        }
    }

    private Long id;
    private String name;
    private Long orderId;
    @JsonProperty("mediaType")
    private String mediaTypeValue;
    @JsonProperty("status")
    private String statusValue;
    @JsonProperty("goalType")
    private String goalTypeValue;
    @JsonProperty("goalModeType")
    private String goalModeTypeValue;
    private BigDecimal goalAmount;
    private BigDecimal bidPrice;
    private BigDecimal maxGoal;
    private BigDecimal marginGoal;
    @JsonProperty("isNativeEnabled")
    private Boolean nativeEnabled;
    @JsonProperty("pacingModeType")
    private String pacingModeTypeValue;
    private Integer pacingAcceleration;
    @JsonProperty("appMarketingObjective")
    private String appMarketingObjectiveValue;
    private String appUrl;
    private String appLocale;
    private String appId;
    @JsonProperty("budgetType")
    private String budgetTypeValue;
    @JsonProperty("billingMethodType")
    private String billingMethodTypeValue;
    private BigDecimal billingPrice;
    @JsonProperty("marginType")
    private String marginTypeValue;
    private Integer completionThreshold;
    private List<LineBudgetSchedule> schedules;
    private List<Fee> feeList;
    private List<Conversion> conversionList;
    private BidMultiplierCap bidMultiplierCap;
    @JsonProperty("channelType")
    private String channelTypeValue;
    @JsonProperty("supplyType")
    private String supplyTypeValue;
    @JsonProperty("language")
    private String languageValue;

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

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @JsonIgnore
    public MediaType getMediaType() {
        return MediaType.fromValue(mediaTypeValue);
    }

    @JsonIgnore
    public void setMediaType(MediaType mediaType) {
        this.mediaTypeValue = mediaType.name();
    }

    public String getMediaTypeValue() {
        return mediaTypeValue;
    }

    public void setMediaTypeValue(String mediaTypeValue) {
        this.mediaTypeValue = mediaTypeValue;
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

    @JsonIgnore
    public GoalType getGoalType() {
        return GoalType.fromValue(goalTypeValue);
    }

    @JsonIgnore
    public void setGoalType(GoalType goalType) {
        this.goalTypeValue = goalType.name();
    }

    public String getGoalTypeValue() {
        return goalTypeValue;
    }

    public void setGoalTypeValue(String goalTypeValue) {
        this.goalTypeValue = goalTypeValue;
    }

    @JsonIgnore
    public GoalModeType getGoalModeType() {
        return GoalModeType.fromValue(goalModeTypeValue);
    }

    @JsonIgnore
    public void setGoalModeType(GoalModeType goalModeType) {
        this.goalModeTypeValue = goalModeType.name();
    }

    public String getGoalModeTypeValue() {
        return goalModeTypeValue;
    }

    public void setGoalModeTypeValue(String goalModeTypeValue) {
        this.goalModeTypeValue = goalModeTypeValue;
    }

    public BigDecimal getGoalAmount() {
        return goalAmount;
    }

    public void setGoalAmount(BigDecimal goalAmount) {
        this.goalAmount = goalAmount;
    }

    public BigDecimal getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(BigDecimal bidPrice) {
        this.bidPrice = bidPrice;
    }

    public BigDecimal getMaxGoal() {
        return maxGoal;
    }

    public void setMaxGoal(BigDecimal maxGoal) {
        this.maxGoal = maxGoal;
    }

    public BigDecimal getMarginGoal() {
        return marginGoal;
    }

    public void setMarginGoal(BigDecimal marginGoal) {
        this.marginGoal = marginGoal;
    }

    public Boolean getNativeEnabled() {
        return nativeEnabled;
    }

    public void setNativeEnabled(Boolean nativeEnabled) {
        this.nativeEnabled = nativeEnabled;
    }

    @JsonIgnore
    public PacingModeType getPacingModeType() {
        return PacingModeType.fromValue(pacingModeTypeValue);
    }

    @JsonIgnore
    public void setPacingModeType(PacingModeType pacingModeType) {
        this.pacingModeTypeValue = pacingModeType.name();
    }

    public String getPacingModeTypeValue() {
        return pacingModeTypeValue;
    }

    public void setPacingModeTypeValue(String pacingModeTypeValue) {
        this.pacingModeTypeValue = pacingModeTypeValue;
    }

    public Integer getPacingAcceleration() {
        return pacingAcceleration;
    }

    public void setPacingAcceleration(Integer pacingAcceleration) {
        this.pacingAcceleration = pacingAcceleration;
    }

    @JsonIgnore
    public AppMarketingObjective getAppMarketingObjective() {
        return AppMarketingObjective.fromValue(appMarketingObjectiveValue);
    }

    @JsonIgnore
    public void setAppMarketingObjective(AppMarketingObjective appMarketingObjective) {
        this.appMarketingObjectiveValue = appMarketingObjective.name();
    }

    public String getAppMarketingObjectiveValue() {
        return appMarketingObjectiveValue;
    }

    public void setAppMarketingObjectiveValue(String appMarketingObjectiveValue) {
        this.appMarketingObjectiveValue = appMarketingObjectiveValue;
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

    @JsonIgnore
    public BudgetType getBudgetType() {
        return BudgetType.fromValue(budgetTypeValue);
    }

    @JsonIgnore
    public void setBudgetType(BudgetType budgetType) {
        this.budgetTypeValue = budgetType.name();
    }

    public String getBudgetTypeValue() {
        return budgetTypeValue;
    }

    public void setBudgetTypeValue(String budgetTypeValue) {
        this.budgetTypeValue = budgetTypeValue;
    }

    @JsonIgnore
    public BillingMethodType getBillingMethodType() {
        return BillingMethodType.fromValue(billingMethodTypeValue);
    }

    @JsonIgnore
    public void setBillingMethodType(BillingMethodType billingMethodType) {
        this.billingMethodTypeValue = billingMethodType.name();
    }

    public String getBillingMethodTypeValue() {
        return billingMethodTypeValue;
    }

    public void setBillingMethodTypeValue(String billingMethodTypeValue) {
        this.billingMethodTypeValue = billingMethodTypeValue;
    }

    public BigDecimal getBillingPrice() {
        return billingPrice;
    }

    public void setBillingPrice(BigDecimal billingPrice) {
        this.billingPrice = billingPrice;
    }

    @JsonIgnore
    public MarginType getMarginType() {
        return MarginType.fromValue(marginTypeValue);
    }

    @JsonIgnore
    public void setMarginType(MarginType marginType) {
        this.marginTypeValue = marginType.name();
    }

    public Integer getCompletionThreshold() {
        return completionThreshold;
    }

    public void setCompletionThreshold(Integer completionThreshold) {
        this.completionThreshold = completionThreshold;
    }

    public List<LineBudgetSchedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<LineBudgetSchedule> schedules) {
        this.schedules = schedules;
    }

    public List<Fee> getFeeList() {
        return feeList;
    }

    public void setFeeList(List<Fee> feeList) {
        this.feeList = feeList;
    }

    public List<Conversion> getConversionList() {
        return conversionList;
    }

    public void setConversionList(List<Conversion> conversionList) {
        this.conversionList = conversionList;
    }

    public BidMultiplierCap getBidMultiplierCap() {
        return bidMultiplierCap;
    }

    public void setBidMultiplierCap(BidMultiplierCap bidMultiplierCap) {
        this.bidMultiplierCap = bidMultiplierCap;
    }

    @JsonIgnore
    public ChannelType getChannelType() {
        return ChannelType.fromValue(channelTypeValue);
    }

    @JsonIgnore
    public void setChannelType(ChannelType channelType) {
        this.channelTypeValue = channelType.name();
    }

    public String getChannelTypeValue() {
        return channelTypeValue;
    }

    public void setChannelTypeValue(String channelTypeValue) {
        this.channelTypeValue = channelTypeValue;
    }

    @JsonIgnore
    public SupplyType getSupplyType() {
        return SupplyType.fromValue(supplyTypeValue);
    }

    @JsonIgnore
    public void setSupplyType(SupplyType supplyType) {
        this.supplyTypeValue = supplyType.name();
    }

    public String getSupplyTypeValue() {
        return supplyTypeValue;
    }

    public void setSupplyTypeValue(String supplyTypeValue) {
        this.supplyTypeValue = supplyTypeValue;
    }

    @JsonIgnore
    public LanguageType getLanguage() {
        return LanguageType.fromValue(languageValue);
    }

    @JsonIgnore
    public void setLanguage(LanguageType language) {
        this.languageValue = language.name();
    }

    public String getLanguageValue() {
        return languageValue;
    }

    public void setLanguageValue(String languageValue) {
        this.languageValue = languageValue;
    }

    @Override
    public String toString() {
        return "Line{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", orderId=" + orderId +
                ", mediaType='" + mediaTypeValue + '\'' +
                ", status='" + statusValue + '\'' +
                ", goalType='" + goalTypeValue + '\'' +
                ", goalModeType='" + goalModeTypeValue + '\'' +
                ", goalAmount=" + goalAmount +
                ", bidPrice=" + bidPrice +
                ", maxGoal=" + maxGoal +
                ", marginGoal=" + marginGoal +
                ", nativeEnabled=" + nativeEnabled +
                ", pacingModeType='" + pacingModeTypeValue + '\'' +
                ", pacingAcceleration=" + pacingAcceleration +
                ", appMarketingObjective='" + appMarketingObjectiveValue + '\'' +
                ", appUrl='" + appUrl + '\'' +
                ", appLocale='" + appLocale + '\'' +
                ", appId='" + appId + '\'' +
                ", budgetType='" + budgetTypeValue + '\'' +
                ", billingMethodType='" + billingMethodTypeValue + '\'' +
                ", billingPrice=" + billingPrice +
                ", marginType='" + marginTypeValue + '\'' +
                ", completionThreshold=" + completionThreshold +
                ", schedules=" + schedules +
                ", feeList=" + feeList +
                ", conversionList=" + conversionList +
                ", bidMultiplierCap=" + bidMultiplierCap +
                ", channelType='" + channelTypeValue + '\'' +
                ", supplyType='" + supplyTypeValue + '\'' +
                ", language='" + languageValue + '\'' +
                '}';
    }
}
