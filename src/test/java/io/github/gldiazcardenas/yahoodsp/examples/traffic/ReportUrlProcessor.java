package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.ReportStatus;
import io.github.gldiazcardenas.yahoodsp.client.model.ReportStatusResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Nov 17th 2022.
 */
class ReportUrlProcessor implements Example {

    private static final int MAX_ATTEMPTS = 5;
    private static final long RETRY_DELAY = 1000;

    static String getReportUrl(String customReportId, int attempt) {
        if (customReportId == null) {
            return null;
        }

        if (attempt > MAX_ATTEMPTS) {
            return null;
        }

        ReportStatusResponse status = API.getReportService().getStatus(AUTH, customReportId);

        if (status == null || status.getStatus() == null) {
            return null;
        }

        if (status.getStatus() == ReportStatus.Failed) {
            return null;
        }

        if (status.getStatus() == ReportStatus.Success) {
            return status.getUrl();
        }

        try {
            Thread.sleep(RETRY_DELAY);
        }
        catch (InterruptedException e) {
            // Do nothing
        }

        return getReportUrl(status.getCustomerReportId(), attempt + 1);
    }

}
