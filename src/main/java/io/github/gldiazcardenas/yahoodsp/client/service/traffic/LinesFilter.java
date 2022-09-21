package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Dir;

/**
 * @author Gabriel Diaz, Sep 21th 2022.
 */
public class LinesFilter {

    private Long orderId;
    private String query;
    private Integer page;
    private Integer limit;
    private String sort;
    private Dir dir;

    public Long getOrderId() {
        return orderId;
    }

    public LinesFilter setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public LinesFilter setQuery(String query) {
        this.query = query;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public LinesFilter setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public LinesFilter setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public LinesFilter setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public Dir getDir() {
        return dir;
    }

    public LinesFilter setDir(Dir dir) {
        this.dir = dir;
        return this;
    }
}
