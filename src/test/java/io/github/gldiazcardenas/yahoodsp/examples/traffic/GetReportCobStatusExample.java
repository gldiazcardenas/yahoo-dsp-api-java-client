package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.ReportCobStatusResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

import java.time.LocalDate;

/**
 * @author Gabriel Diaz, Nov 17th 2022.
 */
public class GetReportCobStatusExample implements Example {

    public static void main(String[] arg) {
        ReportCobStatusResponse response = API.getReportService().getCobStatus(AUTH, ADVERTISER_ID, LocalDate.now());
        System.out.println(response);
    }

}
