package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreativeMedia {

    private Long id;
    private Integer bidRate;
    private Integer frameRate;
    private String mediaUrl;
    private Integer width;
    private Integer height;
    private String mediaMimeType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBidRate() {
        return bidRate;
    }

    public void setBidRate(Integer bidRate) {
        this.bidRate = bidRate;
    }

    public Integer getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getMediaMimeType() {
        return mediaMimeType;
    }

    public void setMediaMimeType(String mediaMimeType) {
        this.mediaMimeType = mediaMimeType;
    }

    @Override
    public String toString() {
        return "CreativeMedia{" +
                "id=" + id +
                ", bidRate=" + bidRate +
                ", frameRate=" + frameRate +
                ", mediaUrl='" + mediaUrl + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", mediaMimeType='" + mediaMimeType + '\'' +
                '}';
    }

}
