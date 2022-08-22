package io.github.gldiazcardenas.yahoodsp.client;

import okhttp3.logging.HttpLoggingInterceptor;

import java.time.Duration;
import java.util.Objects;

final class CommunicationConfig {

    private static final HttpLoggingInterceptor.Logger DEFAULT_HTTP_LOGGER = s -> {
       // do nothing.
    };

    private final String trafficApiUrl;
    private final String authApiUrl;
    private final String reportApiUrl;
    private final String userAgent;
    private final Duration writeTimeout;
    private final Duration readTimeout;
    private final Duration connectTimeout;
    private final int maxIdleConnections;
    private final Duration connectionsTimeAlive;
    private final HttpLoggingInterceptor.Logger httpLogger;
    private final boolean debug;

    //CHECKSTYLE:OFF
    CommunicationConfig(String trafficApiUrl,
                        String authApiUrl,
                        String reportApiUrl,
                        String userAgent,
                        Duration writeTimeout,
                        Duration readTimeout,
                        Duration connectTimeout,
                        int maxIdleConnections,
                        Duration connectionsTimeAlive,
                        HttpLoggingInterceptor.Logger httpLogger,
                        boolean debug) {
        //CHECKSTYLE:ON

        this.trafficApiUrl = trafficApiUrl;
        this.authApiUrl = authApiUrl;
        this.reportApiUrl = reportApiUrl;
        this.userAgent = userAgent;
        this.writeTimeout = writeTimeout;
        this.readTimeout = readTimeout;
        this.connectTimeout = connectTimeout;
        this.maxIdleConnections = maxIdleConnections;
        this.connectionsTimeAlive = connectionsTimeAlive;
        this.httpLogger = httpLogger;
        this.debug = debug;
    }

    public String getTrafficApiUrl() {
        return trafficApiUrl;
    }

    public String getAuthApiUrl() {
        return authApiUrl;
    }

    public String getReportApiUrl() {
        return reportApiUrl;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public Duration getWriteTimeout() {
        return writeTimeout;
    }

    public Duration getReadTimeout() {
        return readTimeout;
    }

    public Duration getConnectTimeout() {
        return connectTimeout;
    }

    public int getMaxIdleConnections() {
        return maxIdleConnections;
    }

    public Duration getConnectionsTimeAlive() {
        return connectionsTimeAlive;
    }

    public HttpLoggingInterceptor.Logger getHttpLogger() {
        return httpLogger;
    }

    public boolean isDebug() {
        return debug;
    }

    public static class Builder {

        private String trafficApiUrl;
        private String authApiUrl;
        private String reportingApiUrl;
        private String userAgent;
        private Duration writeTimeout;
        private Duration readTimeout;
        private Duration connectTimeout;
        private int maxIdleConnections;
        private Duration connectionsTimeAlive;
        private HttpLoggingInterceptor.Logger httpLogger;
        private boolean debug;

        Builder() {
            this.trafficApiUrl = DspApi.DEFAULT_TRAFFIC_API_URL;
            this.authApiUrl = DspApi.DEFAULT_AUTH_API_URL;
            this.reportingApiUrl = DspApi.DEFAULT_REPORTING_API_URL;
            this.userAgent = DspApi.DEFAULT_USER_AGENT;
            this.writeTimeout = DspApi.DEFAULT_WRITE_TIMEOUT;
            this.readTimeout = DspApi.DEFAULT_READ_TIMEOUT;
            this.connectTimeout = DspApi.DEFAULT_CONNECT_TIMEOUT;
            this.maxIdleConnections = DspApi.DEFAULT_MAX_IDLE_CONNECTIONS;
            this.connectionsTimeAlive = DspApi.DEFAULT_CONNECTIONS_TIME_ALIVE;
            this.httpLogger = DEFAULT_HTTP_LOGGER;
        }

        public Builder setTrafficApiUrl(String trafficApiUrl) {
            this.trafficApiUrl = trafficApiUrl;
            return this;
        }

        public Builder setAuthApiUrl(String authApiUrl) {
            this.authApiUrl = authApiUrl;
            return this;
        }

        public Builder setReportingApiUrl(String reportingApiUrl) {
            this.reportingApiUrl = reportingApiUrl;
            return this;
        }

        public Builder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        public Builder setWriteTimeout(Duration writeTimeout) {
            this.writeTimeout = Objects.requireNonNull(writeTimeout);
            return this;
        }

        public Builder setReadTimeout(Duration readTimeout) {
            this.readTimeout = Objects.requireNonNull(readTimeout);
            return this;
        }

        public Builder setConnectTimeout(Duration connectTimeout) {
            this.connectTimeout = Objects.requireNonNull(connectTimeout);
            return this;
        }

        public Builder setMaxIdleConnections(int maxIdleConnections) {
            this.maxIdleConnections = maxIdleConnections;
            return this;
        }

        public Builder setConnectionsTimeAlive(Duration connectionsTimeAlive) {
            this.connectionsTimeAlive = Objects.requireNonNull(connectionsTimeAlive);
            return this;
        }

        public Builder setHttpLogger(HttpLoggingInterceptor.Logger httpLogger) {
            this.httpLogger = Objects.requireNonNull(httpLogger);
            return this;
        }

        public Builder enableDebug() {
            this.debug = true;
            return this;
        }

        public CommunicationConfig build() {
            return new CommunicationConfig(trafficApiUrl, authApiUrl, reportingApiUrl, userAgent, writeTimeout,
                    readTimeout, connectTimeout, maxIdleConnections, connectionsTimeAlive, httpLogger, debug);
        }
    }
}
