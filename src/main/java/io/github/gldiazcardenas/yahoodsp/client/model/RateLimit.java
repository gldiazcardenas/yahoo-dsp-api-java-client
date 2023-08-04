package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Aug 04th 2023.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RateLimit {

    private int getLimitPerMin;
    private int getLimitPerHr;
    private int getLimitPerDay;

    private int postLimitPerMin;
    private int postLimitPerHr;
    private int postLimitPerDay;

    private int putLimitPerMin;
    private int putLimitPerHr;
    private int putLimitPerDay;

    private int getLimitPerMinRemaining;
    private int getLimitPerHrRemaining;
    private int getLimitPerDayRemaining;

    private int postLimitPerMinRemaining;
    private int postLimitPerHrRemaining;
    private int postLimitPerDayRemaining;

    private int putLimitPerMinRemaining;
    private int putLimitPerHrRemaining;
    private int putLimitPerDayRemaining;

    public int getGetLimitPerMin() {
        return getLimitPerMin;
    }

    public void setGetLimitPerMin(int getLimitPerMin) {
        this.getLimitPerMin = getLimitPerMin;
    }

    public int getGetLimitPerHr() {
        return getLimitPerHr;
    }

    public void setGetLimitPerHr(int getLimitPerHr) {
        this.getLimitPerHr = getLimitPerHr;
    }

    public int getGetLimitPerDay() {
        return getLimitPerDay;
    }

    public void setGetLimitPerDay(int getLimitPerDay) {
        this.getLimitPerDay = getLimitPerDay;
    }

    public int getPostLimitPerMin() {
        return postLimitPerMin;
    }

    public void setPostLimitPerMin(int postLimitPerMin) {
        this.postLimitPerMin = postLimitPerMin;
    }

    public int getPostLimitPerHr() {
        return postLimitPerHr;
    }

    public void setPostLimitPerHr(int postLimitPerHr) {
        this.postLimitPerHr = postLimitPerHr;
    }

    public int getPostLimitPerDay() {
        return postLimitPerDay;
    }

    public void setPostLimitPerDay(int postLimitPerDay) {
        this.postLimitPerDay = postLimitPerDay;
    }

    public int getPutLimitPerMin() {
        return putLimitPerMin;
    }

    public void setPutLimitPerMin(int putLimitPerMin) {
        this.putLimitPerMin = putLimitPerMin;
    }

    public int getPutLimitPerHr() {
        return putLimitPerHr;
    }

    public void setPutLimitPerHr(int putLimitPerHr) {
        this.putLimitPerHr = putLimitPerHr;
    }

    public int getPutLimitPerDay() {
        return putLimitPerDay;
    }

    public void setPutLimitPerDay(int putLimitPerDay) {
        this.putLimitPerDay = putLimitPerDay;
    }

    public int getGetLimitPerMinRemaining() {
        return getLimitPerMinRemaining;
    }

    public void setGetLimitPerMinRemaining(int getLimitPerMinRemaining) {
        this.getLimitPerMinRemaining = getLimitPerMinRemaining;
    }

    public int getGetLimitPerHrRemaining() {
        return getLimitPerHrRemaining;
    }

    public void setGetLimitPerHrRemaining(int getLimitPerHrRemaining) {
        this.getLimitPerHrRemaining = getLimitPerHrRemaining;
    }

    public int getGetLimitPerDayRemaining() {
        return getLimitPerDayRemaining;
    }

    public void setGetLimitPerDayRemaining(int getLimitPerDayRemaining) {
        this.getLimitPerDayRemaining = getLimitPerDayRemaining;
    }

    public int getPostLimitPerMinRemaining() {
        return postLimitPerMinRemaining;
    }

    public void setPostLimitPerMinRemaining(int postLimitPerMinRemaining) {
        this.postLimitPerMinRemaining = postLimitPerMinRemaining;
    }

    public int getPostLimitPerHrRemaining() {
        return postLimitPerHrRemaining;
    }

    public void setPostLimitPerHrRemaining(int postLimitPerHrRemaining) {
        this.postLimitPerHrRemaining = postLimitPerHrRemaining;
    }

    public int getPostLimitPerDayRemaining() {
        return postLimitPerDayRemaining;
    }

    public void setPostLimitPerDayRemaining(int postLimitPerDayRemaining) {
        this.postLimitPerDayRemaining = postLimitPerDayRemaining;
    }

    public int getPutLimitPerMinRemaining() {
        return putLimitPerMinRemaining;
    }

    public void setPutLimitPerMinRemaining(int putLimitPerMinRemaining) {
        this.putLimitPerMinRemaining = putLimitPerMinRemaining;
    }

    public int getPutLimitPerHrRemaining() {
        return putLimitPerHrRemaining;
    }

    public void setPutLimitPerHrRemaining(int putLimitPerHrRemaining) {
        this.putLimitPerHrRemaining = putLimitPerHrRemaining;
    }

    public int getPutLimitPerDayRemaining() {
        return putLimitPerDayRemaining;
    }

    public void setPutLimitPerDayRemaining(int putLimitPerDayRemaining) {
        this.putLimitPerDayRemaining = putLimitPerDayRemaining;
    }

    @Override
    public String toString() {
        return "RateLimit{" +
            "getLimitPerMin=" + getLimitPerMin +
            ", getLimitPerHr=" + getLimitPerHr +
            ", getLimitPerDay=" + getLimitPerDay +
            ", postLimitPerMin=" + postLimitPerMin +
            ", postLimitPerHr=" + postLimitPerHr +
            ", postLimitPerDay=" + postLimitPerDay +
            ", putLimitPerMin=" + putLimitPerMin +
            ", putLimitPerHr=" + putLimitPerHr +
            ", putLimitPerDay=" + putLimitPerDay +
            ", getLimitPerMinRemaining=" + getLimitPerMinRemaining +
            ", getLimitPerHrRemaining=" + getLimitPerHrRemaining +
            ", getLimitPerDayRemaining=" + getLimitPerDayRemaining +
            ", postLimitPerMinRemaining=" + postLimitPerMinRemaining +
            ", postLimitPerHrRemaining=" + postLimitPerHrRemaining +
            ", postLimitPerDayRemaining=" + postLimitPerDayRemaining +
            ", putLimitPerMinRemaining=" + putLimitPerMinRemaining +
            ", putLimitPerHrRemaining=" + putLimitPerHrRemaining +
            ", putLimitPerDayRemaining=" + putLimitPerDayRemaining +
            '}';
    }
}
