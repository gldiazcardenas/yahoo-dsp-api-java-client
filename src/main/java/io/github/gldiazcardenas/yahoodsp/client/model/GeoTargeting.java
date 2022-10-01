package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Oct 01th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoTargeting {

    private List<String> removedNames;
    private Boolean clearAll;
    private List<GeoTarget> added;

    public List<String> getRemovedNames() {
        return removedNames;
    }

    public void setRemovedNames(List<String> removedNames) {
        this.removedNames = removedNames;
    }

    public Boolean getClearAll() {
        return clearAll;
    }

    public void setClearAll(Boolean clearAll) {
        this.clearAll = clearAll;
    }

    public List<GeoTarget> getAdded() {
        return added;
    }

    public void setAdded(List<GeoTarget> added) {
        this.added = added;
    }

    @Override
    public String toString() {
        return "GeoTargeting{" +
                "removedNames=" + removedNames +
                ", clearAll=" + clearAll +
                ", added=" + added +
                '}';
    }

}
