package io.github.gldiazcardenas.yahoodsp.examples.reporting;

import io.github.gldiazcardenas.yahoodsp.client.model.ReportDateType;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportDimensionType;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportFilterOption;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportFilterOptionValue;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportIntervalType;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportMetricType;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportOption;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportRequest;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
public class CreateReportBrokenDownByPublisherWithClicksSpentImpressions implements Example {

    public static void main(String[] arg) {
        ReportFilterOptionValue filterValue = new ReportFilterOptionValue();
        filterValue.setId(String.valueOf(CAMPAIGN_ID));

        ReportFilterOption filterOption = new ReportFilterOption();
        filterOption.setDimensionTypeId(ReportDimensionType.CAMPAIGN);
        filterOption.setExcluded(false);
        filterOption.setIncludeValues(new ArrayList<>());
        filterOption.getIncludeValues().add(filterValue);

        ReportOption options = new ReportOption();
        options.setAccountIds(new ArrayList<>());
        options.getAccountIds().add(ADVERTISER_ID);
        options.setDimensionTypeIds(new ArrayList<>());
        options.getDimensionTypeIds().add(ReportDimensionType.ADVERTISER);
        options.getDimensionTypeIds().add(ReportDimensionType.CAMPAIGN);
        options.getDimensionTypeIds().add(ReportDimensionType.LINE);
        options.getDimensionTypeIds().add(ReportDimensionType.PUBLISHER);
        options.getDimensionTypeIds().add(ReportDimensionType.DOMAIN);
        options.getDimensionTypeIds().add(ReportDimensionType.SUBDOMAIN);
        options.setMetricTypeIds(new ArrayList<>());
        options.getMetricTypeIds().add(ReportMetricType.CLICKS);
        options.getMetricTypeIds().add(ReportMetricType.IMPRESSIONS);
        options.getMetricTypeIds().add(ReportMetricType.ADVERTISER_SPENDING);
        options.setFilterOptions(new ArrayList<>());
        options.getFilterOptions().add(filterOption);

        ReportRequest request = new ReportRequest();
        request.setStartDate(LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()));
        request.setEndDate(ZonedDateTime.now());
        request.setDateTypeId(ReportDateType.CUSTOM);
        request.setIntervalTypeId(ReportIntervalType.DAY);
        request.setReportOption(options);

        API.getReportService().create(AUTH, request);
    }

}
