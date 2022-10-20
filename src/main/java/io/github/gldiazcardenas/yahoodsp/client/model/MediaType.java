package io.github.gldiazcardenas.yahoodsp.client.model;

/**
 * @author Gabriel Diaz, Sep 21th 2022.
 */
public enum MediaType {
    DISPLAY,
    VIDEO,
    AUDIO,
    NATIVE;
    public static MediaType fromValue(String value) {
        for (MediaType type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        return null;
    }
}
