package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.GeosResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.SegmentsResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.TargetingResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.GeosFilter;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.SegmentsFilter;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.TargetingService;

import java.util.Optional;

class TargetingServiceImpl implements TargetingService {

    private final TargetingResource resource;

    TargetingServiceImpl(TargetingResource resource) {
        this.resource = resource;
    }

    @Override
    public GeosResponse getGeos(Authentication auth, GeosFilter filter) throws DspApiException {
        Preconditions.requireNonNull(filter);
        Preconditions.requireNonNull(filter.getQuery());
        return resource.getGeos(auth.getAccessToken(),
                filter.getQuery(),
                filter.getCountryCode(),
                filter.getSort(),
                Optional.ofNullable(filter.getDir()).map(Enum::name).orElse(null));
    }

    @Override
    public GeosResponse getCountries(Authentication auth, String query) throws DspApiException {
        return resource.getCountries(auth.getAccessToken(), query);
    }

    @Override
    public SegmentsResponse getAvailableSegments(Authentication auth, SegmentsFilter filter) throws DspApiException {
        Preconditions.requireNonNull(filter);
        Preconditions.requireNonNull(filter.getAccountId());
        Preconditions.requireNonNull(filter.getQuery());
        return resource.getAvailableSegments(
                auth.getAccessToken(),
                filter.getAccountId(),
                filter.getQuery(),
                Optional.ofNullable(filter.getCountryCodes()).map(c -> String.join(",", c)).orElse(null),
                filter.getLineId(),
                filter.getLimit(),
                filter.getPage(),
                filter.getType(),
                filter.getMinAudienceSize(),
                filter.getMaxAudienceSize());
    }

}
