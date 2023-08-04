package io.github.gldiazcardenas.yahoodsp.client.service;

import io.github.gldiazcardenas.yahoodsp.client.model.DspErrorValidation;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * Object that holds the information about the error happened.
 *
 * @author Gabriel Diaz, Aug 24th 2022.
 */
public class DspApiError {

    private int statusCode;
    private String message;
    private String method;
    private String path;
    private Instant timestamp;
    private List<DspErrorValidation> validations;

    public DspApiError() {
        super();
    }

    public DspApiError(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public List<DspErrorValidation> getValidations() {
        return validations;
    }

    public void setValidations(List<DspErrorValidation> validations) {
        this.validations = validations;
    }

    public void addValidation(DspErrorValidation validation) {
        if (this.validations == null) {
            this.validations = new ArrayList<>();
        }
        this.validations.add(validation);
    }

    public void addValidation(String msg) {
        DspErrorValidation validation = new DspErrorValidation();
        validation.setMessage(msg);
        addValidation(validation);
    }

    @Override
    public String toString() {
        return "DspApiError{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", method='" + method + '\'' +
                ", path='" + path + '\'' +
                ", timestamp=" + timestamp +
                ", validations=" + validations +
                '}';
    }
}
