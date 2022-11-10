package io.github.gldiazcardenas.yahoodsp.client.model;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
public enum OsType {
    MAC,
    WINDOWS,
    LINUX,
    OTHER,
    ANDROID,
    IOS,
    ALL;

    public static OsType fromValue(String value) {
        for (OsType type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }

    public static List<OsType> fromValues(List<String> values) {
        return Optional.ofNullable(values)
                .map(l -> l.stream().map(OsType::fromValue).collect(Collectors.toList()))
                .orElse(null);
    }
}
