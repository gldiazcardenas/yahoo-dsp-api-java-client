package io.github.gldiazcardenas.yahoodsp.client.model;

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

    public int getId() {
        return id;
    }

    public static ReportIntervalType fromId(Integer id) {
        if (id != null) {
            for (ReportIntervalType type : values()) {
                if (type.id == id) {
                    return type;
                }
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + id);
    }

}
