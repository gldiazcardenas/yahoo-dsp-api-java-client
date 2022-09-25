package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LineTargetingRequest {

    private List<Gender> genders;
    private List<AgeRange> ages;
    private Integer threshold;
    private FrequencyCapPeriodType frequencyCapPeriod;
    private FrequencyCapPeriodType frequencyCapValue;
    private List<String> languages;
    private List<InventoryType> inventoryTypes;
    private List<BotType> bots;
    private List<DeviceType> deviceTypes;
    private List<OsType> os;
    private Boolean serveUnknownUser;
    private List<LineTargetingType> types;

}
