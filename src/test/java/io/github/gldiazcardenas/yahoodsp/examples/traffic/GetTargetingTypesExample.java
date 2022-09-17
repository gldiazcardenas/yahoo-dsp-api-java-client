package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.TargetingTypesResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetTargetingTypesExample implements Example {

    public static void main(String[] arg) {
        TargetingTypesResponse response = API.getDataDictionaryService().getTargetingTypes(AUTH);
        System.out.println(response);
    }

}
