package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
public enum AgeRange {
    R18_20("18-20"),
    R21_24("21-24"),
    R25_34("25-34"),
    R35_44("35-44"),
    R45_49("45-49"),
    R50_54("50-54"),
    R55_64("55-64"),
    R65_999("65-999"),
    UNKNOWN("UNKNOWN"),
    ALL("ALL");

    private final String value;

    AgeRange(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static AgeRange fromValue(String value) {
        for (AgeRange ar : values()) {
            if (ar.value.equals(value)) {
                return ar;
            }
        }
        throw new IllegalStateException("Unmapped value: " + value);
    }
}
