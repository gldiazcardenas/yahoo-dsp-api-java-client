package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.LineResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetLineExample implements Example {

    public static void main(String[] arg) {
        LineResponse response = API.getLineService().getLine(AUTH, LINE_ID);
        System.out.println(response);
    }

}
