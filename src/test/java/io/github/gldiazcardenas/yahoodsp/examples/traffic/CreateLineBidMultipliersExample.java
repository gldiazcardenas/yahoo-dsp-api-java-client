package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.BidMultiplier;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultipliersRequest;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultipliersResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CreateLineBidMultipliersExample implements Example {

    public static void main(String[] arg) {
        BidMultiplier b1 = new BidMultiplier();
        b1.setTargetType("SITE_X_DEVICE");
        b1.setTargetValue(271);
        b1.setMultiplier(BigDecimal.valueOf(0.20));

        BidMultiplier b2 = new BidMultiplier();
        b2.setTargetType("SITE_X_DEVICE");
        b2.setTargetValue(272);
        b2.setMultiplier(BigDecimal.valueOf(0.20));

        BidMultipliersRequest request = new BidMultipliersRequest();
        request.setEdited(new ArrayList<>());
        request.setAdded(new ArrayList<>());
        request.getAdded().add(b1);
        request.getAdded().add(b2);

        BidMultipliersResponse response = API.getLineService().updateBidMultipliers(AUTH, LINE_ID, request);

        System.out.println(response);
    }

}
