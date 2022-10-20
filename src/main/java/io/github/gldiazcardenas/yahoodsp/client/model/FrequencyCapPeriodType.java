package io.github.gldiazcardenas.yahoodsp.client.model;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
public enum FrequencyCapPeriodType {
    UNLIMITED,
    MINUTES,
    HOURLY,
    DAILY,
    WEEKLY,
    MONTHLY;

    public static FrequencyCapPeriodType fromValue(String value) {
        if (value != null && !value.isEmpty()) {
            for (FrequencyCapPeriodType type : values()) {
                if (type.name().equals(value)) {
                    return type;
                }
            }
        }
        return null;
    }
}
