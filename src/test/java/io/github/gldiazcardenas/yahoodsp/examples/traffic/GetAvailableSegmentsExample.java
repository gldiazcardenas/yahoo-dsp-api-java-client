package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.SegmentsResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.SegmentsFilter;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetAvailableSegmentsExample implements Example {

    public static void main(String[] arg) {
        SegmentsResponse response = API.getTargetingService().getAvailableSegments(AUTH, new SegmentsFilter()
                .setAccountId(ADVERTISER_ID)
                .setQuery("car"));
        System.out.println(response);
    }

}
