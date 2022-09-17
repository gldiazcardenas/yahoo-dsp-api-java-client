package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.PremiumNativeLanguagesResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetPremiumNativeLanguagesExample implements Example {

    public static void main(String[] arg) {
        PremiumNativeLanguagesResponse response = API.getDataDictionaryService().getPremiumNativeLanguages(AUTH);
        System.out.println(response);
    }

}
