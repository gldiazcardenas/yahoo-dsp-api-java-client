package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.GeosResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetGeoCountriesExample implements Example {

    public static void main(String[] arg) {
        GeosResponse response = API.getTargetingService().getCountries(AUTH, "united");
        System.out.println(response);
    }

}
