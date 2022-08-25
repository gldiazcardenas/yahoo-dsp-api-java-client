package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gabriel Diaz, Aug 24th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SeatLookup {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;

    public String getId() {
        return id;
    }

    public SeatLookup setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SeatLookup setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "SeatLookup{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
