package io.github.gldiazcardenas.yahoodsp.examples;

import io.github.gldiazcardenas.yahoodsp.client.DspApi;

/**
 * @author Gabriel Diaz, Aug 25th 2022.
 */
public interface Example {

    String CLIENT_ID = "<<INSERT>>";
    String CLIENT_SECRET = "<<INSERT>>";
    String ACCESS_TOKEN = "<<INSERT>>";
    DspApi API = DspApi.builder().build();

}
