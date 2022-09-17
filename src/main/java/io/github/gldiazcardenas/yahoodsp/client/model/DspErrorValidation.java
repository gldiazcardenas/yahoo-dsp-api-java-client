package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Yahoo DSP Error Validation.
 *
 * @author Gabriel Diaz, Aug 19th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DspErrorValidation {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("message")
    private String message;
    @JsonProperty("propertyName")
    private String propertyName;
    @JsonProperty("key")
    private String key;
    @JsonProperty("objectName")
    private String objectName;

    public Long getId() {
        return id;
    }

    public DspErrorValidation setId(Long id) {
        this.id = id;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DspErrorValidation setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public DspErrorValidation setPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    public String getKey() {
        return key;
    }

    public DspErrorValidation setKey(String key) {
        this.key = key;
        return this;
    }

    public String getObjectName() {
        return objectName;
    }

    public DspErrorValidation setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    @Override
    public String toString() {
        return "DspErrorValidation{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", propertyName='" + propertyName + '\'' +
                ", key='" + key + '\'' +
                ", objectName='" + objectName + '\'' +
                '}';
    }
}
