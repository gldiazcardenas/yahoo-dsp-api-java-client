package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportOption {

    private String timezone;
    private Integer currency;
    private List<ReportDimensionType> dimensionTypeIds;
    private List<ReportFilterOption> filterOptions;
    private List<ReportMetricType> metricTypeIds;
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

    public List<ReportDimensionType> getDimensionTypeIds() {
        return dimensionTypeIds;
    }

    public void setDimensionTypeIds(List<ReportDimensionType> dimensionTypeIds) {
        this.dimensionTypeIds = dimensionTypeIds;
    }

    public List<ReportFilterOption> getFilterOptions() {
        return filterOptions;
    }

    public void setFilterOptions(List<ReportFilterOption> filterOptions) {
        this.filterOptions = filterOptions;
    }

    public List<ReportMetricType> getMetricTypeIds() {
        return metricTypeIds;
    }

    public void setMetricTypeIds(List<ReportMetricType> metricTypeIds) {
        this.metricTypeIds = metricTypeIds;
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
                ", dimensionTypeIds=" + dimensionTypeIds +
                ", filterOptions=" + filterOptions +
                ", metricTypeIds=" + metricTypeIds +
                ", accountIds=" + accountIds +
                ", having=" + having +
                '}';
    }

}
