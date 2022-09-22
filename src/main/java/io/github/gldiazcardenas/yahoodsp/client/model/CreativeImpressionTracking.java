package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreativeImpressionTracking {

    public enum TrackingEventType {
        IMPRESSION,
        PERCENT_25,
        PERCENT_50,
        PERCENT_75,
        PERCENT_100,
        CLICK,
        JAVASCRIPT
    }

    private Long id;
    private String impTrackerUrl;
    private TrackingEventType trackingEventType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImpTrackerUrl() {
        return impTrackerUrl;
    }

    public void setImpTrackerUrl(String impTrackerUrl) {
        this.impTrackerUrl = impTrackerUrl;
    }

    public TrackingEventType getTrackingEventType() {
        return trackingEventType;
    }

    public void setTrackingEventType(TrackingEventType trackingEventType) {
        this.trackingEventType = trackingEventType;
    }

    @Override
    public String toString() {
        return "CreativeImpressionTracking{" +
                "id=" + id +
                ", impTrackerUrl='" + impTrackerUrl + '\'' +
                ", trackingEventType=" + trackingEventType +
                '}';
    }

}
