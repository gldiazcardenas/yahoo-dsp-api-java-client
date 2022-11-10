package io.github.gldiazcardenas.yahoodsp.client.model;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
public enum LanguageType {
    UNKNOWN,
    ENGLISH,
    CHINESE,
    SPANISH,
    JAPANESE,
    PORTUGUESE,
    GERMAN,
    ARABIC,
    FRENCH,
    RUSSIAN,
    DUTCH,
    SWEDISH,
    ITALIAN,
    INDONESIAN,
    ALL;

    public static LanguageType fromValue(String value) {
        for (LanguageType type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }

    public static List<LanguageType> fromValues(List<String> values) {
        return Optional.ofNullable(values)
                .map(l -> l.stream().map(LanguageType::fromValue).collect(Collectors.toList()))
                .orElse(null);
    }
}
