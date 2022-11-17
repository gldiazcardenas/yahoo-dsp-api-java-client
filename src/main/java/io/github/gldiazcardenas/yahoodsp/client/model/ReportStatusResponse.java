package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportStatusResponse {

    private String customerReportId;
    @JsonProperty("status")
    private String statusValue;
    private String url;
    private String reportFormat;
    private String requestPayload;
    private String jobStartDate;
    private String jobEndDate;
    private Long numRows;

    public String getCustomerReportId() {
        return customerReportId;
    }

    public void setCustomerReportId(String customerReportId) {
        this.customerReportId = customerReportId;
    }

    @JsonIgnore
    public ReportStatus getStatus() {
        return ReportStatus.fromValue(statusValue);
    }

    @JsonIgnore
    public void setStatus(ReportStatus status) {
        this.statusValue = status.name();
    }

    public String getStatusValue() {
        return statusValue;
    }

    public void setStatusValue(String statusValue) {
        this.statusValue = statusValue;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public String getRequestPayload() {
        return requestPayload;
    }

    public void setRequestPayload(String requestPayload) {
        this.requestPayload = requestPayload;
    }

    public String getJobStartDate() {
        return jobStartDate;
    }

    public void setJobStartDate(String jobStartDate) {
        this.jobStartDate = jobStartDate;
    }

    public String getJobEndDate() {
        return jobEndDate;
    }

    public void setJobEndDate(String jobEndDate) {
        this.jobEndDate = jobEndDate;
    }

    public Long getNumRows() {
        return numRows;
    }

    public void setNumRows(Long numRows) {
        this.numRows = numRows;
    }

    @Override
    public String toString() {
        return "ReportStatusResponse{" +
                "customerReportId='" + customerReportId + '\'' +
                ", status=" + statusValue +
                ", url='" + url + '\'' +
                ", reportFormat='" + reportFormat + '\'' +
                ", requestPayload=" + requestPayload +
                ", jobStartDate='" + jobStartDate + '\'' +
                ", jobEndDate='" + jobEndDate + '\'' +
                ", numRows=" + numRows +
                '}';
    }
}
