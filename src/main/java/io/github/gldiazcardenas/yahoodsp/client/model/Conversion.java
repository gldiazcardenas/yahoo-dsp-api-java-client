package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

/**
 * @author Gabriel Diaz, Sep 21th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Conversion {

    public enum WindowUnitType {
        DAY,
        HOUR,
        MINUTE
    }

    private Long id;
    private Long lineId;
    private Long beaconId;
    private Boolean acceptViewThrough;
    private Integer clickWindow;
    private WindowUnitType clickWindowUnitType;
    private Integer viewWindow;
    private WindowUnitType viewWindowUnitType;
    private BigDecimal viewBeaconValueDiscount;
    private BigDecimal beaconValuePc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public Long getBeaconId() {
        return beaconId;
    }

    public void setBeaconId(Long beaconId) {
        this.beaconId = beaconId;
    }

    public Boolean getAcceptViewThrough() {
        return acceptViewThrough;
    }

    public void setAcceptViewThrough(Boolean acceptViewThrough) {
        this.acceptViewThrough = acceptViewThrough;
    }

    public Integer getClickWindow() {
        return clickWindow;
    }

    public void setClickWindow(Integer clickWindow) {
        this.clickWindow = clickWindow;
    }

    public WindowUnitType getClickWindowUnitType() {
        return clickWindowUnitType;
    }

    public void setClickWindowUnitType(WindowUnitType clickWindowUnitType) {
        this.clickWindowUnitType = clickWindowUnitType;
    }

    public Integer getViewWindow() {
        return viewWindow;
    }

    public void setViewWindow(Integer viewWindow) {
        this.viewWindow = viewWindow;
    }

    public WindowUnitType getViewWindowUnitType() {
        return viewWindowUnitType;
    }

    public void setViewWindowUnitType(WindowUnitType viewWindowUnitType) {
        this.viewWindowUnitType = viewWindowUnitType;
    }

    public BigDecimal getViewBeaconValueDiscount() {
        return viewBeaconValueDiscount;
    }

    public void setViewBeaconValueDiscount(BigDecimal viewBeaconValueDiscount) {
        this.viewBeaconValueDiscount = viewBeaconValueDiscount;
    }

    public BigDecimal getBeaconValuePc() {
        return beaconValuePc;
    }

    public void setBeaconValuePc(BigDecimal beaconValuePc) {
        this.beaconValuePc = beaconValuePc;
    }

    @Override
    public String toString() {
        return "Conversion{" +
                "id=" + id +
                ", lineId=" + lineId +
                ", beaconId=" + beaconId +
                ", acceptViewThrough=" + acceptViewThrough +
                ", clickWindow=" + clickWindow +
                ", clickWindowUnitType=" + clickWindowUnitType +
                ", viewWindow=" + viewWindow +
                ", viewWindowUnitType=" + viewWindowUnitType +
                ", viewBeaconValueDiscount=" + viewBeaconValueDiscount +
                ", beaconValuePc=" + beaconValuePc +
                '}';
    }
}
