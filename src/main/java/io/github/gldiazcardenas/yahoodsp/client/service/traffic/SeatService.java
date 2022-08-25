package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Seats;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

/**
 * Seats related services.
 *
 * @author Gabriel Diaz, Aug 24th 2022.
 */
public interface SeatService {

    /**
     * @param auth The authentication needed for API call.
     * @return The seats the authenticated user has access to.
     * @throws DspApiException In case any problem with the API.
     */
    Seats getAll(Authentication auth) throws DspApiException;

}
