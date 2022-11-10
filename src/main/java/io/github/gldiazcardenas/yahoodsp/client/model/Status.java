package io.github.gldiazcardenas.yahoodsp.client.model;

/**
 * @author Gabriel Diaz, Sep 19th 2022.
 */
public enum Status {
    ACTIVE,
    INACTIVE,
    ARCHIVED,
    UNKNOWN;

    public static Status fromValue(String value) {
        for (Status type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }
}
