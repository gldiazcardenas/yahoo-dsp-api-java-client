package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Campaign;
import io.github.gldiazcardenas.yahoodsp.client.model.CampaignResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.CampaignsResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.CampaignResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.CampaignService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.CampaignsFilter;

class CampaignServiceImpl implements CampaignService {

    private final CampaignResource resource;

    CampaignServiceImpl(CampaignResource resource) {
        this.resource = resource;
    }

    @Override
    public CampaignsResponse getCampaigns(Authentication auth, CampaignsFilter filter) throws DspApiException {
        Preconditions.requireNonNull(filter);
        Preconditions.requireNonNull(filter.getAccountId());
        return resource.getCampaigns(auth.getAccessToken(),
                filter.getAccountId(),
                filter.getQuery(),
                filter.getPage(),
                filter.getLimit(),
                filter.getSort(),
                filter.getDir());
    }

    @Override
    public CampaignResponse getCampaign(Authentication auth, long campaignId) throws DspApiException {
        return resource.getCampaign(auth.getAccessToken(), campaignId);
    }

    @Override
    public CampaignResponse createCampaign(Authentication auth, Campaign campaign) throws DspApiException {
        Preconditions.requireNonNull(campaign);
        Preconditions.requireNonNull(campaign.getAccountId());
        return resource.createCampaign(auth.getAccessToken(), campaign);
    }

    @Override
    public CampaignResponse updateCampaign(Authentication auth, Campaign campaign) throws DspApiException {
        Preconditions.requireNonNull(campaign);
        Preconditions.requireNonNull(campaign.getId());
        return resource.updateCampaign(auth.getAccessToken(), campaign.getId(), campaign);
    }
}
