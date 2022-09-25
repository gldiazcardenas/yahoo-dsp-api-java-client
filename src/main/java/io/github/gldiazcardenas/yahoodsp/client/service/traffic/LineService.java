package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
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

}
