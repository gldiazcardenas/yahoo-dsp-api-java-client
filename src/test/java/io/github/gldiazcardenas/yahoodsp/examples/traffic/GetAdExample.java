package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.AdResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetAdExample implements Example {

    public static void main(String[] arg) {
        AdResponse response = API.getAdService().getAd(AUTH, AD_ID);
        System.out.println(response);
    }

}
