package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gabriel Diaz, Aug 24th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Seat {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("currency")
    private String currency;

    public String getId() {
        return id;
    }

    public Seat setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Seat setName(String name) {
        this.name = name;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public Seat setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public Seat setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", timezone='" + timezone + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }

}
