package io.github.gldiazcardenas.yahoodsp.client.model;

/**
 * @author Gabriel Diaz, Sep 16th 2022.
 */
public enum TaxonomyType {

    IAB,
    DOUBLE_VERIFY_AUTHENTIC_BRAND_SAFETY,
    DOUBLE_VERIFY,
    IAS_BRAND_SAFETY,
    IAS_CONTEXTUAL,
    IAS_MEDIA_QUALITY,
    PEER39_BRAND_SAFETY,
    PEER39_CONTEXTUAL,
    PEER39_PAGE_LANGUAGE,
    PEER39_PAGE_QUALITY,
    GRAPESHOT_CONTEXTUAL,
    GRAPESHOT_LANGUAGE,
    GRAPESHOT_CUSTOM;

    public static TaxonomyType fromValue(String value) {
        for (TaxonomyType type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }

}
