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

import java.util.Objects;

class LineServiceImpl implements LineService {

    private final LineResource resource;

    LineServiceImpl(LineResource resource) {
        this.resource = resource;
    }

    @Override
    public LinesResponse getLines(Authentication auth, LinesFilter filter) throws DspApiException {
        Preconditions.requireNonNull(filter);
        Preconditions.requireNonNull(filter.getOrderId());
        return resource.getLines(auth.getAccessToken(),
                filter.getOrderId(),
                filter.getQuery(),
                filter.getPage(),
                filter.getLimit(),
                filter.getSort(),
                filter.getDir());
    }

    @Override
    public LineResponse getLine(Authentication auth, long lineId) throws DspApiException {
        return resource.getLine(auth.getAccessToken(), lineId);
    }

    @Override
    public LineResponse createLine(Authentication auth, Line line) throws DspApiException {
        Preconditions.requireNonNull(line);
        Preconditions.requireNonNull(line.getOrderId());
        return resource.createLine(auth.getAccessToken(), line);
    }

    @Override
    public LineResponse updateLine(Authentication auth, Line line) throws DspApiException {
        Preconditions.requireNonNull(line);
        Preconditions.requireNonNull(line.getId());
        return resource.updateLine(auth.getAccessToken(), line.getId(), line);
    }

    @Override
    public LineTargetingResponse getTargeting(Authentication auth, long lineId) throws DspApiException {
        return resource.getTargeting(auth.getAccessToken(), lineId);
    }

    @Override
    public LineTargetingResponse updateTargeting(Authentication auth, long lineId,
                                                 LineTargetingRequest targeting) throws DspApiException {
        return resource.updateTargeting(auth.getAccessToken(), lineId, targeting);
    }

    @Override
    public BidMultipliersResponse getBidMultipliers(Authentication auth, long lineId) throws DspApiException {
        return resource.getBidMultipliers(auth.getAccessToken(), lineId);
    }

    @Override
    public BidMultipliersResponse updateBidMultipliers(Authentication auth,
                                                       long lineId,
                                                       BidMultipliersRequest bidMultipliers) throws DspApiException {
        Objects.requireNonNull(bidMultipliers);
        return resource.updateBidMultipliers(auth.getAccessToken(), lineId, bidMultipliers);
    }

    @Override
    public BidMultiplierCapResponse getBidMultiplierCap(Authentication auth, long lineId) throws DspApiException {
        return resource.getBidMultiplierCap(auth.getAccessToken(), lineId);
    }

    @Override
    public void createBidMultiplierCap(Authentication auth, long lineId, BidMultiplierCap bidMultiplierCap) throws DspApiException {
        Preconditions.requireNonNull(bidMultiplierCap);
        Preconditions.requireNonNull(bidMultiplierCap.getMultiplierCap());
        resource.createBidMultiplierCap(auth.getAccessToken(), lineId, bidMultiplierCap);
    }

    @Override
    public void updateBidMultiplierCap(Authentication auth, long lineId, BidMultiplierCap bidMultiplierCap) throws DspApiException {
        Preconditions.requireNonNull(bidMultiplierCap);
        Preconditions.requireNonNull(bidMultiplierCap.getMultiplierCap());
        resource.updateBidMultiplierCap(auth.getAccessToken(), lineId, bidMultiplierCap);
    }

}
