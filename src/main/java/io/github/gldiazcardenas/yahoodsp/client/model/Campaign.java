package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Gabriel Diaz, Sep 19th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Campaign {

    public enum Status {
        ACTIVE,
        PAUSED,
        INACTIVE,
        STOP_TOTAL_BUDGET,
        STOP_DAILY_BUDGET,
        NOT_STARTED,
        ENDED,
        NO_ADS_ADDED,
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
        CTR,
        CPC,
        CPA,
        CPCV,
        VCPM,
        ROAS,
        CPI,
        ENHANCED_CPC;

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

    public enum DemoVendor {
        YAHOO,
        COMSCORE,
        NIELSEN;

        public static DemoVendor fromValue(String value) {
            if (value != null && !value.isEmpty()) {
                for (DemoVendor type : values()) {
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
    @JsonProperty("status")
    private String statusValue;
    @JsonProperty("goalType")
    private String goalTypeValue;
    private BigDecimal goalValue;
    @JsonProperty("frequencyCapPeriodType")
    private String frequencyCapPeriodTypeValue;
    private BigDecimal frequencyCapValue;
    @JsonProperty("demoVendor")
    private String demoVendorValue;
    private String timezone;
    private String currency;
    private Long accountId;
    @JsonProperty("budgetType")
    private String budgetTypeValue;
    private List<CampaignBudgetSchedule> budgetSchedules;
    private OrderFrequencyCap orderFrequencyCap;
    private Boolean packageEnabled;

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

    public BigDecimal getGoalValue() {
        return goalValue;
    }

    public void setGoalValue(BigDecimal goalValue) {
        this.goalValue = goalValue;
    }

    @JsonIgnore
    public FrequencyCapPeriodType getFrequencyCapPeriodType() {
        return FrequencyCapPeriodType.fromValue(frequencyCapPeriodTypeValue);
    }

    @JsonIgnore
    public void setFrequencyCapPeriodType(FrequencyCapPeriodType frequencyCapPeriodType) {
        this.frequencyCapPeriodTypeValue = frequencyCapPeriodType.name();
    }

    public String getFrequencyCapPeriodTypeValue() {
        return frequencyCapPeriodTypeValue;
    }

    public void setFrequencyCapPeriodTypeValue(String frequencyCapPeriodTypeValue) {
        this.frequencyCapPeriodTypeValue = frequencyCapPeriodTypeValue;
    }

    public BigDecimal getFrequencyCapValue() {
        return frequencyCapValue;
    }

    public void setFrequencyCapValue(BigDecimal frequencyCapValue) {
        this.frequencyCapValue = frequencyCapValue;
    }

    @JsonIgnore
    public DemoVendor getDemoVendor() {
        return DemoVendor.fromValue(demoVendorValue);
    }

    @JsonIgnore
    public void setDemoVendor(DemoVendor demoVendor) {
        this.demoVendorValue = demoVendor.name();
    }

    public String getDemoVendorValue() {
        return demoVendorValue;
    }

    public void setDemoVendorValue(String demoVendorValue) {
        this.demoVendorValue = demoVendorValue;
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

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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

    public List<CampaignBudgetSchedule> getBudgetSchedules() {
        return budgetSchedules;
    }

    public void setBudgetSchedules(List<CampaignBudgetSchedule> budgetSchedules) {
        this.budgetSchedules = budgetSchedules;
    }

    public OrderFrequencyCap getOrderFrequencyCap() {
        return orderFrequencyCap;
    }

    public void setOrderFrequencyCap(OrderFrequencyCap orderFrequencyCap) {
        this.orderFrequencyCap = orderFrequencyCap;
    }

    public Boolean getPackageEnabled() {
        return packageEnabled;
    }

    public void setPackageEnabled(Boolean packageEnabled) {
        this.packageEnabled = packageEnabled;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + statusValue + '\'' +
                ", goalType='" + goalTypeValue + '\'' +
                ", goalValue=" + goalValue +
                ", frequencyCapPeriodType='" + frequencyCapPeriodTypeValue + '\'' +
                ", frequencyCapValue=" + frequencyCapValue +
                ", demoVendor='" + demoVendorValue + '\'' +
                ", timezone='" + timezone + '\'' +
                ", currency='" + currency + '\'' +
                ", accountId=" + accountId +
                ", budgetType='" + budgetTypeValue + '\'' +
                ", budgetSchedules=" + budgetSchedules +
                ", orderFrequencyCap=" + orderFrequencyCap +
                ", packageEnabled=" + packageEnabled +
                '}';
    }

}
