package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreativeImages {

    private String iconImageSecuredUrl;
    private String imageSecuredUrl;
    private String smallImageSecuredUrl;
    private String largeMobileImageSecuredUrl;

    public String getIconImageSecuredUrl() {
        return iconImageSecuredUrl;
    }

    public void setIconImageSecuredUrl(String iconImageSecuredUrl) {
        this.iconImageSecuredUrl = iconImageSecuredUrl;
    }

    public String getImageSecuredUrl() {
        return imageSecuredUrl;
    }

    public void setImageSecuredUrl(String imageSecuredUrl) {
        this.imageSecuredUrl = imageSecuredUrl;
    }

    public String getSmallImageSecuredUrl() {
        return smallImageSecuredUrl;
    }

    public void setSmallImageSecuredUrl(String smallImageSecuredUrl) {
        this.smallImageSecuredUrl = smallImageSecuredUrl;
    }

    public String getLargeMobileImageSecuredUrl() {
        return largeMobileImageSecuredUrl;
    }

    public void setLargeMobileImageSecuredUrl(String largeMobileImageSecuredUrl) {
        this.largeMobileImageSecuredUrl = largeMobileImageSecuredUrl;
    }

    @Override
    public String toString() {
        return "CreativeImages{" +
                "iconImageSecuredUrl='" + iconImageSecuredUrl + '\'' +
                "imageSecuredUrl='" + imageSecuredUrl + '\'' +
                ", smallImageSecuredUrl='" + smallImageSecuredUrl + '\'' +
                ", largeMobileImageSecuredUrl='" + largeMobileImageSecuredUrl + '\'' +
                '}';
    }
}
