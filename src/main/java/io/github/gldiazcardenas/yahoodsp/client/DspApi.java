package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.AuthenticationResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.reporting.ExtReportResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AccountGroupResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AdResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AdvertiserResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AudienceResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.CampaignResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.ContextualResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.CreativeResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.DataDictionaryResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.LineResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.SeatResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.TargetingResource;
import io.github.gldiazcardenas.yahoodsp.client.service.AuthenticationService;
import io.github.gldiazcardenas.yahoodsp.client.service.reporting.ExtReportService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AccountGroupService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AdService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AdvertiserService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AudienceService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.CampaignService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.ContextualService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.CreativeService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.DataDictionaryService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.LineService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.SeatService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.TargetingService;

import java.time.Duration;
import java.util.Objects;

/**
 * Entry point to the Yahoo DSP API Client which allows to get access to the services.
 *
 * @author Gabriel Diaz, Aug 19th 2022.
 */
public final class DspApi {

    /**
     * Default API host: '<a href="https://dspapi.admanagerplus.yahoo.com/">https://dspapi.admanagerplus.yahoo.com/traffic</a>'.
     */
    public static final String DEFAULT_TRAFFIC_API_URL = "https://dspapi.admanagerplus.yahoo.com/traffic";

    /**
     * Default API host: '<a href="http://api-sched-v3.admanagerplus.yahoo.com/yamplus_api/extreport">http://api-sched-v3.admanagerplus.yahoo.com/yamplus_api/extreport</a>'.
     */
    public static final String DEFAULT_REPORTING_API_URL = "http://api-sched-v3.admanagerplus.yahoo.com/yamplus_api/extreport";

    /**
     * Default authentication host: '<a href="https://id.b2b.yahooinc.com/identity/oauth2/">https://id.b2b.yahooinc.com/identity/oauth2/</a>'.
     */
    public static final String DEFAULT_AUTH_API_URL = "https://id.b2b.yahooinc.com/identity/oauth2";

    /**
     * Default user agent: 'Yahoo DSP API Java Client'.
     */
    public static final String DEFAULT_USER_AGENT = "Yahoo DSP API Java Client";

    /**
     * 2 Minutes write timeout. For transporting/writing requests.
     */
    public static final Duration DEFAULT_WRITE_TIMEOUT = Duration.ofMinutes(2);

    /**
     * 2 Minutes read timeout. For transporting/reading responses.
     */
    public static final Duration DEFAULT_READ_TIMEOUT = Duration.ofMinutes(2);

    /**
     * 2 Minutes connect timeout. For reaching to the server.
     */
    public static final Duration DEFAULT_CONNECT_TIMEOUT = Duration.ofMinutes(2);

    /**
     * 5 default idle connections.
     */
    public static final int DEFAULT_MAX_IDLE_CONNECTIONS = 5;

    /**
     * 5 minutes of time alive for connections.
     */
    public static final Duration DEFAULT_CONNECTIONS_TIME_ALIVE = Duration.ofMinutes(5);

    private final AuthenticationService authenticationService;
    private final AccountGroupService accountGroupService;
    private final AdService adService;
    private final AdvertiserService advertiserService;
    private final AudienceService audienceService;
    private final CampaignService campaignService;
    private final ContextualService contextualService;
    private final CreativeService creativeService;
    private final DataDictionaryService dataDictionaryService;
    private final LineService lineService;
    private final SeatService seatService;
    private final TargetingService targetingService;
    private final ExtReportService reportService;

    private DspApi(CommunicationFactory factory) {
        this.authenticationService = new AuthenticationServiceImpl(factory.createAuthEndpoint(AuthenticationResource.class));
        this.accountGroupService = new AccountGroupServiceImpl(factory.createTrafficEndpoint(AccountGroupResource.class));
        this.adService = new AdServiceImpl(factory.createTrafficEndpoint(AdResource.class));
        this.advertiserService = new AdvertiserServiceImpl(factory.createTrafficEndpoint(AdvertiserResource.class));
        this.audienceService = new AudienceServiceImpl(factory.createTrafficEndpoint(AudienceResource.class));
        this.campaignService = new CampaignServiceImpl(factory.createTrafficEndpoint(CampaignResource.class));
        this.contextualService = new ContextualServiceImpl(factory.createTrafficEndpoint(ContextualResource.class));
        this.creativeService = new CreativeServiceImpl(factory.createTrafficEndpoint(CreativeResource.class));
        this.dataDictionaryService = new DataDictionaryServiceImpl(factory.createTrafficEndpoint(DataDictionaryResource.class));
        this.lineService = new LineServiceImpl(factory.createTrafficEndpoint(LineResource.class));
        this.seatService = new SeatServiceImpl(factory.createTrafficEndpoint(SeatResource.class));
        this.targetingService = new TargetingServiceImpl(factory.createTrafficEndpoint(TargetingResource.class));
        this.reportService = new ExtReportServiceImpl(factory.createReportEndpoint(ExtReportResource.class));
    }

    public AuthenticationService getAuthenticationService() {
        return authenticationService;
    }

    public AccountGroupService getAccountGroupService() {
        return accountGroupService;
    }

    public AdService getAdService() {
        return adService;
    }

    public AdvertiserService getAdvertiserService() {
        return advertiserService;
    }

    public AudienceService getAudienceService() {
        return audienceService;
    }

    public CampaignService getCampaignService() {
        return campaignService;
    }

    public ContextualService getContextualService() {
        return contextualService;
    }

    public CreativeService getCreativeService() {
        return creativeService;
    }

    public DataDictionaryService getDataDictionaryService() {
        return dataDictionaryService;
    }

    public LineService getLineService() {
        return lineService;
    }

    public SeatService getSeatService() {
        return seatService;
    }

    public TargetingService getTargetingService() {
        return targetingService;
    }

    public ExtReportService getReportService() {
        return reportService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private CommunicationConfig communicationConfig;
        private SerializationConfig serializationConfig;

        private Builder() {
            super();
        }

        public Builder setCommunicationConfig(CommunicationConfig communicationConfig) {
            this.communicationConfig = communicationConfig;
            return this;
        }

        public Builder withCommunicationConfig(CommunicationConfig.Builder communicationBuilder) {
            this.communicationConfig = communicationBuilder.build();
            return this;
        }

        public Builder setSerializationConfig(SerializationConfig serializationConfig) {
            this.serializationConfig = serializationConfig;
            return this;
        }

        public Builder withSerializationConfig(SerializationConfig.Builder serializationBuilder) {
            this.serializationConfig = serializationBuilder.build();
            return this;
        }

        public DspApi build() {
            Objects.requireNonNull(communicationConfig);
            Objects.requireNonNull(serializationConfig);

            SerializationFactory serializationFactory = new SerializationFactory(serializationConfig);
            CommunicationFactory communicationFactory  = new CommunicationFactory(communicationConfig, serializationFactory);

            return new DspApi(communicationFactory);
        }

    }

}
