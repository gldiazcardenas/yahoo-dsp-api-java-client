package io.github.gldiazcardenas.yahoodsp.client.model;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public String getValue() {
        return value;
    }

    public static AgeRange fromValue(String value) {
        for (AgeRange ar : values()) {
            if (ar.value.equals(value)) {
                return ar;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }

    public static List<AgeRange> fromValues(List<String> values) {
        return Optional.ofNullable(values)
                .map(l -> l.stream().map(AgeRange::fromValue).collect(Collectors.toList()))
                .orElse(null);
    }
}
