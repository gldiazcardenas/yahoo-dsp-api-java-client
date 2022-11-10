package io.github.gldiazcardenas.yahoodsp.client.model;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Gabriel Diaz, Oct 01th 2022.
 */
public enum PlayerSizeType {
    SMALL,
    MEDIUM,
    LARGE,
    UNKNOWN,
    ALL;

    public static PlayerSizeType fromValue(String value) {
        for (PlayerSizeType type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }

    public static List<PlayerSizeType> fromValues(List<String> values) {
        return Optional.ofNullable(values)
                .map(l -> l.stream().map(PlayerSizeType::fromValue).collect(Collectors.toList()))
                .orElse(null);
    }
}
