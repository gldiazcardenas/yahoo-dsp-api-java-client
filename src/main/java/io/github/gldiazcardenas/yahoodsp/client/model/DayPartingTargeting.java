package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Oct 01th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DayPartingTargeting {

    private List<Integer> sunday;
    private List<Integer> monday;
    private List<Integer> tuesday;
    private List<Integer> wednesday;
    private List<Integer> thursday;
    private List<Integer> friday;
    private List<String> saturday;

    public List<Integer> getSunday() {
        return sunday;
    }

    public void setSunday(List<Integer> sunday) {
        this.sunday = sunday;
    }

    public List<Integer> getMonday() {
        return monday;
    }

    public void setMonday(List<Integer> monday) {
        this.monday = monday;
    }

    public List<Integer> getTuesday() {
        return tuesday;
    }

    public void setTuesday(List<Integer> tuesday) {
        this.tuesday = tuesday;
    }

    public List<Integer> getWednesday() {
        return wednesday;
    }

    public void setWednesday(List<Integer> wednesday) {
        this.wednesday = wednesday;
    }

    public List<Integer> getThursday() {
        return thursday;
    }

    public void setThursday(List<Integer> thursday) {
        this.thursday = thursday;
    }

    public List<Integer> getFriday() {
        return friday;
    }

    public void setFriday(List<Integer> friday) {
        this.friday = friday;
    }

    public List<String> getSaturday() {
        return saturday;
    }

    public void setSaturday(List<String> saturday) {
        this.saturday = saturday;
    }

    @Override
    public String toString() {
        return "DayPartingTargeting{" +
                "sunday=" + sunday +
                ", monday=" + monday +
                ", tuesday=" + tuesday +
                ", wednesday=" + wednesday +
                ", thursday=" + thursday +
                ", friday=" + friday +
                ", saturday=" + saturday +
                '}';
    }
}
