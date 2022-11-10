package io.github.gldiazcardenas.yahoodsp.client.model;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Gabriel Diaz, Oct 01th 2022.
 */
public enum PositionType {
    ABOVE_FOLD,
    PARTIAL_VIEW,
    BELOW_FOLD,
    UNKNOWN,
    ALL;

    public static PositionType fromValue(String value) {
        for (PositionType type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }

    public static List<PositionType> fromValues(List<String> values) {
        return Optional.ofNullable(values)
                .map(l -> l.stream().map(PositionType::fromValue).collect(Collectors.toList()))
                .orElse(null);
    }
}
