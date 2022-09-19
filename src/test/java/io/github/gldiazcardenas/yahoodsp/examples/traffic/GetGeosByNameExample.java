package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.GeosResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.GeosFilter;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetGeosByNameExample implements Example {

    public static void main(String[] arg) {
        GeosResponse response = API.getTargetingService().getGeos(AUTH, GeosFilter.byName("miami"));
        System.out.println(response);
    }

}
