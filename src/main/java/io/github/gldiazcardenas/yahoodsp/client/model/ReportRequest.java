package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportRequest {

    private static final DateTimeFormatter OFFSET_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
    private static final DateTimeFormatter NO_OFFSET_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");



    private ReportOption reportOption;
    @JsonProperty("limit")
    private ReportLimit limit;
    @JsonProperty("dateTypeId")
    private Integer dateTypeIdValue;
    private Integer dataSource;
    @JsonProperty("intervalTypeId")
    private Integer intervalTypeIdValue;
    @JsonProperty("startDate")
    private String startDateValue;
    @JsonProperty("endDate")
    private String endDateValue;

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

    public String getStartDateValue() {
        return startDateValue;
    }

    public void setStartDateValue(String startDateValue) {
        this.startDateValue = startDateValue;
    }

    public String getEndDateValue() {
        return endDateValue;
    }

    public void setEndDateValue(String endDateValue) {
        this.endDateValue = endDateValue;
    }

    @JsonIgnore
    public void setStartDate(LocalDateTime startDate) {
        this.startDateValue = NO_OFFSET_FORMATTER.format(startDate.atZone(ZoneId.systemDefault()));
    }

    @JsonIgnore
    public void setStartDate(ZonedDateTime startDate) {
        this.startDateValue = OFFSET_FORMATTER.format(startDate);
    }

    @JsonIgnore
    public void setEndDate(LocalDateTime endDate) {
        this.endDateValue = NO_OFFSET_FORMATTER.format(endDate);
    }

    @JsonIgnore
    public void setEndDate(ZonedDateTime endDate) {
        this.endDateValue = OFFSET_FORMATTER.format(endDate);
    }

    @Override
    public String toString() {
        return "ReportRequest{" +
                "reportOption=" + reportOption +
                ", limit=" + limit +
                ", dateTypeId=" + dateTypeIdValue +
                ", dataSource=" + dataSource +
                ", intervalTypeId=" + intervalTypeIdValue +
                ", startDate='" + startDateValue + "'" +
                ", endDate='" + endDateValue + "'" +
                '}';
    }
}
