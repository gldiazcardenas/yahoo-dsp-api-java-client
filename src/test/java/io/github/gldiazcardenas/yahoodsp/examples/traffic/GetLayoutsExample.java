package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.LayoutsResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetLayoutsExample implements Example {

    public static void main(String[] arg) {
        LayoutsResponse response = API.getDataDictionaryService().getLayouts(AUTH);
        System.out.println(response);
    }

}
