package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.ContextualResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 16th 2022.
 */
public class GetContextualByIdExample implements Example {

    public static void main(String[] arg) {
        ContextualResponse response = API.getContextualService().getContextualById(AUTH, 123);
        System.out.println(response);
    }

}
