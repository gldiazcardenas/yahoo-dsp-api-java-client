package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportRequest {

    private ReportOption reportOption;
    @JsonProperty("limit")
    private ReportLimit limit;
    private ReportDateType dateTypeId;
    private Integer dataSource;
    private ReportIntervalType intervalTypeId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDateTime startDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDateTime endDate;

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

    public ReportDateType getDateTypeId() {
        return dateTypeId;
    }

    public void setDateTypeId(ReportDateType dateTypeId) {
        this.dateTypeId = dateTypeId;
    }

    public Integer getDataSource() {
        return dataSource;
    }

    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    public ReportIntervalType getIntervalTypeId() {
        return intervalTypeId;
    }

    public void setIntervalTypeId(ReportIntervalType intervalTypeId) {
        this.intervalTypeId = intervalTypeId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "ReportRequest{" +
                "reportOption=" + reportOption +
                ", limit=" + limit +
                ", dateTypeId=" + dateTypeId +
                ", dataSource=" + dataSource +
                ", intervalTypeId=" + intervalTypeId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
