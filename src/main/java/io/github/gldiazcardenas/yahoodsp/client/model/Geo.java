package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gabriel Diaz, Sep 17th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Geo {

    public enum Level {
        COUNTRY("Country"),
        STATE("State"),
        CITY("City"),
        DMA("Dma"),
        METRO_AREA("Metro Area"),
        SUB_REGION("Sub Region"),
        REGION("Region"),
        ZIP("Zip"),
        POST_CODE_PREFIX("PostCode Prefix");

        private final String value;

        Level(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static Level fromValue(String value) {
            if (value != null && !value.isEmpty()) {
                for (Level level : values()) {
                    if (level.value.equals(value)) {
                        return level;
                    }
                }
            }
            throw new UnsupportedOperationException("Unmapped value: " + value);
        }
    }

    private String id;
    private String name;
    private String description;
    @JsonProperty("level")
    private String levelValue;
    private String key;
    private String code;
    private String woeid;
    private String countryISO3;
    private GeoLookupContext geoLookupContext;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonIgnore
    public Level getLevel() {
        return Level.fromValue(levelValue);
    }

    @JsonIgnore
    public void setLevel(Level level) {
        this.levelValue = level.getValue();
    }

    public String getLevelValue() {
        return levelValue;
    }

    public void setLevelValue(String levelValue) {
        this.levelValue = levelValue;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getWoeid() {
        return woeid;
    }

    public void setWoeid(String woeid) {
        this.woeid = woeid;
    }

    public String getCountryISO3() {
        return countryISO3;
    }

    public void setCountryISO3(String countryISO3) {
        this.countryISO3 = countryISO3;
    }

    public GeoLookupContext getGeoLookupContext() {
        return geoLookupContext;
    }

    public void setGeoLookupContext(GeoLookupContext geoLookupContext) {
        this.geoLookupContext = geoLookupContext;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", level='" + levelValue + '\'' +
                ", key='" + key + '\'' +
                ", code='" + code + '\'' +
                ", woeid='" + woeid + '\'' +
                ", countryISO3='" + countryISO3 + '\'' +
                ", geoLookupContext=" + geoLookupContext +
                '}';
    }

}
