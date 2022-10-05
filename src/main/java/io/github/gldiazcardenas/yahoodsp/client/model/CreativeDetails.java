package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreativeDetails {

    private Integer duration;
    private CreativeImages images;
    private List<CreativeMedia> creativeMedia;
    private String title;
    private String companyName;
    private String description;
    private String callToAction;

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public CreativeImages getImages() {
        return images;
    }

    public void setImages(CreativeImages images) {
        this.images = images;
    }

    public List<CreativeMedia> getCreativeMedia() {
        return creativeMedia;
    }

    public void setCreativeMedia(List<CreativeMedia> creativeMedia) {
        this.creativeMedia = creativeMedia;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCallToAction() {
        return callToAction;
    }

    public void setCallToAction(String callToAction) {
        this.callToAction = callToAction;
    }

    @Override
    public String toString() {
        return "CreativeDetails{" +
                "duration=" + duration +
                ", images=" + images +
                ", creativeMedia=" + creativeMedia +
                ", title='" + title + '\'' +
                ", companyName='" + companyName + '\'' +
                ", description='" + description + '\'' +
                ", callToAction='" + callToAction + '\'' +
                '}';
    }
}
