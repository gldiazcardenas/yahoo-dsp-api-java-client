package io.github.gldiazcardenas.yahoodsp.client.model;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
public enum ReportDateType {

    TODAY(1),
    YESTERDAY(2),
    THIS_WEEK(3),
    LAST_7_DAYS(4),
    LAST_WEEK(5),
    LAST_14_DAYS(6),
    MONTH_TO_DATE(7),
    LAST_30_DAYS(8),
    LAST_MONTH(9),
    ALL_TIME(10),
    CUSTOM(11);

    private final int id;

    ReportDateType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static ReportDateType fromId(Integer id) {
        if (id != null) {
            for (ReportDateType type : values()) {
                if (type.id == id) {
                    return type;
                }
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + id);
    }

}
