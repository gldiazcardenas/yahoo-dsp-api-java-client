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
    private List<LanguageType> languages;
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

    public List<Gender> getGenders() {
        return genders;
    }

    public void setGenders(List<Gender> genders) {
        this.genders = genders;
    }

    public List<AgeRange> getAges() {
        return ages;
    }

    public void setAges(List<AgeRange> ages) {
        this.ages = ages;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public FrequencyCapPeriodType getFrequencyCapPeriod() {
        return frequencyCapPeriod;
    }

    public void setFrequencyCapPeriod(FrequencyCapPeriodType frequencyCapPeriod) {
        this.frequencyCapPeriod = frequencyCapPeriod;
    }

    public FrequencyCapPeriodType getFrequencyCapValue() {
        return frequencyCapValue;
    }

    public void setFrequencyCapValue(FrequencyCapPeriodType frequencyCapValue) {
        this.frequencyCapValue = frequencyCapValue;
    }

    public Boolean getServeUnknownUser() {
        return serveUnknownUser;
    }

    public void setServeUnknownUser(Boolean serveUnknownUser) {
        this.serveUnknownUser = serveUnknownUser;
    }

    public DayPartingTargeting getDayParting() {
        return dayParting;
    }

    public void setDayParting(DayPartingTargeting dayParting) {
        this.dayParting = dayParting;
    }

    public List<LanguageType> getLanguages() {
        return languages;
    }

    public void setLanguages(List<LanguageType> languages) {
        this.languages = languages;
    }

    public List<InventoryType> getInventoryTypes() {
        return inventoryTypes;
    }

    public void setInventoryTypes(List<InventoryType> inventoryTypes) {
        this.inventoryTypes = inventoryTypes;
    }

    public List<BotType> getBots() {
        return bots;
    }

    public void setBots(List<BotType> bots) {
        this.bots = bots;
    }

    public List<DeviceType> getDeviceTypes() {
        return deviceTypes;
    }

    public void setDeviceTypes(List<DeviceType> deviceTypes) {
        this.deviceTypes = deviceTypes;
    }

    public List<OsType> getOs() {
        return os;
    }

    public void setOs(List<OsType> os) {
        this.os = os;
    }

    public List<BrowserType> getBrowsers() {
        return browsers;
    }

    public void setBrowsers(List<BrowserType> browsers) {
        this.browsers = browsers;
    }

    public List<OsType> getMobileOs() {
        return mobileOs;
    }

    public void setMobileOs(List<OsType> mobileOs) {
        this.mobileOs = mobileOs;
    }

    public List<BrowserType> getMobileBrowsers() {
        return mobileBrowsers;
    }

    public void setMobileBrowsers(List<BrowserType> mobileBrowsers) {
        this.mobileBrowsers = mobileBrowsers;
    }

    public List<AdInitiationType> getAdInitiations() {
        return adInitiations;
    }

    public void setAdInitiations(List<AdInitiationType> adInitiations) {
        this.adInitiations = adInitiations;
    }

    public List<PositionType> getPositions() {
        return positions;
    }

    public void setPositions(List<PositionType> positions) {
        this.positions = positions;
    }

    public List<PlayerSizeType> getPlayerSizes() {
        return playerSizes;
    }

    public void setPlayerSizes(List<PlayerSizeType> playerSizes) {
        this.playerSizes = playerSizes;
    }

    public List<VideoContentLengthType> getVideoContentLength() {
        return videoContentLength;
    }

    public void setVideoContentLength(List<VideoContentLengthType> videoContentLength) {
        this.videoContentLength = videoContentLength;
    }

    public DealTargeting getDeals() {
        return deals;
    }

    public void setDeals(DealTargeting deals) {
        this.deals = deals;
    }

    public List<Long> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<Long> publishers) {
        this.publishers = publishers;
    }

    public Boolean getIncludePublishers() {
        return includePublishers;
    }

    public void setIncludePublishers(Boolean includePublishers) {
        this.includePublishers = includePublishers;
    }

    public GeoTargeting getGeos() {
        return geos;
    }

    public void setGeos(GeoTargeting geos) {
        this.geos = geos;
    }

    public SegmentTargeting getSegments() {
        return segments;
    }

    public void setSegments(SegmentTargeting segments) {
        this.segments = segments;
    }

    public List<LineTargetingType> getTypes() {
        return types;
    }

    public void setTypes(List<LineTargetingType> types) {
        this.types = types;
    }
}
