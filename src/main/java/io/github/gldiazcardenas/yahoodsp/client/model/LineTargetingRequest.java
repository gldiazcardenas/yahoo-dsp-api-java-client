package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LineTargetingRequest {

    @JsonProperty("genders")
    private List<String> genderValues;
    @JsonProperty("ages")
    private List<String> ageValues;
    private Integer threshold;
    @JsonProperty("frequencyCapPeriod")
    private String frequencyCapPeriodValue;
    @JsonProperty("frequencyCapValue")
    private String frequencyCapValueValue;
    private Boolean serveUnknownUser;
    private DayPartingTargeting dayParting;
    @JsonProperty("languages")
    private List<String> languageValues;
    @JsonProperty("inventoryTypes")
    private List<String> inventoryTypeValues;
    @JsonProperty("bots")
    private List<String> botValues;
    @JsonProperty("deviceTypes")
    private List<String> deviceTypeValues;
    @JsonProperty("os")
    private List<String> osValues;
    @JsonProperty("browsers")
    private List<String> browserValues;
    @JsonProperty("mobileOs")
    private List<String> mobileOsValues;
    @JsonProperty("mobileBrowsers")
    private List<String> mobileBrowserValues;
    @JsonProperty("adInitiations")
    private List<String> adInitiationValues;
    @JsonProperty("positions")
    private List<String> positionValues;
    @JsonProperty("playerSizes")
    private List<String> playerSizeValues;
    @JsonProperty("videoContentLength")
    private List<String> videoContentLengthValues;
    private DealTargeting deals;
    private List<Long> publishers;
    private Boolean includePublishers;
    private GeoTargeting geos;
    private SegmentTargeting segments;
    private List<LineTargetingType> types;

    @JsonIgnore
    public List<Gender> getGenders() {
        return Gender.fromValues(genderValues);
    }

    @JsonIgnore
    public void setGenders(List<Gender> genders) {
        this.genderValues = genders.stream().map(Enum::name).collect(Collectors.toList());
    }

    public List<String> getGenderValues() {
        return genderValues;
    }

    public void setGenderValues(List<String> genderValues) {
        this.genderValues = genderValues;
    }

    @JsonIgnore
    public List<AgeRange> getAges() {
        return AgeRange.fromValues(ageValues);
    }

    @JsonIgnore
    public void setAges(List<AgeRange> ages) {
        this.ageValues = ages.stream().map(AgeRange::getValue).collect(Collectors.toList());
    }

    public List<String> getAgeValues() {
        return ageValues;
    }

    public void setAgeValues(List<String> ageValues) {
        this.ageValues = ageValues;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    @JsonIgnore
    public FrequencyCapPeriodType getFrequencyCapPeriod() {
        return FrequencyCapPeriodType.fromValue(frequencyCapPeriodValue);
    }

    @JsonIgnore
    public void setFrequencyCapPeriod(FrequencyCapPeriodType frequencyCapPeriod) {
        this.frequencyCapPeriodValue = frequencyCapPeriod.name();
    }

    public String getFrequencyCapPeriodValue() {
        return frequencyCapPeriodValue;
    }

    public void setFrequencyCapPeriodValue(String frequencyCapPeriodValue) {
        this.frequencyCapPeriodValue = frequencyCapPeriodValue;
    }

    @JsonIgnore
    public FrequencyCapPeriodType getFrequencyCapValue() {
        return FrequencyCapPeriodType.fromValue(frequencyCapValueValue);
    }

    @JsonIgnore
    public void setFrequencyCapValue(FrequencyCapPeriodType frequencyCapValue) {
        this.frequencyCapValueValue = frequencyCapValue.name();
    }

    public String getFrequencyCapValueValue() {
        return frequencyCapValueValue;
    }

    public void setFrequencyCapValueValue(String frequencyCapValueValue) {
        this.frequencyCapValueValue = frequencyCapValueValue;
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

    @JsonIgnore
    public List<LanguageType> getLanguages() {
        return LanguageType.fromValues(languageValues);
    }

    @JsonIgnore
    public void setLanguages(List<LanguageType> languages) {
        this.languageValues = languages.stream().map(Enum::name).collect(Collectors.toList());
    }

    public List<String> getLanguageValues() {
        return languageValues;
    }

    public void setLanguageValues(List<String> languageValues) {
        this.languageValues = languageValues;
    }

    @JsonIgnore
    public List<InventoryType> getInventoryTypes() {
        return InventoryType.fromValues(inventoryTypeValues);
    }

    @JsonIgnore
    public void setInventoryTypes(List<InventoryType> inventoryTypes) {
        this.inventoryTypeValues = inventoryTypes.stream().map(Enum::name).collect(Collectors.toList());
    }

    public List<String> getInventoryTypeValues() {
        return inventoryTypeValues;
    }

    public void setInventoryTypeValues(List<String> inventoryTypeValues) {
        this.inventoryTypeValues = inventoryTypeValues;
    }

    @JsonIgnore
    public List<BotType> getBots() {
        return BotType.fromValues(botValues);
    }

    @JsonIgnore
    public void setBots(List<BotType> bots) {
        this.botValues = bots.stream().map(Enum::name).collect(Collectors.toList());
    }

    public List<String> getBotValues() {
        return botValues;
    }

    public void setBotValues(List<String> botValues) {
        this.botValues = botValues;
    }

    @JsonIgnore
    public List<DeviceType> getDeviceTypes() {
        return DeviceType.fromValues(deviceTypeValues);
    }

    @JsonIgnore
    public void setDeviceTypes(List<DeviceType> deviceTypes) {
        this.deviceTypeValues = deviceTypes.stream().map(Enum::name).collect(Collectors.toList());
    }

    public List<String> getDeviceTypeValues() {
        return deviceTypeValues;
    }

    public void setDeviceTypeValues(List<String> deviceTypeValues) {
        this.deviceTypeValues = deviceTypeValues;
    }

    @JsonIgnore
    public List<OsType> getOs() {
        return OsType.fromValues(osValues);
    }

    @JsonIgnore
    public void setOs(List<OsType> os) {
        this.osValues = os.stream().map(Enum::name).collect(Collectors.toList());
    }

    public List<String> getOsValues() {
        return osValues;
    }

    public void setOsValues(List<String> osValues) {
        this.osValues = osValues;
    }

    @JsonIgnore
    public List<BrowserType> getBrowsers() {
        return BrowserType.fromValues(browserValues);
    }

    @JsonIgnore
    public void setBrowsers(List<BrowserType> browsers) {
        this.browserValues = browsers.stream().map(Enum::name).collect(Collectors.toList());
    }

    public List<String> getBrowserValues() {
        return browserValues;
    }

    public void setBrowserValues(List<String> browserValues) {
        this.browserValues = browserValues;
    }

    @JsonIgnore
    public List<OsType> getMobileOs() {
        return OsType.fromValues(mobileOsValues);
    }

    @JsonIgnore
    public void setMobileOs(List<OsType> mobileOs) {
        this.mobileOsValues = mobileOs.stream().map(Enum::name).collect(Collectors.toList());
    }

    public List<String> getMobileOsValues() {
        return mobileOsValues;
    }

    public void setMobileOsValues(List<String> mobileOsValues) {
        this.mobileOsValues = mobileOsValues;
    }

    @JsonIgnore
    public List<BrowserType> getMobileBrowsers() {
        return BrowserType.fromValues(mobileBrowserValues);
    }

    @JsonIgnore
    public void setMobileBrowsers(List<BrowserType> mobileBrowsers) {
        this.mobileBrowserValues = mobileBrowsers.stream().map(Enum::name).collect(Collectors.toList());
    }

    public List<String> getMobileBrowserValues() {
        return mobileBrowserValues;
    }

    public void setMobileBrowserValues(List<String> mobileBrowserValues) {
        this.mobileBrowserValues = mobileBrowserValues;
    }

    @JsonIgnore
    public List<AdInitiationType> getAdInitiations() {
        return AdInitiationType.fromValues(adInitiationValues);
    }

    @JsonIgnore
    public void setAdInitiations(List<AdInitiationType> adInitiations) {
        this.adInitiationValues = adInitiations.stream().map(Enum::name).collect(Collectors.toList());
    }

    public List<String> getAdInitiationValues() {
        return adInitiationValues;
    }

    public void setAdInitiationValues(List<String> adInitiationValues) {
        this.adInitiationValues = adInitiationValues;
    }

    @JsonIgnore
    public List<PositionType> getPositions() {
        return PositionType.fromValues(positionValues);
    }

    @JsonIgnore
    public void setPositions(List<PositionType> positions) {
        this.positionValues = positions.stream().map(Enum::name).collect(Collectors.toList());
    }

    public List<String> getPositionValues() {
        return positionValues;
    }

    public void setPositionValues(List<String> positionValues) {
        this.positionValues = positionValues;
    }

    @JsonIgnore
    public List<PlayerSizeType> getPlayerSizes() {
        return PlayerSizeType.fromValues(playerSizeValues);
    }

    @JsonIgnore
    public void setPlayerSizes(List<PlayerSizeType> playerSizes) {
        this.playerSizeValues = playerSizes.stream().map(Enum::name).collect(Collectors.toList());
    }

    public List<String> getPlayerSizeValues() {
        return playerSizeValues;
    }

    public void setPlayerSizeValues(List<String> playerSizeValues) {
        this.playerSizeValues = playerSizeValues;
    }

    @JsonIgnore
    public List<VideoContentLengthType> getVideoContentLength() {
        return VideoContentLengthType.fromValues(videoContentLengthValues);
    }

    @JsonIgnore
    public void setVideoContentLength(List<VideoContentLengthType> videoContentLength) {
        this.videoContentLengthValues = videoContentLength.stream().map(Enum::name).collect(Collectors.toList());
    }

    public List<String> getVideoContentLengthValues() {
        return videoContentLengthValues;
    }

    public void setVideoContentLengthValues(List<String> videoContentLengthValues) {
        this.videoContentLengthValues = videoContentLengthValues;
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

    @Override
    public String toString() {
        return "LineTargetingRequest{" +
                "genders=" + genderValues +
                ", ages=" + ageValues +
                ", threshold=" + threshold +
                ", frequencyCapPeriod=" + frequencyCapPeriodValue +
                ", frequencyCapValue=" + frequencyCapValueValue +
                ", serveUnknownUser=" + serveUnknownUser +
                ", dayParting=" + dayParting +
                ", languages=" + languageValues +
                ", inventoryTypes=" + inventoryTypeValues +
                ", bots=" + botValues +
                ", deviceTypes=" + deviceTypeValues +
                ", os=" + osValues +
                ", browsers=" + browserValues +
                ", mobileOs=" + mobileOsValues +
                ", mobileBrowsers=" + mobileBrowserValues +
                ", adInitiations=" + adInitiationValues +
                ", positions=" + positionValues +
                ", playerSizes=" + playerSizeValues +
                ", videoContentLength=" + videoContentLengthValues +
                ", deals=" + deals +
                ", publishers=" + publishers +
                ", includePublishers=" + includePublishers +
                ", geos=" + geos +
                ", segments=" + segments +
                ", types=" + types +
                '}';
    }
}
