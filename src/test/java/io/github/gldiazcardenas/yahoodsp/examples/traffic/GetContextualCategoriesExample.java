package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.ContextualCategoriesResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.TaxonomyType;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 16th 2022.
 */
public class GetContextualCategoriesExample implements Example {

    public static void main(String[] arg) {
        ContextualCategoriesResponse response = API.getContextualService()
                .getContextualCategories(AUTH, TaxonomyType.IAB);
        System.out.println(response);
    }

}
