package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.Payloads;
import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.CreativeMimeTypesResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetCreativeMimeTypesExample implements Example {

    public static void main(String[] arg) {
        Authentication auth = Payloads.authentication().setAccessToken(ACCESS_TOKEN);
        CreativeMimeTypesResponse response = API.getDataDictionaryService().getCreativeMimeTypes(auth);
        System.out.println(response);
    }

}
