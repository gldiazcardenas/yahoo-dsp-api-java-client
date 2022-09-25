package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

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
        ERROR
    }

    public enum GoalType {
        CTR,
        CPC,
        CPA,
        CPCV,
        VCPM,
        ROAS,
        CPI
    }

    public enum DemoVendor {
        YAHOO,
        COMSCORE,
        NIELSEN
    }

    private Long id;
    private String name;
    private Status status;
    private GoalType goalType;
    private BigDecimal goalValue;
    private FrequencyCapPeriodType frequencyCapPeriodType;
    private BigDecimal frequencyCapValue;
    private DemoVendor demoVendor;
    private String timezone;
    private String currency;
    private Long accountId;
    private BudgetType budgetType;
    private List<CampaignBudgetSchedule> budgetSchedules;
    private OrderFrequencyCap orderFrequencyCap;

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

    public GoalType getGoalType() {
        return goalType;
    }

    public void setGoalType(GoalType goalType) {
        this.goalType = goalType;
    }

    public BigDecimal getGoalValue() {
        return goalValue;
    }

    public void setGoalValue(BigDecimal goalValue) {
        this.goalValue = goalValue;
    }

    public FrequencyCapPeriodType getFrequencyCapPeriodType() {
        return frequencyCapPeriodType;
    }

    public void setFrequencyCapPeriodType(FrequencyCapPeriodType frequencyCapPeriodType) {
        this.frequencyCapPeriodType = frequencyCapPeriodType;
    }

    public BigDecimal getFrequencyCapValue() {
        return frequencyCapValue;
    }

    public void setFrequencyCapValue(BigDecimal frequencyCapValue) {
        this.frequencyCapValue = frequencyCapValue;
    }

    public DemoVendor getDemoVendor() {
        return demoVendor;
    }

    public void setDemoVendor(DemoVendor demoVendor) {
        this.demoVendor = demoVendor;
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

    public BudgetType getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(BudgetType budgetType) {
        this.budgetType = budgetType;
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

    @Override
    public String toString() {
        return "Campaign{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", goalType=" + goalType +
                ", goalValue=" + goalValue +
                ", frequencyCapPeriodType=" + frequencyCapPeriodType +
                ", frequencyCapValue=" + frequencyCapValue +
                ", demoVendor=" + demoVendor +
                ", timezone='" + timezone + '\'' +
                ", currency='" + currency + '\'' +
                ", accountId=" + accountId +
                ", budgetType=" + budgetType +
                ", budgetSchedules=" + budgetSchedules +
                ", orderFrequencyCap=" + orderFrequencyCap +
                '}';
    }

}
