package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportOption {

    private String timezone;
    private Integer currency;
    @JsonProperty("dimensionTypeIds")
    private List<Integer> dimensionTypeIdValues;
    private List<ReportFilterOption> filterOptions;
    @JsonProperty("metricTypeIds")
    private List<Integer> metricTypeIdValues;
    private List<Long> accountIds;
    private ReportHaving having;

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    @JsonIgnore
    public List<ReportDimensionType> getDimensionTypeIds() {
        return ReportDimensionType.fromIds(dimensionTypeIdValues);
    }

    @JsonIgnore
    public void setDimensionTypeIds(List<ReportDimensionType> dimensionTypeIds) {
        this.dimensionTypeIdValues = dimensionTypeIds.stream().map(ReportDimensionType::getId).collect(Collectors.toList());
    }

    public List<Integer> getDimensionTypeIdValues() {
        return dimensionTypeIdValues;
    }

    public void setDimensionTypeIdValues(List<Integer> dimensionTypeIdValues) {
        this.dimensionTypeIdValues = dimensionTypeIdValues;
    }

    public List<ReportFilterOption> getFilterOptions() {
        return filterOptions;
    }

    public void setFilterOptions(List<ReportFilterOption> filterOptions) {
        this.filterOptions = filterOptions;
    }

    @JsonIgnore
    public List<ReportMetricType> getMetricTypeIds() {
        return ReportMetricType.fromIds(metricTypeIdValues);
    }

    @JsonIgnore
    public void setMetricTypeIds(List<ReportMetricType> metricTypeIds) {
        this.metricTypeIdValues = metricTypeIds.stream().map(ReportMetricType::getId).collect(Collectors.toList());
    }

    public List<Integer> getMetricTypeIdValues() {
        return metricTypeIdValues;
    }

    public void setMetricTypeIdValues(List<Integer> metricTypeIdValues) {
        this.metricTypeIdValues = metricTypeIdValues;
    }

    public List<Long> getAccountIds() {
        return accountIds;
    }

    public void setAccountIds(List<Long> accountIds) {
        this.accountIds = accountIds;
    }

    public ReportHaving getHaving() {
        return having;
    }

    public void setHaving(ReportHaving having) {
        this.having = having;
    }

    @Override
    public String toString() {
        return "ReportOption{" +
                "timezone='" + timezone + '\'' +
                ", currency=" + currency +
                ", dimensionTypeIds=" + dimensionTypeIdValues +
                ", filterOptions=" + filterOptions +
                ", metricTypeIds=" + metricTypeIdValues +
                ", accountIds=" + accountIds +
                ", having=" + having +
                '}';
    }

}
