package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Dir;

/**
 * @author Gabriel Diaz, Sep 21th 2022.
 */
public class BeaconsFilter {

    private Long accountId;
    private String query;
    private Integer page;
    private Integer limit;
    private String sort;
    private Dir dir;

    public Long getAccountId() {
        return accountId;
    }

    public BeaconsFilter setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public BeaconsFilter setQuery(String query) {
        this.query = query;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public BeaconsFilter setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public BeaconsFilter setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public BeaconsFilter setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public Dir getDir() {
        return dir;
    }

    public BeaconsFilter setDir(Dir dir) {
        this.dir = dir;
        return this;
    }
}
