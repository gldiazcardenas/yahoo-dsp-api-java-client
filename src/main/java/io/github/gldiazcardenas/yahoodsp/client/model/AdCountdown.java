package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;

/**
 * @author Gabriel Diaz, Sep 21th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdCountdown {

    private Long id;
    private Integer countdownPrefixId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDateTime endDate;
    private String timezone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCountdownPrefixId() {
        return countdownPrefixId;
    }

    public void setCountdownPrefixId(Integer countdownPrefixId) {
        this.countdownPrefixId = countdownPrefixId;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public String toString() {
        return "AdCountdown{" +
                "id=" + id +
                ", countdownPrefixId=" + countdownPrefixId +
                ", endDate=" + endDate +
                ", timezone='" + timezone + '\'' +
                '}';
    }

}
