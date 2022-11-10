package io.github.gldiazcardenas.yahoodsp.client.model;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
public enum ReportHavingOperator {
    and,
    equalTo,
    greaterThan,
    or,
    lessThan,
    not;

    public static ReportHavingOperator fromValue(String value) {
        for (ReportHavingOperator type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        throw new UnsupportedOperationException("Unmapped value: " + value);
    }
}
