package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Sep 19th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoLookupContext {

    private String country;
    private String state;
    private String subLocality;
    private String locality;
    private String majorMetroArea;
    private String city;
    private String postcode;
    private String postcodePrefix;
    private String dma;
    private String dmaLong;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSubLocality() {
        return subLocality;
    }

    public void setSubLocality(String subLocality) {
        this.subLocality = subLocality;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getMajorMetroArea() {
        return majorMetroArea;
    }

    public void setMajorMetroArea(String majorMetroArea) {
        this.majorMetroArea = majorMetroArea;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPostcodePrefix() {
        return postcodePrefix;
    }

    public void setPostcodePrefix(String postcodePrefix) {
        this.postcodePrefix = postcodePrefix;
    }

    public String getDma() {
        return dma;
    }

    public void setDma(String dma) {
        this.dma = dma;
    }

    public String getDmaLong() {
        return dmaLong;
    }

    public void setDmaLong(String dmaLong) {
        this.dmaLong = dmaLong;
    }

    @Override
    public String toString() {
        return "GeoLookupContext{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", subLocality='" + subLocality + '\'' +
                ", locality='" + locality + '\'' +
                ", majorMetroArea='" + majorMetroArea + '\'' +
                ", city='" + city + '\'' +
                ", postcode='" + postcode + '\'' +
                ", postcodePrefix='" + postcodePrefix + '\'' +
                ", dma='" + dma + '\'' +
                ", dmaLong='" + dmaLong + '\'' +
                '}';
    }
}
