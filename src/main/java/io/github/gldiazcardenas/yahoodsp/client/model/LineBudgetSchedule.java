package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Gabriel Diaz, Sep 19th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LineBudgetSchedule {

    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @JsonProperty("startDateStr")
    private LocalDate startDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @JsonProperty("endDateStr")
    private LocalDate endDate;
    @JsonProperty("dailyBudgetType")
    private String dailyBudgetTypeValue;
    private BigDecimal budget;
    private BigDecimal dailyBudget;
    private Integer impBudget;
    private Integer impDailyBudget;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @JsonIgnore
    public BudgetScheduleType getDailyBudgetType() {
        return BudgetScheduleType.fromValue(dailyBudgetTypeValue);
    }

    @JsonIgnore
    public void setDailyBudgetType(BudgetScheduleType dailyBudgetType) {
        this.dailyBudgetTypeValue = dailyBudgetType.name();
    }

    public String getDailyBudgetTypeValue() {
        return dailyBudgetTypeValue;
    }

    public void setDailyBudgetTypeValue(String dailyBudgetTypeValue) {
        this.dailyBudgetTypeValue = dailyBudgetTypeValue;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public BigDecimal getDailyBudget() {
        return dailyBudget;
    }

    public void setDailyBudget(BigDecimal dailyBudget) {
        this.dailyBudget = dailyBudget;
    }

    public Integer getImpBudget() {
        return impBudget;
    }

    public void setImpBudget(Integer impBudget) {
        this.impBudget = impBudget;
    }

    public Integer getImpDailyBudget() {
        return impDailyBudget;
    }

    public void setImpDailyBudget(Integer impDailyBudget) {
        this.impDailyBudget = impDailyBudget;
    }

    @Override
    public String toString() {
        return "LineBudgetSchedule{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", dailyBudgetType=" + dailyBudgetTypeValue +
                ", budget=" + budget +
                ", dailyBudget=" + dailyBudget +
                ", impBudget=" + impBudget +
                ", impDailyBudget=" + impDailyBudget +
                '}';
    }

}
