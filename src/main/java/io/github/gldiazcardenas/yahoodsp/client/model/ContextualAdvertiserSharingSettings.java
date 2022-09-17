package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Sep 16th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContextualAdvertiserSharingSettings {

    /**
     * Action type.
     */
    public enum Type {
        INCLUDE,
        EXCLUDE,
        ALL
    }

    private Type type;
    private List<ContextualAdvertiser> advertisers;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<ContextualAdvertiser> getAdvertisers() {
        return advertisers;
    }

    public void setAdvertisers(List<ContextualAdvertiser> advertisers) {
        this.advertisers = advertisers;
    }

    @Override
    public String toString() {
        return "ContextualAdvertiserSharingSettings{" +
                "type=" + type +
                ", advertisers=" + advertisers +
                '}';
    }

}
