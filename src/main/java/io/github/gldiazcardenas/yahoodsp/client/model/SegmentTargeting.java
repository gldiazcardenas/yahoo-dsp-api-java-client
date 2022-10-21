package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Oct 01th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SegmentTargeting {

    private Boolean clearAll;
    private List<SegmentTarget> added;
    private List<SegmentTarget> edited;
    private List<Long> removed;

    public Boolean getClearAll() {
        return clearAll;
    }

    public void setClearAll(Boolean clearAll) {
        this.clearAll = clearAll;
    }

    public List<SegmentTarget> getAdded() {
        return added;
    }

    public void setAdded(List<SegmentTarget> added) {
        this.added = added;
    }

    public List<SegmentTarget> getEdited() {
        return edited;
    }

    public void setEdited(List<SegmentTarget> edited) {
        this.edited = edited;
    }

    public List<Long> getRemoved() {
        return removed;
    }

    public void setRemoved(List<Long> removed) {
        this.removed = removed;
    }

    @Override
    public String toString() {
        return "SegmentTargeting{" +
                "clearAll=" + clearAll +
                ", added=" + added +
                ", edited=" + edited +
                ", removed=" + removed +
                '}';
    }

}
