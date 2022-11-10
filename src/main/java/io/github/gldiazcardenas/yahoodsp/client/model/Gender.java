package io.github.gldiazcardenas.yahoodsp.client.model;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
public enum Gender {
    MALE,
    FEMALE,
    UNKNOWN,
    ALL;

    public static Gender fromValue(String value) {
        for (Gender ar : values()) {
            if (ar.name().equals(value)) {
                return ar;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }

    public static List<Gender> fromValues(List<String> values) {
        return Optional.ofNullable(values)
                .map(l -> l.stream().map(Gender::fromValue).collect(Collectors.toList()))
                .orElse(null);
    }
}
