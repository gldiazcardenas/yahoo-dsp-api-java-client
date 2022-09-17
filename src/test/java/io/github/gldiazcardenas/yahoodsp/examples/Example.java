package io.github.gldiazcardenas.yahoodsp.examples;

import io.github.gldiazcardenas.yahoodsp.Payloads;
import io.github.gldiazcardenas.yahoodsp.client.DspApi;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;

/**
 * @author Gabriel Diaz, Aug 25th 2022.
 */
public interface Example {

    Long ADVERTISER_ID = 0L;
    Long SEAT_ID = 0L;
    Long CATEGORY_ID = 0L;
    String CLIENT_ID = "<<CLIENT_ID>>";
    String CLIENT_SECRET = "<<CLIENT_SECRET>>";
    String ACCESS_TOKEN = "<<ACCESS_TOKEN>>";
    Authentication AUTH = Payloads.authentication().setAccessToken(ACCESS_TOKEN);
    DspApi API = DspApi.builder().build();

}
