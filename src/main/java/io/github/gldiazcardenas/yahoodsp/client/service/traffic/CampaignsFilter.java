package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Dir;

/**
 * @author Gabriel Diaz, Sep 21th 2022.
 */
public class CampaignsFilter {

    private Long accountId;
    private String query;
    private Integer page;
    private Integer limit;
    private String sort;
    private Dir dir;

    public Long getAccountId() {
        return accountId;
    }

    public CampaignsFilter setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public CampaignsFilter setQuery(String query) {
        this.query = query;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public CampaignsFilter setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public CampaignsFilter setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public CampaignsFilter setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public Dir getDir() {
        return dir;
    }

    public CampaignsFilter setDir(Dir dir) {
        this.dir = dir;
        return this;
    }
}
