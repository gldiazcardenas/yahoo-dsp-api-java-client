package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Dir;

/**
 * @author Gabriel Diaz, Sep 21th 2022.
 */
public class AdsFilter {

    private Long lineId;
    private String query;
    private Integer page;
    private Integer limit;
    private String sort;
    private Dir dir;

    public Long getLineId() {
        return lineId;
    }

    public AdsFilter setLineId(Long lineId) {
        this.lineId = lineId;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public AdsFilter setQuery(String query) {
        this.query = query;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public AdsFilter setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public AdsFilter setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public AdsFilter setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public Dir getDir() {
        return dir;
    }

    public AdsFilter setDir(Dir dir) {
        this.dir = dir;
        return this;
    }
}
