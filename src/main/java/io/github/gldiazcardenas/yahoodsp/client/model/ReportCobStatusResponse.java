package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportCobStatusResponse {

    private String advertiserTimezone;
    private Boolean dayClosed;

    public String getAdvertiserTimezone() {
        return advertiserTimezone;
    }

    public void setAdvertiserTimezone(String advertiserTimezone) {
        this.advertiserTimezone = advertiserTimezone;
    }

    public Boolean getDayClosed() {
        return dayClosed;
    }

    public void setDayClosed(Boolean dayClosed) {
        this.dayClosed = dayClosed;
    }

    @Override
    public String toString() {
        return "ReportCOBStatusResponse{" +
                "advertiserTimezone='" + advertiserTimezone + '\'' +
                ", dayClosed=" + dayClosed +
                '}';
    }
}
