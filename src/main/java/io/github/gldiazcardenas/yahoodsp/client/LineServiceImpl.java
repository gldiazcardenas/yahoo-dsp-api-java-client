package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;
import io.github.gldiazcardenas.yahoodsp.client.model.Line;
import io.github.gldiazcardenas.yahoodsp.client.model.LineResponse;
import io.github.gldiazcardenas.yahoodsp.client.model.LinesResponse;
import io.github.gldiazcardenas.yahoodsp.client.resource.traffic.LineResource;
import io.github.gldiazcardenas.yahoodsp.client.service.DspApiException;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.LineService;
import io.github.gldiazcardenas.yahoodsp.client.service.traffic.LinesFilter;

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
}
