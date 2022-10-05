package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LineTargetingType {

    private TargetType name;
    @JsonProperty("isTargeted")
    private Boolean targeted;

    public TargetType getName() {
        return name;
    }

    public void setName(TargetType name) {
        this.name = name;
    }

    public Boolean getTargeted() {
        return targeted;
    }

    public void setTargeted(Boolean targeted) {
        this.targeted = targeted;
    }

    @Override
    public String toString() {
        return "LineTargetingType{" +
                "name=" + name +
                ", targeted=" + targeted +
                '}';
    }

}
