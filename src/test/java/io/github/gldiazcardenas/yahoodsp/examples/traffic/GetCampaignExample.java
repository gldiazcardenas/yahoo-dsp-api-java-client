package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.CampaignResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetCampaignExample implements Example {

    public static void main(String[] arg) {
        CampaignResponse response = API.getCampaignService().getCampaign(AUTH, CAMPAIGN_ID);
        System.out.println(response);
    }

}
