package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Gabriel Diaz, Sep 19th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BudgetSchedule {

    public enum Type {
        TOTAL_BUDGET,
        SPECIFIED_AMOUNT,
        AUTO_ALLOCATED
    }

    private Long id;
    private String scheduleName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate startDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate endDate;
    private Type scheduleBudgetType;
    private BigDecimal scheduleBudget;
    private BigDecimal scheduleDailyBudget;
    private Integer impBudget;
    private Integer impDailyBudget;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
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

    public Type getScheduleBudgetType() {
        return scheduleBudgetType;
    }

    public void setScheduleBudgetType(Type scheduleBudgetType) {
        this.scheduleBudgetType = scheduleBudgetType;
    }

    public BigDecimal getScheduleBudget() {
        return scheduleBudget;
    }

    public void setScheduleBudget(BigDecimal scheduleBudget) {
        this.scheduleBudget = scheduleBudget;
    }

    public BigDecimal getScheduleDailyBudget() {
        return scheduleDailyBudget;
    }

    public void setScheduleDailyBudget(BigDecimal scheduleDailyBudget) {
        this.scheduleDailyBudget = scheduleDailyBudget;
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
        return "BudgetSchedule{" +
                "id=" + id +
                ", scheduleName='" + scheduleName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", scheduleBudgetType=" + scheduleBudgetType +
                ", scheduleBudget=" + scheduleBudget +
                ", scheduleDailyBudget=" + scheduleDailyBudget +
                ", impBudget=" + impBudget +
                ", impDailyBudget=" + impDailyBudget +
                '}';
    }

}
