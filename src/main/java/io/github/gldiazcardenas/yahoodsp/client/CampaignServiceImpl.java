package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.CampaignResource;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.CampaignService;

class CampaignServiceImpl implements CampaignService {

    private final CampaignResource resource;

    CampaignServiceImpl(CampaignResource resource) {
        this.resource = resource;
    }

}
