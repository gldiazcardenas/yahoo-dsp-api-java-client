package io.github.gldiazcardenas.yahoodsp.client.model;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
public enum ReportStatus {
    Success,
    Failed,
    Submitted,
    Processing;

    public static ReportStatus fromValue(String value) {
        for (ReportStatus type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }
}
