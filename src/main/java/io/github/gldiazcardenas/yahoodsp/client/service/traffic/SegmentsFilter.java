package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.SegmentType;

import java.util.Arrays;
import java.util.List;

/**
 * @author Gabriel Diaz, Sep 19th 2022.
 */
public class SegmentsFilter {

    private Long accountId;
    private String query;
    private List<String> countryCodes;
    private Long lineId;
    private Integer limit;
    private Integer page;
    private SegmentType type;
    private Integer minAudienceSize;
    private String maxAudienceSize;

    public Long getAccountId() {
        return accountId;
    }

    public SegmentsFilter setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public SegmentsFilter setQuery(String query) {
        this.query = query;
        return this;
    }

    public List<String> getCountryCodes() {
        return countryCodes;
    }

    public SegmentsFilter setCountryCodes(String... countryCodes) {
        this.countryCodes = Arrays.asList(countryCodes);
        return this;
    }

    public SegmentsFilter setCountryCodes(List<String> countryCodes) {
        this.countryCodes = countryCodes;
        return this;
    }

    public Long getLineId() {
        return lineId;
    }

    public SegmentsFilter setLineId(Long lineId) {
        this.lineId = lineId;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public SegmentsFilter setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public SegmentsFilter setPage(Integer page) {
        this.page = page;
        return this;
    }

    public SegmentType getType() {
        return type;
    }

    public SegmentsFilter setType(SegmentType type) {
        this.type = type;
        return this;
    }

    public Integer getMinAudienceSize() {
        return minAudienceSize;
    }

    public SegmentsFilter setMinAudienceSize(Integer minAudienceSize) {
        this.minAudienceSize = minAudienceSize;
        return this;
    }

    public String getMaxAudienceSize() {
        return maxAudienceSize;
    }

    public SegmentsFilter setMaxAudienceSize(String maxAudienceSize) {
        this.maxAudienceSize = maxAudienceSize;
        return this;
    }
}
