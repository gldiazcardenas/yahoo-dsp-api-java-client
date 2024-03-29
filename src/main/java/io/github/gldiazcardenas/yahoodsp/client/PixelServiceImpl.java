package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Pixel;
import io.github.gldiazcardenas.yahoodsp.client.model.PixelResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.PixelsResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.PixelResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.BeaconsFilter;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.PixelService;

import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.accessToken;
import static io.github.gldiazcardenas.yahoodsp.client.Preconditions.requireNonNull;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
class PixelServiceImpl implements PixelService {

    private final PixelResource resource;

    PixelServiceImpl(PixelResource resource) {
        this.resource = resource;
    }

    @Override
    public PixelsResponse getPixels(Authentication auth, BeaconsFilter filter) throws DspApiException {
        requireNonNull(filter);
        requireNonNull(filter.getAccountId());
        return resource.getPixels(accessToken(auth),
                filter.getAccountId(),
                filter.getQuery(),
                filter.getPage(),
                filter.getLimit(),
                filter.getSort(),
                filter.getDir());
    }

    @Override
    public PixelResponse getPixel(Authentication auth, long pixelId, long accountId) throws DspApiException {
        return resource.getPixel(accessToken(auth), pixelId, accountId);
    }

    @Override
    public PixelResponse createPixel(Authentication auth, Pixel pixel) throws DspApiException {
        requireNonNull(pixel);
        return resource.createPixel(accessToken(auth), pixel);
    }
}
