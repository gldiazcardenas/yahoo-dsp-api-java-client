package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.BudgetSchedule;
import io.github.gldiazcardenas.yahoodsp.client.model.Campaign;
import io.github.gldiazcardenas.yahoodsp.client.model.CampaignResponse;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class CreateCampaignExample implements Example {

    public static void main(String[] arg) {
        BudgetSchedule budgetSchedule = new BudgetSchedule();
        budgetSchedule.setScheduleName("test-campaign-api-budget-unlimited");
        budgetSchedule.setStartDate(LocalDate.now());
        budgetSchedule.setScheduleBudgetType(BudgetSchedule.Type.TOTAL_BUDGET);

        Campaign campaign = new Campaign();
        campaign.setAccountId(ADVERTISER_ID);
        campaign.setName("test-campaign-api-fixed-goal");
        campaign.setCurrency("USD");
        campaign.setDemoVendor(Campaign.DemoVendor.YAHOO);
        campaign.setStatus(Campaign.Status.INACTIVE);
        campaign.setTimezone("America/New_York");
        campaign.setGoalType(Campaign.GoalType.CTR);
        campaign.setGoalValue(BigDecimal.ZERO);
        campaign.setBudgetSchedules(new ArrayList<>());
        campaign.getBudgetSchedules().add(budgetSchedule);

        CampaignResponse response = API.getCampaignService().createCampaign(AUTH, campaign);
        System.out.println(response);
    }

}
