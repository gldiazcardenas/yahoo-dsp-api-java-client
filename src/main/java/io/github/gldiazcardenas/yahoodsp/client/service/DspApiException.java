package io.github.gldiazcardenas.yahoodsp.client.service;

import io.github.gldiazcardenas.yahoodsp.client.model.DspError;

import java.time.LocalDateTime;

/**
 * Common exception class throws by all API service methods.
 *
 * @author Gabriel Diaz, Aug 19th 2022.
 */
public final class DspApiException extends RuntimeException {

    private final DspError error;
    private final LocalDateTime timestamp;

    public DspApiException(DspError error) {
        this.error = error;
        this.timestamp = LocalDateTime.now();
    }

    public DspApiException(DspError error, LocalDateTime timestamp) {
        this.error = error;
        this.timestamp = timestamp;
    }

    public DspError getError() {
        return error;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

}
