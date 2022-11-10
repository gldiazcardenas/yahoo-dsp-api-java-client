package io.github.gldiazcardenas.yahoodsp.client.model;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Gabriel Diaz, Oct 01th 2022.
 */
public enum VideoContentLengthType {
    UP_TO_TWO_MINUTES,
    TWO_TO_FIVE_MINUTES,
    FIVE_TO_THIRTY_MINUTES,
    MORE_THAN_THIRTY_MINUTES,
    UNKNOWN,
    ALL;

    public static VideoContentLengthType fromValue(String value) {
        for (VideoContentLengthType type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }

    public static List<VideoContentLengthType> fromValues(List<String> values) {
        return Optional.ofNullable(values)
                .map(l -> l.stream().map(VideoContentLengthType::fromValue).collect(Collectors.toList()))
                .orElse(null);
    }
}
