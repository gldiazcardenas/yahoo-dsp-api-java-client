package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Pixel;
import io.github.gldiazcardenas.yahoodsp.client.model.PixelResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.PixelsResponse;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
public interface PixelService {

    PixelsResponse getPixels(Authentication auth, BeaconsFilter filter) throws DspApiException;

    PixelResponse getPixel(Authentication auth, long pixelId, long accountId) throws DspApiException;

    PixelResponse createPixel(Authentication auth, Pixel pixel) throws DspApiException;

}
