package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Oct 11th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NativeListItem {

    private String itemName;

    public NativeListItem() {
        super();
    }

    public NativeListItem(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "NativeListItem{" +
                ", itemName='" + itemName + '\'' +
                '}';
    }

}
