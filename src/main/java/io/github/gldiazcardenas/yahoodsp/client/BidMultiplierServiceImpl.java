package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultiplierCap;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultiplierCapResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultipliersRequest;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultipliersResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.BidMultiplierResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.BidMultiplierService;

import java.util.Objects;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
class BidMultiplierServiceImpl implements BidMultiplierService {

    private final BidMultiplierResource resource;

    BidMultiplierServiceImpl(BidMultiplierResource resource) {
        this.resource = resource;
    }

    @Override
    public BidMultipliersResponse getBidMultipliers(Authentication auth, long lineId) throws DspApiException {
        return resource.getBidMultipliers(auth.getAccessToken(), lineId);
    }

    @Override
    public BidMultipliersResponse updateBidMultipliers(Authentication auth, long lineId,
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
