package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

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
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

public interface LineService {

    LinesResponse getLines(Authentication auth, LinesFilter filter) throws DspApiException;

    LineResponse getLine(Authentication auth, long lineId) throws DspApiException;

    LineResponse createLine(Authentication auth, Line line) throws DspApiException;

    LineResponse updateLine(Authentication auth, Line line) throws DspApiException;

    LineTargetingResponse getTargeting(Authentication auth, long lineId) throws DspApiException;

    LineTargetingResponse updateTargeting(Authentication auth, long lineId, LineTargetingRequest targeting) throws DspApiException;

    BidMultipliersResponse getBidMultipliers(Authentication auth, long lineId) throws DspApiException;

    BidMultipliersResponse updateBidMultipliers(Authentication auth, long lineId,
                                                BidMultipliersRequest bidMultipliers) throws DspApiException;


    BidMultiplierCapResponse getBidMultiplierCap(Authentication auth, long lineId) throws DspApiException;

    void createBidMultiplierCap(Authentication auth, long lineId,
                                BidMultiplierCap bidMultiplierCap) throws DspApiException;

    void updateBidMultiplierCap(Authentication auth, long lineId,
                                BidMultiplierCap bidMultiplierCap) throws DspApiException;

}
