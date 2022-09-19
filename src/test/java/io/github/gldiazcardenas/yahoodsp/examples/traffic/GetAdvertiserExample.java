package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.AdvertiserResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetAdvertiserExample implements Example {

    public static void main(String[] arg) {
        AdvertiserResponse response = API.getAdvertiserService().getAdvertiser(AUTH, ADVERTISER_ID);
        System.out.println(response);
    }

}
