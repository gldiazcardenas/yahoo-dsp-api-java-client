package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.TimezonesResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetTimezonesExample implements Example {

    public static void main(String[] arg) {
        TimezonesResponse response = API.getDataDictionaryService().getTimezones(AUTH);
        System.out.println(response);
    }

}
