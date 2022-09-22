package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Gabriel Diaz, Sep 21th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Creative {

    public enum Type {
        DISPLAY_HOSTED,
        DISPLAY_THIRD_PARTY,
        VIDEO_HOSTED,
        VIDEO_THIRD_PARTY,
        NATIVE_DISPLAY,
        NATIVE_VIDEO,
        AUDIO_HOSTED
    }

    public enum AdChoiceIconLocation {
        UPPER_RIGHT,
        UPPER_LEFT,
        LOWER_LEFT
    }

    public enum AdType {
        BANNER,
        RICH_MEDIA,
        MRAID
    }

    public enum UserInteraction {
        ON_LOAD,
        ON_CLICK,
        ON_HOVER
    }

    public enum ExpandDirection {
        LEFT,
        RIGHT,
        UP,
        DOWN,
        FULLSCREEN,
        AUTOMATIC
    }

    public enum AdxCategory {
        ALCOHOL_AD
    }

    private Long id;
    private String name;
    private Status status;
    private Long accountId;
    private String language;
    private String landingPageUrl;
    private String landingPageDomain;
    private String mimeType;
    @JsonProperty("creativeType")
    private Type type;
    private String layout;
    private Boolean adChoicesEnabled;
    private AdChoiceIconLocation adChoiceIconLocation;
    private Boolean isThirdPartyCodeSecure;
    private String thirdPartyCode;
    private AdType adType;
    private List<UserInteraction> userInteractions;
    private List<ExpandDirection> expandDirections;
    private String creativeTagUrl;
    private CreativeContent content;
    private CreativeDetails details;
    private List<CreativeImpressionTracking> creativeImpressionTracking;
    private List<CreativeCustomIdentifier> customIdentifiers;
    private CreativeCompanionBanner companionBanners;
    private List<AdxCategory> adxCategories;
    private String updatedAt;
    private Boolean isDooh;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLandingPageUrl() {
        return landingPageUrl;
    }

    public void setLandingPageUrl(String landingPageUrl) {
        this.landingPageUrl = landingPageUrl;
    }

    public String getLandingPageDomain() {
        return landingPageDomain;
    }

    public void setLandingPageDomain(String landingPageDomain) {
        this.landingPageDomain = landingPageDomain;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Boolean getAdChoicesEnabled() {
        return adChoicesEnabled;
    }

    public void setAdChoicesEnabled(Boolean adChoicesEnabled) {
        this.adChoicesEnabled = adChoicesEnabled;
    }

    public AdChoiceIconLocation getAdChoiceIconLocation() {
        return adChoiceIconLocation;
    }

    public void setAdChoiceIconLocation(AdChoiceIconLocation adChoiceIconLocation) {
        this.adChoiceIconLocation = adChoiceIconLocation;
    }

    public Boolean getThirdPartyCodeSecure() {
        return isThirdPartyCodeSecure;
    }

    public void setThirdPartyCodeSecure(Boolean thirdPartyCodeSecure) {
        isThirdPartyCodeSecure = thirdPartyCodeSecure;
    }

    public String getThirdPartyCode() {
        return thirdPartyCode;
    }

    public void setThirdPartyCode(String thirdPartyCode) {
        this.thirdPartyCode = thirdPartyCode;
    }

    public AdType getAdType() {
        return adType;
    }

    public void setAdType(AdType adType) {
        this.adType = adType;
    }

    public List<UserInteraction> getUserInteractions() {
        return userInteractions;
    }

    public void setUserInteractions(List<UserInteraction> userInteractions) {
        this.userInteractions = userInteractions;
    }

    public List<ExpandDirection> getExpandDirections() {
        return expandDirections;
    }

    public void setExpandDirections(List<ExpandDirection> expandDirections) {
        this.expandDirections = expandDirections;
    }

    public String getCreativeTagUrl() {
        return creativeTagUrl;
    }

    public void setCreativeTagUrl(String creativeTagUrl) {
        this.creativeTagUrl = creativeTagUrl;
    }

    public CreativeContent getContent() {
        return content;
    }

    public void setContent(CreativeContent content) {
        this.content = content;
    }

    public CreativeDetails getDetails() {
        return details;
    }

    public void setDetails(CreativeDetails details) {
        this.details = details;
    }

    public List<CreativeImpressionTracking> getCreativeImpressionTracking() {
        return creativeImpressionTracking;
    }

    public void setCreativeImpressionTracking(List<CreativeImpressionTracking> creativeImpressionTracking) {
        this.creativeImpressionTracking = creativeImpressionTracking;
    }

    public List<CreativeCustomIdentifier> getCustomIdentifiers() {
        return customIdentifiers;
    }

    public void setCustomIdentifiers(List<CreativeCustomIdentifier> customIdentifiers) {
        this.customIdentifiers = customIdentifiers;
    }

    public CreativeCompanionBanner getCompanionBanners() {
        return companionBanners;
    }

    public void setCompanionBanners(CreativeCompanionBanner companionBanners) {
        this.companionBanners = companionBanners;
    }

    public List<AdxCategory> getAdxCategories() {
        return adxCategories;
    }

    public void setAdxCategories(List<AdxCategory> adxCategories) {
        this.adxCategories = adxCategories;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getDooh() {
        return isDooh;
    }

    public void setDooh(Boolean dooh) {
        isDooh = dooh;
    }

    @Override
    public String toString() {
        return "Creative{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", accountId=" + accountId +
                ", language='" + language + '\'' +
                ", landingPageUrl='" + landingPageUrl + '\'' +
                ", landingPageDomain='" + landingPageDomain + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", type=" + type +
                ", layout='" + layout + '\'' +
                ", adChoicesEnabled=" + adChoicesEnabled +
                ", adChoiceIconLocation=" + adChoiceIconLocation +
                ", isThirdPartyCodeSecure=" + isThirdPartyCodeSecure +
                ", thirdPartyCode='" + thirdPartyCode + '\'' +
                ", adType=" + adType +
                ", userInteractions=" + userInteractions +
                ", expandDirections=" + expandDirections +
                ", creativeTagUrl='" + creativeTagUrl + '\'' +
                ", content=" + content +
                ", details=" + details +
                ", creativeImpressionTracking=" + creativeImpressionTracking +
                ", customIdentifiers=" + customIdentifiers +
                ", companionBanners=" + companionBanners +
                ", adxCategories=" + adxCategories +
                ", updatedAt='" + updatedAt + '\'' +
                ", isDooh=" + isDooh +
                '}';
    }

}
