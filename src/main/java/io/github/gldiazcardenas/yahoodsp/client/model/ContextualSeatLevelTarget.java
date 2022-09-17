package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Gabriel Diaz, Sep 16th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContextualSeatLevelTarget {

    public enum ChannelSubType {
        STANDARD_DISPLAY,
        STANDARD_VIDEO,
        NATIVE_DISPLAY,
        NATIVE_VIDEO,
        CTV
    }

    @JsonProperty("isExcluded")
    private boolean excluded;
    private List<ChannelSubType> channelSubTypes;

    public boolean isExcluded() {
        return excluded;
    }

    public void setExcluded(boolean excluded) {
        this.excluded = excluded;
    }

    public List<ChannelSubType> getChannelSubTypes() {
        return channelSubTypes;
    }

    public void setChannelSubTypes(List<ChannelSubType> channelSubTypes) {
        this.channelSubTypes = channelSubTypes;
    }

    @Override
    public String toString() {
        return "ContextualSeatLevelTarget{" +
                "excluded=" + excluded +
                ", channelSubTypes=" + channelSubTypes +
                '}';
    }

}
