package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Campaign;
import io.github.gldiazcardenas.yahoodsp.client.model.CampaignResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.CampaignsResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.CampaignResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.CampaignService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.CampaignsFilter;

import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.accessToken;
import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.requireNonNull;

class CampaignServiceImpl implements CampaignService {

    private final CampaignResource resource;

    CampaignServiceImpl(CampaignResource resource) {
        this.resource = resource;
    }

    @Override
    public CampaignsResponse getCampaigns(Authentication auth, CampaignsFilter filter) throws DspApiException {
        requireNonNull(filter);
        requireNonNull(filter.getAccountId());
        return resource.getCampaigns(accessToken(auth),
                filter.getAccountId(),
                filter.getQuery(),
                filter.getPage(),
                filter.getLimit(),
                filter.getSort(),
                filter.getDir());
    }

    @Override
    public CampaignResponse getCampaign(Authentication auth, long campaignId) throws DspApiException {
        return resource.getCampaign(accessToken(auth), campaignId);
    }

    @Override
    public CampaignResponse createCampaign(Authentication auth, Campaign campaign) throws DspApiException {
        requireNonNull(campaign);
        requireNonNull(campaign.getAccountId());
        return resource.createCampaign(accessToken(auth), campaign);
    }

    @Override
    public CampaignResponse updateCampaign(Authentication auth, Campaign campaign) throws DspApiException {
        requireNonNull(campaign);
        requireNonNull(campaign.getId());
        return resource.updateCampaign(accessToken(auth), campaign.getId(), campaign);
    }
}
