package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.CampaignsResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Dir;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.CampaignsFilter;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class GetCampaignsExample implements Example {

    public static void main(String[] arg) {
        CampaignsResponse response = API.getCampaignService().getCampaigns(AUTH, new CampaignsFilter()
                .setAccountId(ADVERTISER_ID)
                .setQuery("test")
                .setDir(Dir.desc));
        System.out.println(response);
    }

}
