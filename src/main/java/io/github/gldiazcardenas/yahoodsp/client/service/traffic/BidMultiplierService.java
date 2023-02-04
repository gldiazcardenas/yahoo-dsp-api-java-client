package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultiplierCap;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultiplierCapResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultipliersRequest;
import io.github.gldiazcardenas.yahoodsp.client.model.BidMultipliersResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

/**
 * @author Gabriel Diaz, Sep 25th 2022.
 */
@Deprecated
public interface BidMultiplierService {

    BidMultipliersResponse getBidMultipliers(Authentication auth, long lineId) throws DspApiException;

    BidMultipliersResponse updateBidMultipliers(Authentication auth, long lineId,
                                                BidMultipliersRequest bidMultipliers) throws DspApiException;


    BidMultiplierCapResponse getBidMultiplierCap(Authentication auth, long lineId) throws DspApiException;

    void createBidMultiplierCap(Authentication auth, long lineId,
                                BidMultiplierCap bidMultiplierCap) throws DspApiException;

    void updateBidMultiplierCap(Authentication auth, long lineId,
                                BidMultiplierCap bidMultiplierCap) throws DspApiException;

}
