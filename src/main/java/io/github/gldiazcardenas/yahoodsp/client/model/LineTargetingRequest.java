package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LineTargetingRequest {

    private List<Gender> genders;
    private List<AgeRange> ages;
    private Integer threshold;
    private FrequencyCapPeriodType frequencyCapPeriod;
    private FrequencyCapPeriodType frequencyCapValue;
    private Boolean serveUnknownUser;
    private DayPartingTargeting dayParting;
    private List<String> languages;
    private List<InventoryType> inventoryTypes;
    private List<BotType> bots;
    private List<DeviceType> deviceTypes;
    private List<OsType> os;
    private List<BrowserType> browsers;
    private List<OsType> mobileOs;
    private List<BrowserType> mobileBrowsers;
    private List<AdInitiationType> adInitiations;
    private List<PositionType> positions;
    private List<PlayerSizeType> playerSizes;
    private List<VideoContentLengthType> videoContentLength;
    private DealTargeting deals;
    private List<Long> publishers;
    private Boolean includePublishers;
    private GeoTargeting geos;
    private SegmentTargeting segments;
    private List<LineTargetingType> types;

}
