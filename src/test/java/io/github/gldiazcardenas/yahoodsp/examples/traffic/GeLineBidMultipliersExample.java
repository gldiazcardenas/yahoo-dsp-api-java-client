package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.BidMultipliersResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

public class GeLineBidMultipliersExample implements Example {

    public static void main(String[] arg) {
        BidMultipliersResponse response = API.getLineService().getBidMultipliers(AUTH, LINE_ID);
        System.out.println(response);
    }

}
