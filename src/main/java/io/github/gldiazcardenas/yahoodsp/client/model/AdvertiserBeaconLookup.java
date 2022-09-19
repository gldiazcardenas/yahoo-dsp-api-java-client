package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Sep 19th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvertiserBeaconLookup {

    private Long id;
    private String name;
    private Boolean dotPixel;

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

    public Boolean getDotPixel() {
        return dotPixel;
    }

    public void setDotPixel(Boolean dotPixel) {
        this.dotPixel = dotPixel;
    }

    @Override
    public String toString() {
        return "AdvertiserBeaconLookup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dotPixel=" + dotPixel +
                '}';
    }

}
