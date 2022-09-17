package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.AdBehaviorTypesResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetAdBehaviorTypesExample implements Example {

    public static void main(String[] arg) {
        AdBehaviorTypesResponse response = API.getDataDictionaryService().getAdBehaviorTypes(AUTH);
        System.out.println(response);
    }

}
