package io.github.gldiazcardenas.yahoodsp.client.model;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
public enum ReportStatus {
    SUCCESS,
    FAILED,
    SUBMITTED,
    PROCESSING;

    public static ReportStatus fromId(String value) {
        for (ReportStatus type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }
}
