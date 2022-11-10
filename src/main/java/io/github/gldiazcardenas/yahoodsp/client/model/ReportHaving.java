package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportHaving {

    @JsonProperty("type")
    private String operatorValue;
    @JsonProperty("havingSpecs")
    private List<ReportHavingCondition> conditions;

    @JsonIgnore
    public ReportHavingOperator getOperator() {
        return ReportHavingOperator.fromValue(operatorValue);
    }

    @JsonProperty
    public void setOperator(ReportHavingOperator operator) {
        this.operatorValue = operator.name();
    }

    public String getOperatorValue() {
        return operatorValue;
    }

    public void setOperatorValue(String operatorValue) {
        this.operatorValue = operatorValue;
    }

    public List<ReportHavingCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<ReportHavingCondition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        return "ReportHaving{" +
                "operator=" + operatorValue +
                ", conditions=" + conditions +
                '}';
    }
}
