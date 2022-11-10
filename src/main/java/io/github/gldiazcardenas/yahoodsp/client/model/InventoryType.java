package io.github.gldiazcardenas.yahoodsp.client.model;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
public enum InventoryType {
    WEB,
    APP,
    ALL;

    public static InventoryType fromValue(String value) {
        for (InventoryType type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }

    public static List<InventoryType> fromValues(List<String> values) {
        return Optional.ofNullable(values)
                .map(l -> l.stream().map(InventoryType::fromValue).collect(Collectors.toList()))
                .orElse(null);
    }
}
