package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Nov 30th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NativeListTargeting {

    private List<NativeListTarget> added;
    private List<Long> removed;
    private Boolean clearAll;

    public List<NativeListTarget> getAdded() {
        return added;
    }

    public void setAdded(List<NativeListTarget> added) {
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
        return "NativeListTargeting{" +
                "added=" + added +
                ", removed=" + removed +
                ", clearAll=" + clearAll +
                '}';
    }

}
