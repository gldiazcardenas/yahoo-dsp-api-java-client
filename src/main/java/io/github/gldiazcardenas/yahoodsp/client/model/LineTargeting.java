package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LineTargeting {

    private List<Gender> genders;
    private List<AgeRange> ages;
    private Integer frequencyCapValue;
    private FrequencyCapPeriodType frequencyCapPeriod;
    private Boolean serveUnknownUser;
    private List<DeviceType> devices;
    private List<LanguageType> languages;
    private List<InventoryType> inventoryTypes;
    private List<OsType> os;
    private List<BrowserType> browsers;
    private List<OsType> mobileOs;
    private List<BrowserType> mobileBrowsers;
    private List<AdInitiationType> adInitiations;
    private List<PositionType> positions;
    private List<PlayerSizeType> playerSizes;
    private List<Deal> dealsIncluded;
    private List<Publisher> publishersIncluded;
    private List<Publisher> publishersExcluded;
    private List<Geo> geosIncluded;
    private List<Geo> geosExcluded;
    private List<Segment> segmentsIncluded;
    private List<Segment> segmentsExcluded;
    private Boolean enableSegmentExpansion;
    private Boolean isAllCountriesTargeted;
    private Boolean enableViewabilityFreqCap;
    private List<LineTargetingType> types;

}
