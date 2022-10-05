package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author Gabriel Diaz, Sep 21th 2022.
 */
public enum MediaType {
    DISPLAY,
    VIDEO,
    AUDIO,
    NATIVE,
    UNKNOWN;

    @JsonCreator
    public static MediaType fromName(String name) {
        for (MediaType type : values()) {
            if (type.name().equals(name)) {
                return type;
            }
        }
        return UNKNOWN;
    }
}
