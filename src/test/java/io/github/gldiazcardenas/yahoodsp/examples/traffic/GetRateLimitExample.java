package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.RateLimitResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Aug 04th 2023.
 */
public class GetRateLimitExample implements Example {

    public static void main(String[] arg) {
        RateLimitResponse response = API.getRateLimitService().get(AUTH);
        System.out.println(response);
    }

}
