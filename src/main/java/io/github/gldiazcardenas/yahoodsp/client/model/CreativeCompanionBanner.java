package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreativeCompanionBanner {

    private Long id;
    private String companionBinaryData;
    private String mimeType;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanionBinaryData() {
        return companionBinaryData;
    }

    public void setCompanionBinaryData(String companionBinaryData) {
        this.companionBinaryData = companionBinaryData;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CreativeCompanionBanner{" +
                "id=" + id +
                ", companionBinaryData='" + companionBinaryData + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
