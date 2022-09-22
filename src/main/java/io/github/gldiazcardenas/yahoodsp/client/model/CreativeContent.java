package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreativeContent {

    private String binaryData;
    private String largeMobileImageData;
    private String smallBinaryData;
    private String smallImageBinaryData;
    private String nativeVideoImageData;
    private String panoramaImageData;

    public String getBinaryData() {
        return binaryData;
    }

    public void setBinaryData(String binaryData) {
        this.binaryData = binaryData;
    }

    public String getLargeMobileImageData() {
        return largeMobileImageData;
    }

    public void setLargeMobileImageData(String largeMobileImageData) {
        this.largeMobileImageData = largeMobileImageData;
    }

    public String getSmallBinaryData() {
        return smallBinaryData;
    }

    public void setSmallBinaryData(String smallBinaryData) {
        this.smallBinaryData = smallBinaryData;
    }

    public String getSmallImageBinaryData() {
        return smallImageBinaryData;
    }

    public void setSmallImageBinaryData(String smallImageBinaryData) {
        this.smallImageBinaryData = smallImageBinaryData;
    }

    public String getNativeVideoImageData() {
        return nativeVideoImageData;
    }

    public void setNativeVideoImageData(String nativeVideoImageData) {
        this.nativeVideoImageData = nativeVideoImageData;
    }

    public String getPanoramaImageData() {
        return panoramaImageData;
    }

    public void setPanoramaImageData(String panoramaImageData) {
        this.panoramaImageData = panoramaImageData;
    }
}
