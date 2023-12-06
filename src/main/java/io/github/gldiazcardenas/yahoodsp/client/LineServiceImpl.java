package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultiplierCap;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultiplierCapResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultipliersRequest;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultipliersResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.Line;
import io.github.gldiazcardenas.yahoodsp.client.model.LineResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.LineTargetingRequest;
import io.github.gldiazcardenas.yahoodsp.client.model.LineTargetingResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.LinesResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.LineResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.LineService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.LinesFilter;

import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.accessToken;
import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.requireNonNull;

class LineServiceImpl implements LineService {

    private final LineResource resource;

    LineServiceImpl(LineResource resource) {
        this.resource = resource;
    }

    @Override
    public LinesResponse getLines(Authentication auth, LinesFilter filter) throws DspApiException {
        requireNonNull(filter);
        requireNonNull(filter.getOrderId());
        return resource.getLines(accessToken(auth),
                filter.getOrderId(),
                filter.getQuery(),
                filter.getPage(),
                filter.getLimit(),
                filter.getSort(),
                filter.getDir());
    }

    @Override
    public LineResponse getLine(Authentication auth, long lineId) throws DspApiException {
        return resource.getLine(accessToken(auth), lineId);
    }

    @Override
    public LineResponse createLine(Authentication auth, Line line) throws DspApiException {
        requireNonNull(line);
        requireNonNull(line.getOrderId());
        return resource.createLine(accessToken(auth), line);
    }

    @Override
    public LineResponse updateLine(Authentication auth, Line line) throws DspApiException {
        requireNonNull(line);
        requireNonNull(line.getId());
        return resource.updateLine(accessToken(auth), line.getId(), line);
    }

    @Override
    public LineTargetingResponse getTargeting(Authentication auth, long lineId) throws DspApiException {
        return resource.getTargeting(accessToken(auth), lineId);
    }

    @Override
    public LineTargetingResponse updateTargeting(Authentication auth,
                                                 long lineId,
                                                 LineTargetingRequest targeting) throws DspApiException {
        requireNonNull(targeting);
        return resource.updateTargeting(accessToken(auth), lineId, targeting);
    }

    @Override
    public BidMultipliersResponse getBidMultipliers(Authentication auth, long lineId) throws DspApiException {
        return resource.getBidMultipliers(accessToken(auth), lineId);
    }

    @Override
    public BidMultipliersResponse updateBidMultipliers(Authentication auth,
                                                       long lineId,
                                                       BidMultipliersRequest bidMultipliers) throws DspApiException {
        requireNonNull(bidMultipliers);
        return resource.updateBidMultipliers(accessToken(auth), lineId, bidMultipliers);
    }

    @Override
    public BidMultiplierCapResponse getBidMultiplierCap(Authentication auth, long lineId) throws DspApiException {
        return resource.getBidMultiplierCap(accessToken(auth), lineId);
    }

    @Override
    public void createBidMultiplierCap(Authentication auth, long lineId, BidMultiplierCap bidMultiplierCap) throws DspApiException {
        requireNonNull(bidMultiplierCap);
        requireNonNull(bidMultiplierCap.getMultiplierCap());
        resource.createBidMultiplierCap(accessToken(auth), lineId, bidMultiplierCap);
    }

    @Override
    public void updateBidMultiplierCap(Authentication auth, long lineId, BidMultiplierCap bidMultiplierCap) throws DspApiException {
        requireNonNull(bidMultiplierCap);
        requireNonNull(bidMultiplierCap.getMultiplierCap());
        resource.updateBidMultiplierCap(accessToken(auth), lineId, bidMultiplierCap);
    }

}
