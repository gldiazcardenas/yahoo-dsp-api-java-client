package io.github.gldiazcardenas.yahoodsp.client;

public final class SerializationConfig {

    private final boolean ignoreNullProperties;
    private final boolean failOnUnknownProperties;

    SerializationConfig(boolean ignoreNullProperties,
                        boolean failOnUnknownProperties) {
        this.ignoreNullProperties = ignoreNullProperties;
        this.failOnUnknownProperties = failOnUnknownProperties;
    }

    public boolean isIgnoreNullProperties() {
        return ignoreNullProperties;
    }

    public boolean isFailOnUnknownProperties() {
        return failOnUnknownProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private boolean ignoreNullProperties;
        private boolean failOnUnknownProperties;

        Builder() {
            this.ignoreNullProperties = true;
        }

        public Builder setFailOnUnknownProperties(boolean failOnUnknownProperties) {
            this.failOnUnknownProperties = failOnUnknownProperties;
            return this;
        }

        public Builder setIgnoreNullProperties(boolean ignoreNullProperties) {
            this.ignoreNullProperties = ignoreNullProperties;
            return this;
        }

        public SerializationConfig build() {
            return new SerializationConfig(ignoreNullProperties, failOnUnknownProperties);
        }

    }

}
