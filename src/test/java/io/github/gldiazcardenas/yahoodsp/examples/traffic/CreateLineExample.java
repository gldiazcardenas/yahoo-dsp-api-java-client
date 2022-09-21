package io.github.gldiazcardenas.yahoodsp.examples.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.BudgetScheduleType;
import io.github.gldiazcardenas.yahoodsp.client.model.Line;
import io.github.gldiazcardenas.yahoodsp.client.model.LineBudgetSchedule;
import io.github.gldiazcardenas.yahoodsp.client.model.LineResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.MediaType;
import io.github.gldiazcardenas.yahoodsp.examples.Example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
public class CreateLineExample implements Example {

    public static void main(String[] arg) {
        LineBudgetSchedule budgetSchedule = new LineBudgetSchedule();
        budgetSchedule.setStartDate(LocalDate.now());
        budgetSchedule.setEndDate(LocalDate.now().plusYears(10));
        budgetSchedule.setBudget(BigDecimal.valueOf(500));
        budgetSchedule.setDailyBudget(BigDecimal.valueOf(20));
        budgetSchedule.setDailyBudgetType(BudgetScheduleType.SPECIFIED_AMOUNT);

        Line line = new Line();
        line.setOrderId(CAMPAIGN_ID);
        line.setName("test-line-api");
        line.setStatus(Line.Status.INACTIVE);
        line.setGoalType(Line.GoalType.CPA);
        line.setGoalAmount(BigDecimal.valueOf(0.2));
        line.setSchedules(new ArrayList<>());
        line.getSchedules().add(budgetSchedule);
        line.setMediaType(MediaType.DISPLAY);
        line.setBillingMethodType(Line.BillingMethodType.CPC);
        line.setBillingPrice(BigDecimal.ZERO);
        line.setMarginType(Line.MarginType.TOTAL_BUDGET);
        line.setBidPrice(BigDecimal.valueOf(0.1));

        LineResponse response = API.getLineService().createLine(AUTH, line);
        System.out.println(response);
    }

}
