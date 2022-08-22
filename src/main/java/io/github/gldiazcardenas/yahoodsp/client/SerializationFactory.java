package io.github.gldiazcardenas.yahoodsp.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

class SerializationFactory {

    private final ObjectMapper objectMapper;

    SerializationFactory(SerializationConfig config) {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, config.isFailOnUnknownProperties());
        if (config.isIgnoreNullProperties()) {
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        }
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

}
