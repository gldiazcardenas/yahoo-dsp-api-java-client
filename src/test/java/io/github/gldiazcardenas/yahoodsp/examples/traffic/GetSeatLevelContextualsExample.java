package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.ContextualsResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.ContextualsFilter;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 16th 2022.
 */
public class GetSeatLevelContextualsExample implements Example {

    public static void main(String[] arg) {
        ContextualsResponse response = API.getContextualService()
                .getContextuals(AUTH, new ContextualsFilter().setSeatId(SEAT_ID));
        System.out.println(response);
    }

}
