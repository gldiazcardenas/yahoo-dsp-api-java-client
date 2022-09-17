package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.SeatsResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Aug 25th 2022.
 */
public class GetSeatsExample implements Example {

    public static void main(String[] arg) {
        SeatsResponse response = API.getSeatService().getAll(AUTH);
        System.out.println(response);
    }

}
