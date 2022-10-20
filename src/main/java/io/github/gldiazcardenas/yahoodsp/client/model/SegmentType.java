package io.github.gldiazcardenas.yahoodsp.client.model;

/**
 * @author Gabriel Diaz, Sep 19th 2022.
 */
public enum SegmentType {
    COMPOSITE,
    CONVERSIONRULE,
    CUSTOM,
    EMAIL,
    IPADDRESS,
    EVENTLEVEL,
    FACT,
    GEORETARGET,
    INTEREST,
    LOOKALIKE,
    MRT,
    SRT;

    public static SegmentType fromValue(String value) {
        if (value != null && !value.isEmpty()) {
            for (SegmentType type : values()) {
                if (type.name().equals(value)) {
                    return type;
                }
            }
        }
        return null;
    }
}
