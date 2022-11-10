package io.github.gldiazcardenas.yahoodsp.client.model;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Gabriel Diaz, Sep 28th 2022.
 */
public enum BrowserType {
    IE,
    CHROME,
    FIREFOX,
    SAFARI,
    EDGE,
    ALL;

    public static BrowserType fromValue(String value) {
        for (BrowserType type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }

    public static List<BrowserType> fromValues(List<String> values) {
        return Optional.ofNullable(values)
                .map(l -> l.stream().map(BrowserType::fromValue).collect(Collectors.toList()))
                .orElse(null);
    }

}
