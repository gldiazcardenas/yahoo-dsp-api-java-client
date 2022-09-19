package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.AdvertisersResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AdvertisersFilter;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetAdvertisersExample implements Example {

    public static void main(String[] arg) {
        AdvertisersResponse response = API.getAdvertiserService().getAdvertisers(AUTH,
                new AdvertisersFilter().setLimit(50));
        System.out.println(response);
    }

}
