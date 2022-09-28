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

    private Boolean enableViewabilityFreqCap;
    private Integer frequencyCapValue;
    private FrequencyCapPeriodType frequencyCapPeriod;
    private Boolean serveUnknownUser;
    private List<DeviceType> devices;
    private List<LanguageType> languages;
    private List<InventoryType> inventoryTypes;
    private List<OsType> os;
    private List<OsType> mobileOs;
    private List<Deal> dealsIncluded;
    private List<Publisher> publishersIncluded;
    private List<Geo> geosIncluded;
    private List<Geo> geosExcluded;
    private Boolean enableSegmentExpansion;
    private Boolean isAllCountriesTargeted;
    private List<LineTargetingType> types;

    public Boolean getEnableViewabilityFreqCap() {
        return enableViewabilityFreqCap;
    }

    public void setEnableViewabilityFreqCap(Boolean enableViewabilityFreqCap) {
        this.enableViewabilityFreqCap = enableViewabilityFreqCap;
    }

    public Integer getFrequencyCapValue() {
        return frequencyCapValue;
    }

    public void setFrequencyCapValue(Integer frequencyCapValue) {
        this.frequencyCapValue = frequencyCapValue;
    }

    public FrequencyCapPeriodType getFrequencyCapPeriod() {
        return frequencyCapPeriod;
    }

    public void setFrequencyCapPeriod(FrequencyCapPeriodType frequencyCapPeriod) {
        this.frequencyCapPeriod = frequencyCapPeriod;
    }

    public Boolean getServeUnknownUser() {
        return serveUnknownUser;
    }

    public void setServeUnknownUser(Boolean serveUnknownUser) {
        this.serveUnknownUser = serveUnknownUser;
    }

    public List<DeviceType> getDevices() {
        return devices;
    }

    public void setDevices(List<DeviceType> devices) {
        this.devices = devices;
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

    public List<OsType> getOs() {
        return os;
    }

    public void setOs(List<OsType> os) {
        this.os = os;
    }

    public List<OsType> getMobileOs() {
        return mobileOs;
    }

    public void setMobileOs(List<OsType> mobileOs) {
        this.mobileOs = mobileOs;
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

    public Boolean getEnableSegmentExpansion() {
        return enableSegmentExpansion;
    }

    public void setEnableSegmentExpansion(Boolean enableSegmentExpansion) {
        this.enableSegmentExpansion = enableSegmentExpansion;
    }

    public Boolean getAllCountriesTargeted() {
        return isAllCountriesTargeted;
    }

    public void setAllCountriesTargeted(Boolean allCountriesTargeted) {
        isAllCountriesTargeted = allCountriesTargeted;
    }

    public List<LineTargetingType> getTypes() {
        return types;
    }

    public void setTypes(List<LineTargetingType> types) {
        this.types = types;
    }
}
