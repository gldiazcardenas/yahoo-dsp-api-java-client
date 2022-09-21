package io.github.gldiazcardenas.yahoodsp.client.model;

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
        ERROR
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
        ECPM
    }

    public enum GoalModeType {
        SOFT,
        HARD
    }

    public enum PacingModeType {
        EVEN,
        ASAP,
        PACE_AHEAD
    }

    public enum AppMarketingObjective {
        APP_INSTALL,
        POST_INSTALL,
        RE_ENGAGEMENT
    }

    public enum BillingMethodType {
        CPM_PRICE,
        CPC,
        MARGIN,
        CPCV
    }

    public enum MarginType {
        TOTAL_BUDGET,
        BUYER_COST
    }

    public enum ChannelType {
        DOOH,
        DEFAULT
    }

    private Long id;
    private String name;
    private Long orderId;
    private MediaType mediaType;
    private Status status;
    private GoalType goalType;
    private GoalModeType goalModeType;
    private BigDecimal goalAmount;
    private BigDecimal bidPrice;
    private BigDecimal maxGoal;
    private BigDecimal marginGoal;
    @JsonProperty("isNativeEnabled")
    private Boolean nativeEnabled;
    private PacingModeType pacingModeType;
    private Integer pacingAcceleration;
    private AppMarketingObjective appMarketingObjective;
    private String appUrl;
    private String appLocale;
    private String appId;
    private BudgetType budgetType;
    private BillingMethodType billingMethodType;
    private BigDecimal billingPrice;
    private MarginType marginType;
    private Integer completionThreshold;
    private List<LineBudgetSchedule> schedules;
    private List<Fee> feeList;
    private List<Conversion> conversionList;
    private BidMultiplierCap bidMultiplierCap;
    private ChannelType channelType;

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

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public GoalType getGoalType() {
        return goalType;
    }

    public void setGoalType(GoalType goalType) {
        this.goalType = goalType;
    }

    public GoalModeType getGoalModeType() {
        return goalModeType;
    }

    public void setGoalModeType(GoalModeType goalModeType) {
        this.goalModeType = goalModeType;
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

    public PacingModeType getPacingModeType() {
        return pacingModeType;
    }

    public void setPacingModeType(PacingModeType pacingModeType) {
        this.pacingModeType = pacingModeType;
    }

    public Integer getPacingAcceleration() {
        return pacingAcceleration;
    }

    public void setPacingAcceleration(Integer pacingAcceleration) {
        this.pacingAcceleration = pacingAcceleration;
    }

    public AppMarketingObjective getAppMarketingObjective() {
        return appMarketingObjective;
    }

    public void setAppMarketingObjective(AppMarketingObjective appMarketingObjective) {
        this.appMarketingObjective = appMarketingObjective;
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

    public BudgetType getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(BudgetType budgetType) {
        this.budgetType = budgetType;
    }

    public BillingMethodType getBillingMethodType() {
        return billingMethodType;
    }

    public void setBillingMethodType(BillingMethodType billingMethodType) {
        this.billingMethodType = billingMethodType;
    }

    public BigDecimal getBillingPrice() {
        return billingPrice;
    }

    public void setBillingPrice(BigDecimal billingPrice) {
        this.billingPrice = billingPrice;
    }

    public MarginType getMarginType() {
        return marginType;
    }

    public void setMarginType(MarginType marginType) {
        this.marginType = marginType;
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

    public ChannelType getChannelType() {
        return channelType;
    }

    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType;
    }

    @Override
    public String toString() {
        return "Line{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", orderId=" + orderId +
                ", mediaType=" + mediaType +
                ", status=" + status +
                ", goalType=" + goalType +
                ", goalModeType=" + goalModeType +
                ", goalAmount=" + goalAmount +
                ", bidPrice=" + bidPrice +
                ", maxGoal=" + maxGoal +
                ", marginGoal=" + marginGoal +
                ", nativeEnabled=" + nativeEnabled +
                ", pacingModeType=" + pacingModeType +
                ", pacingAcceleration=" + pacingAcceleration +
                ", appMarketingObjective=" + appMarketingObjective +
                ", appUrl='" + appUrl + '\'' +
                ", appLocale='" + appLocale + '\'' +
                ", appId='" + appId + '\'' +
                ", budgetType=" + budgetType +
                ", billingMethodType=" + billingMethodType +
                ", billingPrice=" + billingPrice +
                ", marginType=" + marginType +
                ", completionThreshold=" + completionThreshold +
                ", schedules=" + schedules +
                ", feeList=" + feeList +
                ", conversionList=" + conversionList +
                ", bidMultiplierCap=" + bidMultiplierCap +
                ", channelType=" + channelType +
                '}';
    }
}
