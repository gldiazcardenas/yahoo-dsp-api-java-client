package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;

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

    @JsonCreator
    public static TargetType fromName(String name) {
        for (TargetType type : values()) {
            if (type.name().equals(name)) {
                return type;
            }
        }
        return UNKNOWN;
    }
}
