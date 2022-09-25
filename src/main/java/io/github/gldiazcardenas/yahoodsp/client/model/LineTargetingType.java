package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LineTargetingType {

    private TargetType name;
    private Boolean isTargeted;

    public TargetType getName() {
        return name;
    }

    public void setName(TargetType name) {
        this.name = name;
    }

    public Boolean getTargeted() {
        return isTargeted;
    }

    public void setTargeted(Boolean targeted) {
        isTargeted = targeted;
    }

    @Override
    public String toString() {
        return "LineTargetingType{" +
                "name=" + name +
                ", isTargeted=" + isTargeted +
                '}';
    }

}
