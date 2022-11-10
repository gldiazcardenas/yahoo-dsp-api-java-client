package io.github.gldiazcardenas.yahoodsp.client.model;

/**
 * @author Gabriel Diaz, Sep 21th 2022.
 */
public enum BudgetScheduleType {
    TOTAL_BUDGET,
    SPECIFIED_AMOUNT,
    AUTO_ALLOCATED;

    public static BudgetScheduleType fromValue(String value) {
        if (value != null && !value.isEmpty()) {
            for (BudgetScheduleType type : values()) {
                if (type.name().equals(value)) {
                    return type;
                }
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }
}
