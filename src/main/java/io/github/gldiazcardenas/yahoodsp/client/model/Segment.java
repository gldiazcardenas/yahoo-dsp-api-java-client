package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Gabriel Diaz, Sep 19th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Segment {

    public enum AudienceType {
        YAHOO,
        DMP,
        ADVERTISER;

        public static AudienceType fromValue(String value) {
            if (value != null && !value.isEmpty()) {
                for (AudienceType type : values()) {
                    if (type.name().equals(value)) {
                        return type;
                    }
                }
            }
            throw new UnsupportedOperationException("Unmapped value: " + value);
        }
    }

    private Long id;
    private String name;
    private Status status;
    @JsonProperty("segmentType")
    private String typeValue;
    @JsonProperty("audienceType")
    private String audienceTypeValue;
    private String createdBy;
    private String createdAt;
    private Long reachCount;
    private List<SegmentHierarchy> hierarchy;

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

    @JsonIgnore
    public SegmentType getType() {
        return SegmentType.fromValue(typeValue);
    }

    @JsonIgnore
    public void setType(SegmentType type) {
        this.typeValue = type.name();
    }

    public String getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(String typeValue) {
        this.typeValue = typeValue;
    }

    @JsonIgnore
    public AudienceType getAudienceType() {
        if ("Yahoo".equals(audienceTypeValue)) {
            return AudienceType.YAHOO;
        }

        if ("3rd Party".equals(audienceTypeValue)) {
            return AudienceType.DMP;
        }

        return AudienceType.fromValue(audienceTypeValue);
    }

    @JsonIgnore
    public void setAudienceType(AudienceType audienceType) {
        this.audienceTypeValue = audienceType.name();
    }

    public String getAudienceTypeValue() {
        return audienceTypeValue;
    }

    public void setAudienceTypeValue(String audienceTypeValue) {
        this.audienceTypeValue = audienceTypeValue;
    }

    public Long getReachCount() {
        return reachCount;
    }

    public void setReachCount(Long reachCount) {
        this.reachCount = reachCount;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public List<SegmentHierarchy> getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(List<SegmentHierarchy> hierarchy) {
        this.hierarchy = hierarchy;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", type='" + typeValue + '\'' +
                ", audienceType='" + audienceTypeValue + '\'' +
                ", reachCount=" + reachCount +
                ", createdBy='" + createdBy + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", hierarchy=" + hierarchy +
                '}';
    }

}
