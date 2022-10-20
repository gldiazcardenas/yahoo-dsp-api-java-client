package io.github.gldiazcardenas.yahoodsp.client.model;

/**
 * @author Gabriel Diaz, Sep 21th 2022.
 */
public enum BudgetType {
    CURRENCY,
    IMPRESSION;
    public static BudgetType fromValue(String value) {
        if (value != null && !value.isEmpty()) {
            for (BudgetType type : values()) {
                if (type.name().equals(value)) {
                    return type;
                }
            }
        }
        return null;
    }
}
