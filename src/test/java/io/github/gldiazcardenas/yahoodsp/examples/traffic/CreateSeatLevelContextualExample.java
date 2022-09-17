package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Contextual;
import io.github.gldiazcardenas.yahoodsp.client.model.ContextualCategoryId;
import io.github.gldiazcardenas.yahoodsp.client.model.ContextualResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.ContextualSeatLevelTarget;
import io.github.gldiazcardenas.yahoodsp.client.model.TaxonomyType;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

import java.util.ArrayList;

/**
 * @author Gabriel Diaz, Sep 16th 2022.
 */
public class CreateSeatLevelContextualExample implements Example {

    public static void main(String[] arg) {
        ContextualCategoryId category = new ContextualCategoryId();
        category.setCategoryId(CATEGORY_ID);

        ContextualSeatLevelTarget seatLevelTarget = new ContextualSeatLevelTarget();
        seatLevelTarget.setExcluded(false);
        seatLevelTarget.setChannelSubTypes(new ArrayList<>());
        seatLevelTarget.getChannelSubTypes().add(ContextualSeatLevelTarget.ChannelSubType.STANDARD_DISPLAY);
        seatLevelTarget.getChannelSubTypes().add(ContextualSeatLevelTarget.ChannelSubType.NATIVE_DISPLAY);

        Contextual seatContextual = new Contextual();
        seatContextual.setSeatId(SEAT_ID);
        seatContextual.setOwnerType(Contextual.OwnerType.SEAT);
        seatContextual.setName("test-seat-contextual");
        seatContextual.setTaxonomyType(TaxonomyType.IAB);
        seatContextual.setCategories(new ArrayList<>());
        seatContextual.getCategories().add(category);
        seatContextual.setSeatLevelTarget(seatLevelTarget);

        // TODO this endpoint does not work yet
        ContextualResponse response = API.getContextualService().createContextual(AUTH, seatContextual);
        System.out.println(response);
    }

}
