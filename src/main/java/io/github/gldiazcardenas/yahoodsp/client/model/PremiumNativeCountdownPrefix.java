package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Sep 15th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PremiumNativeCountdownPrefix {

    private Integer id;
    private String countdownPrefix;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountdownPrefix() {
        return countdownPrefix;
    }

    public void setCountdownPrefix(String countdownPrefix) {
        this.countdownPrefix = countdownPrefix;
    }

    @Override
    public String toString() {
        return "PremiumNativeCountdownPrefix{" +
                "id=" + id +
                ", countdownPrefix='" + countdownPrefix + '\'' +
                '}';
    }

}
