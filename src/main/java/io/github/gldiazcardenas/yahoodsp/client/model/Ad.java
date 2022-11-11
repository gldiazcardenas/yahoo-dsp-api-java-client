package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Gabriel Diaz, Sep 21th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ad {

    public enum NativeStatus {
        ON_HOLD;
        public static NativeStatus fromValue(String value) {
            for (NativeStatus type : values()) {
                if (type.name().equals(value)) {
                    return type;
                }
            }
            throw new UnsupportedOperationException("Unmapped value: " + value);
        }
    }

    private Long id;
    private String name;
    @JsonProperty("status")
    private String statusValue;
    private Long lineId;
    private Long creativeId;
    @JsonProperty("mediaType")
    private String mediaTypeValue;
    private List<AdSchedule> schedules;
    private AdCountdown countdown;
    @JsonProperty("nativeAdStatus")
    private String nativeAdStatusValue;
    private List<Object> nativeAdRestrictions;
    private String updatedAt;

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

    @JsonIgnore
    public Status getStatus() {
        return Status.fromValue(statusValue);
    }

    @JsonIgnore
    public void setStatus(Status status) {
        this.statusValue = status.name();
    }

    public String getStatusValue() {
        return statusValue;
    }

    public void setStatusValue(String statusValue) {
        this.statusValue = statusValue;
    }

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public Long getCreativeId() {
        return creativeId;
    }

    public void setCreativeId(Long creativeId) {
        this.creativeId = creativeId;
    }

    @JsonIgnore
    public MediaType getMediaType() {
        return MediaType.fromValue(mediaTypeValue);
    }

    @JsonIgnore
    public void setMediaType(MediaType mediaType) {
        this.mediaTypeValue = mediaType.name();
    }

    public String getMediaTypeValue() {
        return mediaTypeValue;
    }

    public void setMediaTypeValue(String mediaTypeValue) {
        this.mediaTypeValue = mediaTypeValue;
    }

    public List<AdSchedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<AdSchedule> schedules) {
        this.schedules = schedules;
    }

    public AdCountdown getCountdown() {
        return countdown;
    }

    public void setCountdown(AdCountdown countdown) {
        this.countdown = countdown;
    }

    @JsonIgnore
    public NativeStatus getNativeAdStatus() {
        return NativeStatus.fromValue(nativeAdStatusValue);
    }

    @JsonIgnore
    public void setNativeAdStatus(NativeStatus nativeAdStatus) {
        this.nativeAdStatusValue = nativeAdStatus.name();
    }

    public String getNativeAdStatusValue() {
        return nativeAdStatusValue;
    }

    public void setNativeAdStatusValue(String nativeAdStatusValue) {
        this.nativeAdStatusValue = nativeAdStatusValue;
    }

    public List<Object> getNativeAdRestrictions() {
        return nativeAdRestrictions;
    }

    public void setNativeAdRestrictions(List<Object> nativeAdRestrictions) {
        this.nativeAdRestrictions = nativeAdRestrictions;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + statusValue +
                ", lineId=" + lineId +
                ", creativeId=" + creativeId +
                ", mediaType=" + mediaTypeValue +
                ", schedules=" + schedules +
                ", countdown=" + countdown +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }

}
