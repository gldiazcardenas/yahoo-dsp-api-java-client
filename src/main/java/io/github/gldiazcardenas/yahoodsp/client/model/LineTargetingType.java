package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LineTargetingType {

    @JsonProperty("name")
    private String nameValue;
    @JsonProperty("isTargeted")
    private Boolean targeted;

    public String getNameValue() {
        return nameValue;
    }

    public void setNameValue(String nameValue) {
        this.nameValue = nameValue;
    }

    @JsonIgnore
    public TargetType getName() {
        return TargetType.fromValue(nameValue);
    }

    @JsonIgnore
    public void setName(TargetType name) {
        this.nameValue = name.name();
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
                "name=" + nameValue +
                ", targeted=" + targeted +
                '}';
    }

}
