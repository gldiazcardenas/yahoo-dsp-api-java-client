package io.github.gldiazcardenas.yahoodsp.client.model;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
public enum DeviceType {
    DESKTOP,
    PHONE,
    TABLET,
    UNKNOWN,
    ALL;

    public static DeviceType fromValue(String value) {
        for (DeviceType type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }

    public static List<DeviceType> fromValues(List<String> values) {
        return Optional.ofNullable(values)
                .map(l -> l.stream().map(DeviceType::fromValue).collect(Collectors.toList()))
                .orElse(null);
    }
}
