package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.ReportDateType;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportDimensionType;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportFilterOption;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportFilterOptionValue;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportIntervalType;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportMetricType;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportOption;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportRequest;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportStatusResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;

/**
 * @author Gabriel Diaz, Nov 17th 2022.
 */
public class ExecuteCampaignPerformanceReportExample implements Example {

    public static void main(String[] arg) {
        ReportRequest request = prepareRequest();

        ReportStatusResponse status = API.getReportService().create(AUTH, request);

        String reportUrl = ReportUrlProcessor.getReportUrl(status.getCustomerReportId(), 1);

        System.out.println(reportUrl);
    }

    private static ReportRequest prepareRequest() {
        ReportFilterOptionValue filterValue = new ReportFilterOptionValue();
        filterValue.setId(String.valueOf(CAMPAIGN_ID));

        ReportFilterOption filterOption = new ReportFilterOption();
        filterOption.setDimensionTypeId(ReportDimensionType.CAMPAIGN);
        filterOption.setExcluded(false);
        filterOption.setIncludeValues(new ArrayList<>());
        filterOption.getIncludeValues().add(filterValue);

        ZoneId zoneId = ZoneId.of("America/New_York");

        ReportOption options = new ReportOption();
        options.setTimezone(zoneId.getId());
        options.setCurrency(4);
        options.setDimensionTypeIdValues(new ArrayList<>());
        options.getDimensionTypeIdValues().add(ReportDimensionType.ADVERTISER.getId());
        options.getDimensionTypeIdValues().add(ReportDimensionType.CAMPAIGN.getId());
        options.getDimensionTypeIdValues().add(ReportDimensionType.LINE.getId());
        options.setMetricTypeIdValues(new ArrayList<>());
        options.getMetricTypeIdValues().add(ReportMetricType.CLICKS.getId());
        options.getMetricTypeIdValues().add(ReportMetricType.IMPRESSIONS.getId());
        options.getMetricTypeIdValues().add(ReportMetricType.ADVERTISER_SPENDING.getId());
        options.setFilterOptions(new ArrayList<>());
        options.getFilterOptions().add(filterOption);

        ReportRequest request = new ReportRequest();
        request.setStartDate(LocalDate.now().atStartOfDay().atZone(zoneId));
        request.setEndDate(LocalDate.now().atTime(23, 59, 59).atZone(zoneId));
        request.setDateTypeId(ReportDateType.CUSTOM);
        request.setIntervalTypeId(ReportIntervalType.DAY);
        request.setReportOption(options);

        return request;
    }



}
