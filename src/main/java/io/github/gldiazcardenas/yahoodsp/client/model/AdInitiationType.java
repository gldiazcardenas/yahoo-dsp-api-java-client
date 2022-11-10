package io.github.gldiazcardenas.yahoodsp.client.model;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Gabriel Diaz, Oct 01th 2022.
 */
public enum AdInitiationType {
    AUTOINITIATED,
    USERINITIATED,
    UNKNOWN,
    ALL;

    public static AdInitiationType fromValue(String value) {
        for (AdInitiationType type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }

    public static List<AdInitiationType> fromValues(List<String> values) {
        return Optional.ofNullable(values)
                .map(l -> l.stream().map(AdInitiationType::fromValue).collect(Collectors.toList()))
                .orElse(null);
    }
}
