package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.resource.AuthenticationResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.reporting.ExtReportingResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AccountGroupResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AdResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AdvertiserResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.AudienceResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.BeaconResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.CampaignResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.ContextualResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.CreativeResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.DOOHResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.DataDictionaryResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.DealResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.ExchangeResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.LineResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.NativeListResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.PackageResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.PixelResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.SeatResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.SiteListResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.TargetingResource;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.UserGroupResource;
import io.github.gldiazcardenas.yahoodsp.client.service.AuthenticationService;
import io.github.gldiazcardenas.yahoodsp.client.service.reporting.ExtReportingService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AccountGroupService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AdService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AdvertiserService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.AudienceService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.BeaconService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.BidMultiplierService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.CampaignService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.ContextualService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.CreativeService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.DOOHService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.DataDictionaryService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.DealService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.ExchangeService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.LineService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.NativeListService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.PackageService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.PixelService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.SeatService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.SiteListService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.TargetingService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.UserGroupService;

import java.time.Duration;

/**
 * Entry point to the Yahoo DSP API Client which allows to get access to the services.
 *
 * @author Gabriel Diaz, Aug 19th 2022.
 */
public final class DspApi {

    /**
     * Default authentication host: '<a href="https://id.b2b.yahooinc.com/identity/oauth2/">https://id.b2b.yahooinc.com/identity/oauth2/</a>'.
     */
    public static final String DEFAULT_AUTH_API_URL = "https://id.b2b.yahooinc.com/identity/oauth2/";

    /**
     * Default API host: '<a href="https://dspapi.admanagerplus.yahoo.com/traffic/">https://dspapi.admanagerplus.yahoo.com/traffic/</a>'.
     */
    public static final String DEFAULT_TRAFFIC_API_URL = "https://dspapi.admanagerplus.yahoo.com/traffic/";

    /**
     * Default API host: '<a href="http://api-sched-v3.admanagerplus.yahoo.com/yamplus_api/">http://api-sched-v3.admanagerplus.yahoo.com/yamplus_api/</a>'.
     */
    public static final String DEFAULT_REPORTING_API_URL = "http://api-sched-v3.admanagerplus.yahoo.com/yamplus_api/";

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

    private final CommunicationFactory factory;
    private final AuthenticationService authenticationService;
    private final AccountGroupService accountGroupService;
    private final AdService adService;
    private final AdvertiserService advertiserService;
    private final AudienceService audienceService;
    private final BeaconService beaconService;
    private final BidMultiplierService bidMultiplierService;
    private final CampaignService campaignService;
    private final ContextualService contextualService;
    private final CreativeService creativeService;
    private final DataDictionaryService dataDictionaryService;
    private final DealService dealService;
    private final DOOHService doohService;
    private final ExchangeService exchangeService;
    private final LineService lineService;
    private final PackageService packageService;
    private final PixelService pixelService;
    private final SiteListService siteListService;
    private final NativeListService nativeListService;
    private final SeatService seatService;
    private final TargetingService targetingService;
    private final UserGroupService userGroupService;
    private final ExtReportingService reportService;

    private DspApi(CommunicationFactory factory) {
        this.factory = factory;
        this.authenticationService = new AuthenticationServiceImpl(createAuthEndpoint(AuthenticationResource.class));
        this.accountGroupService = new AccountGroupServiceImpl(createTrafficEndpoint(AccountGroupResource.class));
        this.adService = new AdServiceImpl(createTrafficEndpoint(AdResource.class));
        this.advertiserService = new AdvertiserServiceImpl(createTrafficEndpoint(AdvertiserResource.class));
        this.audienceService = new AudienceServiceImpl(createTrafficEndpoint(AudienceResource.class));
        this.beaconService = new BeaconServiceImpl(createTrafficEndpoint(BeaconResource.class));

        this.campaignService = new CampaignServiceImpl(createTrafficEndpoint(CampaignResource.class));
        this.contextualService = new ContextualServiceImpl(createTrafficEndpoint(ContextualResource.class));
        this.creativeService = new CreativeServiceImpl(createTrafficEndpoint(CreativeResource.class));
        this.dataDictionaryService = new DataDictionaryServiceImpl(createTrafficEndpoint(DataDictionaryResource.class));
        this.dealService = new DealServiceImpl(createTrafficEndpoint(DealResource.class));
        this.doohService = new DOOHServiceImpl(createTrafficEndpoint(DOOHResource.class));
        this.exchangeService = new ExchangeServiceImpl(createTrafficEndpoint(ExchangeResource.class));
        LineResource lineResource = createTrafficEndpoint(LineResource.class);
        this.lineService = new LineServiceImpl(lineResource);
        this.bidMultiplierService = new BidMultiplierServiceImpl(lineResource);
        this.packageService = new PackageServiceImpl(createTrafficEndpoint(PackageResource.class));
        this.pixelService = new PixelServiceImpl(createTrafficEndpoint(PixelResource.class));
        this.siteListService = new SiteListServiceImpl(createTrafficEndpoint(SiteListResource.class));
        this.nativeListService = new NativeListServiceImpl(createTrafficEndpoint(NativeListResource.class));
        this.seatService = new SeatServiceImpl(createTrafficEndpoint(SeatResource.class));
        this.targetingService = new TargetingServiceImpl(createTrafficEndpoint(TargetingResource.class));
        this.userGroupService = new UserGroupServiceImpl(createTrafficEndpoint(UserGroupResource.class));
        this.reportService = new ExtReportingServiceImpl(createReportingEndpoint(ExtReportingResource.class));
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

    public NativeListService getNativeListService() {
        return nativeListService;
    }

    public TargetingService getTargetingService() {
        return targetingService;
    }

    public ExtReportingService getReportService() {
        return reportService;
    }

    public BeaconService getBeaconService() {
        return beaconService;
    }

    public DealService getDealService() {
        return dealService;
    }

    public PackageService getPackageService() {
        return packageService;
    }

    public PixelService getPixelService() {
        return pixelService;
    }

    public SiteListService getSiteListService() {
        return siteListService;
    }

    public ExchangeService getExchangeService() {
        return exchangeService;
    }

    public BidMultiplierService getBidMultiplierService() {
        return bidMultiplierService;
    }

    public DOOHService getDoohService() {
        return doohService;
    }

    public UserGroupService getUserGroupService() {
        return userGroupService;
    }

    public <T> T createAuthEndpoint(Class<T> clazz) {
        return factory.createAuthEndpoint(clazz);
    }

    public <T> T createTrafficEndpoint(Class<T> clazz) {
        return factory.createTrafficEndpoint(clazz);
    }

    public <T> T createReportingEndpoint(Class<T> clazz) {
        return factory.createReportingEndpoint(clazz);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private CommunicationConfig communicationConfig;
        private SerializationConfig serializationConfig;

        private Builder() {
            this.serializationConfig = SerializationConfig.builder().build();
            this.communicationConfig = CommunicationConfig.builder().build();
        }

        public Builder setCommunicationConfig(CommunicationConfig communicationConfig) {
            this.communicationConfig = Preconditions.requireNonNull(communicationConfig);
            return this;
        }

        public Builder withCommunicationConfig(CommunicationConfig.Builder communicationBuilder) {
            this.communicationConfig = Preconditions.requireNonNull(communicationBuilder).build();
            return this;
        }

        public Builder setSerializationConfig(SerializationConfig serializationConfig) {
            this.serializationConfig = Preconditions.requireNonNull(serializationConfig);
            return this;
        }

        public Builder withSerializationConfig(SerializationConfig.Builder serializationBuilder) {
            this.serializationConfig = Preconditions.requireNonNull(serializationBuilder).build();
            return this;
        }

        public DspApi build() {
            SerializationFactory serializationFactory = new SerializationFactory(serializationConfig);
            CommunicationFactory communicationFactory  = new CommunicationFactory(communicationConfig, serializationFactory.getObjectMapper());
            return new DspApi(communicationFactory);
        }

    }

}
