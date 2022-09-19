package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.GeosResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.SegmentsResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

public interface TargetingService {

    GeosResponse getGeos(Authentication auth, GeosFilter filter) throws DspApiException;

    GeosResponse getCountries(Authentication auth, String query) throws DspApiException;

    SegmentsResponse getAvailableSegments(Authentication auth, SegmentsFilter filter) throws DspApiException;

}
