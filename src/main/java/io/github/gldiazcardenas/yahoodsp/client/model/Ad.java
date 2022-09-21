package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Sep 21th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ad {

    private Long id;
    private String name;
    private Status status;
    private Long lineId;
    private Long creativeId;
    private MediaType mediaType;
    private List<AdSchedule> schedules;
    private AdCountdown countdown;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
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
                ", status=" + status +
                ", lineId=" + lineId +
                ", creativeId=" + creativeId +
                ", mediaType=" + mediaType +
                ", schedules=" + schedules +
                ", countdown=" + countdown +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }

}
