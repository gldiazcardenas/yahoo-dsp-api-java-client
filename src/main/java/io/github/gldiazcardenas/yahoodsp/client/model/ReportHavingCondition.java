package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportHavingCondition {

    @JsonProperty("type")
    private ReportHavingOperator operator;
    private ReportMetricType metricTypeId;
    private String value;

    public ReportHavingOperator getOperator() {
        return operator;
    }

    public void setOperator(ReportHavingOperator operator) {
        this.operator = operator;
    }

    public ReportMetricType getMetricTypeId() {
        return metricTypeId;
    }

    public void setMetricTypeId(ReportMetricType metricTypeId) {
        this.metricTypeId = metricTypeId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ReportHavingCondition{" +
                "operator=" + operator +
                ", metricTypeId=" + metricTypeId +
                ", value='" + value + '\'' +
                '}';
    }

}
