package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.PremiumNativeCountdownPrefixesResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetPremiumNativeCountdownPrefixesExample implements Example {

    public static void main(String[] arg) {
        PremiumNativeCountdownPrefixesResponse response = API.getDataDictionaryService()
                .getPremiumNativeCountdownPrefixes(AUTH);
        System.out.println(response);
    }

}
