package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.CreativeMimeTypesResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetCreativeMimeTypesExample implements Example {

    public static void main(String[] arg) {
        CreativeMimeTypesResponse response = API.getDataDictionaryService().getCreativeMimeTypes(AUTH);
        System.out.println(response);
    }

}
