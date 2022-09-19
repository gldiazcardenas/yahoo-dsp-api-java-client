package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Advertiser;
import io.github.gldiazcardenas.yahoodsp.client.model.AdvertiserResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Status;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class CreateAdvertiserExample implements Example {

    public static void main(String[] arg) {
        Advertiser advertiser = new Advertiser();
        advertiser.setName("test-advertiser");
        advertiser.setLandingPageUrl("http://test-advertiser.com");
        advertiser.setCurrency("USD");
        advertiser.setStatus(Status.ACTIVE);
        advertiser.setIabCategoryId(3L);
        advertiser.setIabSecondaryCategoryId(301L);
        advertiser.setTimezone("America/New_York");
        AdvertiserResponse response = API.getAdvertiserService().createAdvertiser(AUTH, advertiser);
        System.out.println(response);
    }

}
