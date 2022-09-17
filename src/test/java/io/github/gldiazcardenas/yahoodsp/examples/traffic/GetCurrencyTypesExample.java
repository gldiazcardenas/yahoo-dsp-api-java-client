package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.CurrencyTypesResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetCurrencyTypesExample implements Example {

    public static void main(String[] arg) {
        CurrencyTypesResponse response = API.getDataDictionaryService().getCurrencyTypes(AUTH);
        System.out.println(response);
    }

}
