package io.github.gldiazcardenas.yahoodsp.client.model;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
public enum TargetType {
    AB_TESTING,
    AD_INITIATION,
    AD_POSITION,
    BOT,
    CONNECTION,
    CONTEXTUALS,
    DEMOGRAPHIC,
    ENHANCED_DAY_PARTING,
    EXCHANGES,
    FREQUENCY_CAPPING,
    GEOGRAPHY,
    INVENTORY_TYPE,
    LANGUAGES,
    MOBILE_PLACEMENT,
    NATIVE_LIST,
    PLAYER_SIZE,
    SEGMENT,
    SITE_LISTS,
    TECHNOLOGY,
    VIDEO_CONTENT_LENGTH,
    WEATHER,
    DOOH_SCREEN_OWNERS,
    DOOH_VENUE_TYPES,
    PRIORITIZED_INVENTORY,
    AUCTION_TYPE,
    MOBILE_MEASUREMENT,
    UNKNOWN;

    public static TargetType fromValue(String value) {
        for (TargetType type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }
}
