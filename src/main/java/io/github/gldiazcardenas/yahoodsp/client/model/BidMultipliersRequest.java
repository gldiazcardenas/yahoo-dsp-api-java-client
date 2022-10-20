package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Oct 20th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BidMultipliersRequest {

    private List<BidMultiplier> added;
    private List<Long> removed;
    private List<BidMultiplier> removedItems;
    private List<BidMultiplier> edited;

    public List<BidMultiplier> getAdded() {
        return added;
    }

    public void setAdded(List<BidMultiplier> added) {
        this.added = added;
    }

    public List<Long> getRemoved() {
        return removed;
    }

    public void setRemoved(List<Long> removed) {
        this.removed = removed;
    }

    public List<BidMultiplier> getRemovedItems() {
        return removedItems;
    }

    public void setRemovedItems(List<BidMultiplier> removedItems) {
        this.removedItems = removedItems;
    }

    public List<BidMultiplier> getEdited() {
        return edited;
    }

    public void setEdited(List<BidMultiplier> edited) {
        this.edited = edited;
    }

    @Override
    public String toString() {
        return "BidMultipliersRequest{" +
                "added=" + added +
                ", removed=" + removed +
                ", removedItems=" + removedItems +
                ", edited=" + edited +
                '}';
    }

}
