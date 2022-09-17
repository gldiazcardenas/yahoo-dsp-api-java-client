package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.DictionaryTypesResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetDictionaryTypesExample implements Example {

    public static void main(String[] arg) {
        DictionaryTypesResponse response = API.getDataDictionaryService().getTypes(AUTH);
        System.out.println(response);
    }

}
