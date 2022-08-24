package io.github.gldiazcardenas.yahoodsp.client.service;

/**
 * Common exception class throws by all API service methods.
 *
 * @author Gabriel Diaz, Aug 19th 2022.
 */
public final class DspApiException extends RuntimeException {

    private final DspApiError error;

    public DspApiException(Throwable cause) {
        super(cause);
        this.error = new DspApiError(cause.getLocalizedMessage());
    }

    public DspApiException(DspApiError error) {
        super(error.toString());
        this.error = error;
    }

    public DspApiError getError() {
        return error;
    }

}
