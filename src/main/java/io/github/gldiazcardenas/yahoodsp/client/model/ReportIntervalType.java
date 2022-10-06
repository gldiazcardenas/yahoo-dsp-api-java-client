package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
public enum ReportIntervalType {

    CUMULATIVE(1),
    DAY(2),
    MONTH(3),
    WEEK(4),
    HOUR(5);

    private final int id;

    ReportIntervalType(int id) {
        this.id = id;
    }

    @JsonValue
    public int getId() {
        return id;
    }

    @JsonCreator
    public static ReportIntervalType fromId(int id) {
        for (ReportIntervalType type : values()) {
            if (type.id == id) {
                return type;
            }
        }
        throw new UnsupportedOperationException("intervalTypeId not supported: " + id);
    }

}
