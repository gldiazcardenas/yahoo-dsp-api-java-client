package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Campaign;
import io.github.gldiazcardenas.yahoodsp.client.model.CampaignResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.CampaignsResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

public interface CampaignService {

    CampaignsResponse getCampaigns(Authentication auth, CampaignsFilter filter) throws DspApiException;

    CampaignResponse getCampaign(Authentication auth, long campaignId) throws DspApiException;

    CampaignResponse createCampaign(Authentication auth, Campaign campaign) throws DspApiException;

    CampaignResponse updateCampaign(Authentication auth, Campaign campaign) throws DspApiException;

}
