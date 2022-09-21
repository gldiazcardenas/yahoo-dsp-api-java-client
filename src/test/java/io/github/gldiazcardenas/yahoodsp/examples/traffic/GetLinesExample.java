package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Dir;
import io.github.gldiazcardenas.yahoodsp.client.model.LinesResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.LinesFilter;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetLinesExample implements Example {

    public static void main(String[] arg) {
        LinesResponse response = API.getLineService().getLines(AUTH, new LinesFilter()
                .setOrderId(CAMPAIGN_ID)
                .setQuery("test")
                .setDir(Dir.desc));
        System.out.println(response);
    }

}
