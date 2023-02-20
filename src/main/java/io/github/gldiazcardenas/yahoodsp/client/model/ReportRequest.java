package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportRequest {

    private ReportOption reportOption;
    @JsonProperty("limit")
    private ReportLimit limit;
    @JsonProperty("dateTypeId")
    private Integer dateTypeIdValue;
    private Integer dataSource;
    @JsonProperty("intervalTypeId")
    private Integer intervalTypeIdValue;
    @JsonProperty("startDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private ZonedDateTime startDate;
    @JsonProperty("endDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private ZonedDateTime endDate;

    public ReportOption getReportOption() {
        return reportOption;
    }

    public void setReportOption(ReportOption reportOption) {
        this.reportOption = reportOption;
    }

    public ReportLimit getLimit() {
        return limit;
    }

    public void setLimit(ReportLimit limit) {
        this.limit = limit;
    }

    @JsonIgnore
    public ReportDateType getDateTypeId() {
        return ReportDateType.fromId(dateTypeIdValue);
    }

    @JsonIgnore
    public void setDateTypeId(ReportDateType dateTypeId) {
        this.dateTypeIdValue = dateTypeId.getId();
    }

    public Integer getDateTypeIdValue() {
        return dateTypeIdValue;
    }

    public void setDateTypeIdValue(Integer dateTypeIdValue) {
        this.dateTypeIdValue = dateTypeIdValue;
    }

    public Integer getDataSource() {
        return dataSource;
    }

    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    @JsonIgnore
    public ReportIntervalType getIntervalTypeId() {
        return ReportIntervalType.fromId(intervalTypeIdValue);
    }

    @JsonIgnore
    public void setIntervalTypeId(ReportIntervalType intervalTypeId) {
        this.intervalTypeIdValue = intervalTypeId.getId();
    }

    public Integer getIntervalTypeIdValue() {
        return intervalTypeIdValue;
    }

    public void setIntervalTypeIdValue(Integer intervalTypeIdValue) {
        this.intervalTypeIdValue = intervalTypeIdValue;
    }

    public ZonedDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(ZonedDateTime startDate) {
        this.startDate = startDate;
    }

    public ZonedDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(ZonedDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "ReportRequest{" +
                "reportOption=" + reportOption +
                ", limit=" + limit +
                ", dateTypeId=" + dateTypeIdValue +
                ", dataSource=" + dataSource +
                ", intervalTypeId=" + intervalTypeIdValue +
                ", startDate='" + startDate + "'" +
                ", endDate='" + endDate + "'" +
                '}';
    }
}
