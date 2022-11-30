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
public class LineTargeting {

    @JsonProperty("genders")
    private List<String> genderValues;
    @JsonProperty("ages")
    private List<String> ageValues;
    private Integer frequencyCapValue;
    @JsonProperty("frequencyCapPeriod")
    private String frequencyCapPeriodValue;
    private Boolean serveUnknownUser;
    @JsonProperty("devices")
    private List<String> deviceValues;
    @JsonProperty("languages")
    private List<String> languageValues;
    @JsonProperty("inventoryTypes")
    private List<String> inventoryTypeValues;
    @JsonProperty("os")
    private List<String> osValues;
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
    private List<Deal> dealsIncluded;
    private List<Publisher> publishersIncluded;
    private List<Publisher> publishersExcluded;
    private List<Geo> geosIncluded;
    private List<Geo> geosExcluded;
    private List<Segment> segmentsIncluded;
    private List<Segment> segmentsExcluded;
    private List<NativeList> nativeListsExcluded;
    private List<SiteList> siteListsIncluded;
    private List<SiteList> siteListsExcluded;
    private Boolean enableSegmentExpansion;
    private Boolean isAllCountriesTargeted;
    private Boolean enableViewabilityFreqCap;
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

    public Integer getFrequencyCapValue() {
        return frequencyCapValue;
    }

    public void setFrequencyCapValue(Integer frequencyCapValue) {
        this.frequencyCapValue = frequencyCapValue;
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

    public Boolean getServeUnknownUser() {
        return serveUnknownUser;
    }

    public void setServeUnknownUser(Boolean serveUnknownUser) {
        this.serveUnknownUser = serveUnknownUser;
    }

    @JsonIgnore
    public List<DeviceType> getDevices() {
        return DeviceType.fromValues(deviceValues);
    }

    @JsonIgnore
    public void setDevices(List<DeviceType> devices) {
        this.deviceValues = devices.stream().map(Enum::name).collect(Collectors.toList());
    }

    public List<String> getDeviceValues() {
        return deviceValues;
    }

    public void setDeviceValues(List<String> deviceValues) {
        this.deviceValues = deviceValues;
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

    public List<Deal> getDealsIncluded() {
        return dealsIncluded;
    }

    public void setDealsIncluded(List<Deal> dealsIncluded) {
        this.dealsIncluded = dealsIncluded;
    }

    public List<Publisher> getPublishersIncluded() {
        return publishersIncluded;
    }

    public void setPublishersIncluded(List<Publisher> publishersIncluded) {
        this.publishersIncluded = publishersIncluded;
    }

    public List<Publisher> getPublishersExcluded() {
        return publishersExcluded;
    }

    public void setPublishersExcluded(List<Publisher> publishersExcluded) {
        this.publishersExcluded = publishersExcluded;
    }

    public List<Geo> getGeosIncluded() {
        return geosIncluded;
    }

    public void setGeosIncluded(List<Geo> geosIncluded) {
        this.geosIncluded = geosIncluded;
    }

    public List<Geo> getGeosExcluded() {
        return geosExcluded;
    }

    public void setGeosExcluded(List<Geo> geosExcluded) {
        this.geosExcluded = geosExcluded;
    }

    public List<Segment> getSegmentsIncluded() {
        return segmentsIncluded;
    }

    public void setSegmentsIncluded(List<Segment> segmentsIncluded) {
        this.segmentsIncluded = segmentsIncluded;
    }

    public List<Segment> getSegmentsExcluded() {
        return segmentsExcluded;
    }

    public void setSegmentsExcluded(List<Segment> segmentsExcluded) {
        this.segmentsExcluded = segmentsExcluded;
    }

    public Boolean getEnableSegmentExpansion() {
        return enableSegmentExpansion;
    }

    public void setEnableSegmentExpansion(Boolean enableSegmentExpansion) {
        this.enableSegmentExpansion = enableSegmentExpansion;
    }

    public List<NativeList> getNativeListsExcluded() {
        return nativeListsExcluded;
    }

    public void setNativeListsExcluded(List<NativeList> nativeListsExcluded) {
        this.nativeListsExcluded = nativeListsExcluded;
    }

    public List<SiteList> getSiteListsIncluded() {
        return siteListsIncluded;
    }

    public void setSiteListsIncluded(List<SiteList> siteListsIncluded) {
        this.siteListsIncluded = siteListsIncluded;
    }

    public List<SiteList> getSiteListsExcluded() {
        return siteListsExcluded;
    }

    public void setSiteListsExcluded(List<SiteList> siteListsExcluded) {
        this.siteListsExcluded = siteListsExcluded;
    }

    public Boolean getAllCountriesTargeted() {
        return isAllCountriesTargeted;
    }

    public void setAllCountriesTargeted(Boolean allCountriesTargeted) {
        isAllCountriesTargeted = allCountriesTargeted;
    }

    public Boolean getEnableViewabilityFreqCap() {
        return enableViewabilityFreqCap;
    }

    public void setEnableViewabilityFreqCap(Boolean enableViewabilityFreqCap) {
        this.enableViewabilityFreqCap = enableViewabilityFreqCap;
    }

    public List<LineTargetingType> getTypes() {
        return types;
    }

    public void setTypes(List<LineTargetingType> types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "LineTargeting{" +
                "genders=" + genderValues +
                ", ages=" + ageValues +
                ", frequencyCapValue=" + frequencyCapValue +
                ", frequencyCapPeriod='" + frequencyCapPeriodValue + '\'' +
                ", serveUnknownUser=" + serveUnknownUser +
                ", devices=" + deviceValues +
                ", languages=" + languageValues +
                ", inventoryTypes=" + inventoryTypeValues +
                ", os=" + osValues +
                ", browsers=" + browserValues +
                ", mobileOs=" + mobileOsValues +
                ", mobileBrowsers=" + mobileBrowserValues +
                ", adInitiations=" + adInitiationValues +
                ", positions=" + positionValues +
                ", playerSizes=" + playerSizeValues +
                ", dealsIncluded=" + dealsIncluded +
                ", publishersIncluded=" + publishersIncluded +
                ", publishersExcluded=" + publishersExcluded +
                ", geosIncluded=" + geosIncluded +
                ", geosExcluded=" + geosExcluded +
                ", segmentsIncluded=" + segmentsIncluded +
                ", segmentsExcluded=" + segmentsExcluded +
                ", enableSegmentExpansion=" + enableSegmentExpansion +
                ", isAllCountriesTargeted=" + isAllCountriesTargeted +
                ", enableViewabilityFreqCap=" + enableViewabilityFreqCap +
                ", nativeListsExcluded=" + nativeListsExcluded +
                ", siteListsIncluded=" + siteListsIncluded +
                ", siteListsExcluded=" + siteListsExcluded +
                ", types=" + types +
                '}';
    }
}
