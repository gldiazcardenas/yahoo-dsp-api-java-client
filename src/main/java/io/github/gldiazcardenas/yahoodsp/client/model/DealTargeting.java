package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Oct 01th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DealTargeting {

    private List<Long> added;
    private List<Long> removed;
    private Boolean clearAll;

    public List<Long> getAdded() {
        return added;
    }

    public void setAdded(List<Long> added) {
        this.added = added;
    }

    public List<Long> getRemoved() {
        return removed;
    }

    public void setRemoved(List<Long> removed) {
        this.removed = removed;
    }

    public Boolean getClearAll() {
        return clearAll;
    }

    public void setClearAll(Boolean clearAll) {
        this.clearAll = clearAll;
    }

    @Override
    public String toString() {
        return "IdTargeting{" +
                "added=" + added +
                ", removed=" + removed +
                ", clearAll=" + clearAll +
                '}';
    }

}
