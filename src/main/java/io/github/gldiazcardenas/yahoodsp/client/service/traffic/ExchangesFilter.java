package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Dir;

/**
 * @author Gabriel Diaz, Sep 19th 2022.
 */
public class ExchangesFilter {

    private String query;
    private Integer page;
    private Integer limit;
    private String sort;
    private Dir dir;

    public String getQuery() {
        return query;
    }

    public ExchangesFilter setQuery(String query) {
        this.query = query;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public ExchangesFilter setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public ExchangesFilter setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public ExchangesFilter setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public Dir getDir() {
        return dir;
    }

    public ExchangesFilter setDir(Dir dir) {
        this.dir = dir;
        return this;
    }
}
