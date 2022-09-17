package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Contextual;
import io.github.gldiazcardenas.yahoodsp.client.model.ContextualCategoryId;
import io.github.gldiazcardenas.yahoodsp.client.model.ContextualResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.TaxonomyType;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

import java.util.ArrayList;

/**
 * @author Gabriel Diaz, Sep 16th 2022.
 */
public class CreateAdvertiserLevelContextualExample implements Example {

    public static void main(String[] arg) {
        ContextualCategoryId category = new ContextualCategoryId();
        category.setCategoryId(CATEGORY_ID);

        Contextual advertiserContextual = new Contextual();
        advertiserContextual.setAccountId(ADVERTISER_ID);
        advertiserContextual.setOwnerType(Contextual.OwnerType.ACCOUNT);
        advertiserContextual.setName("test-advertiser-contextual");
        advertiserContextual.setTaxonomyType(TaxonomyType.IAB);
        advertiserContextual.setCategories(new ArrayList<>());
        advertiserContextual.getCategories().add(category);

        ContextualResponse response = API.getContextualService().createContextual(AUTH, advertiserContextual);
        System.out.println(response);
    }

}
