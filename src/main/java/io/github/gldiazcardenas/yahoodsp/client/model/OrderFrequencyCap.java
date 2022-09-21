package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gabriel Diaz, Sep 19th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderFrequencyCap {

    @JsonProperty("orderFrequencyCapId")
    private Long id;
    private Long orderId;
    private Integer frequencyCapValueMinute;
    private Integer frequencyCapValueHour;
    private Integer frequencyCapPeriodMultiHour;
    private Integer frequencyCapValueDay;
    private Integer frequencyCapValueWeek;
    private Integer frequencyCapValueMonth;
    private String frequencyCapPacingType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getFrequencyCapValueMinute() {
        return frequencyCapValueMinute;
    }

    public void setFrequencyCapValueMinute(Integer frequencyCapValueMinute) {
        this.frequencyCapValueMinute = frequencyCapValueMinute;
    }

    public Integer getFrequencyCapValueHour() {
        return frequencyCapValueHour;
    }

    public void setFrequencyCapValueHour(Integer frequencyCapValueHour) {
        this.frequencyCapValueHour = frequencyCapValueHour;
    }

    public Integer getFrequencyCapPeriodMultiHour() {
        return frequencyCapPeriodMultiHour;
    }

    public void setFrequencyCapPeriodMultiHour(Integer frequencyCapPeriodMultiHour) {
        this.frequencyCapPeriodMultiHour = frequencyCapPeriodMultiHour;
    }

    public Integer getFrequencyCapValueDay() {
        return frequencyCapValueDay;
    }

    public void setFrequencyCapValueDay(Integer frequencyCapValueDay) {
        this.frequencyCapValueDay = frequencyCapValueDay;
    }

    public Integer getFrequencyCapValueWeek() {
        return frequencyCapValueWeek;
    }

    public void setFrequencyCapValueWeek(Integer frequencyCapValueWeek) {
        this.frequencyCapValueWeek = frequencyCapValueWeek;
    }

    public Integer getFrequencyCapValueMonth() {
        return frequencyCapValueMonth;
    }

    public void setFrequencyCapValueMonth(Integer frequencyCapValueMonth) {
        this.frequencyCapValueMonth = frequencyCapValueMonth;
    }

    public String getFrequencyCapPacingType() {
        return frequencyCapPacingType;
    }

    public void setFrequencyCapPacingType(String frequencyCapPacingType) {
        this.frequencyCapPacingType = frequencyCapPacingType;
    }

    @Override
    public String toString() {
        return "OrderFrequencyCap{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", frequencyCapValueMinute=" + frequencyCapValueMinute +
                ", frequencyCapValueHour=" + frequencyCapValueHour +
                ", frequencyCapPeriodMultiHour=" + frequencyCapPeriodMultiHour +
                ", frequencyCapValueDay=" + frequencyCapValueDay +
                ", frequencyCapValueWeek=" + frequencyCapValueWeek +
                ", frequencyCapValueMonth=" + frequencyCapValueMonth +
                ", frequencyCapPacingType='" + frequencyCapPacingType + '\'' +
                '}';
    }

}
