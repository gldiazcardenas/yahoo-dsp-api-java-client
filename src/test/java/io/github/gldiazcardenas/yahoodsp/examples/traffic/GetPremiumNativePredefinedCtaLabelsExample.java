package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.PremiumNativePredefinedCtaLabelsResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetPremiumNativePredefinedCtaLabelsExample implements Example {

    public static void main(String[] arg) {
        PremiumNativePredefinedCtaLabelsResponse response = API.getDataDictionaryService()
                .getPremiumNativePredefinedCtaLabels(AUTH);
        System.out.println(response);
    }

}
