package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Dir;

import java.util.Arrays;
import java.util.List;

/**
 * @author Gabriel Diaz, Sep 22th 2022.
 */
public class CreativesFilter {

    private Long accountId;
    private String name;
    private List<String> creativeIds;
    private Boolean nonBriefGet;
    private String query;
    private Integer page;
    private Integer limit;
    private String sort;
    private Dir dir;

    public Long getAccountId() {
        return accountId;
    }

    public CreativesFilter setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreativesFilter setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getCreativeIds() {
        return creativeIds;
    }

    public CreativesFilter setCreativeIds(List<String> creativeIds) {
        this.creativeIds = creativeIds;
        return this;
    }

    public CreativesFilter setCreativeIds(String... creativeIds) {
        return setCreativeIds(Arrays.asList(creativeIds));
    }

    public Boolean getNonBriefGet() {
        return nonBriefGet;
    }

    public CreativesFilter setNonBriefGet(Boolean nonBriefGet) {
        this.nonBriefGet = nonBriefGet;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public CreativesFilter setQuery(String query) {
        this.query = query;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public CreativesFilter setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public CreativesFilter setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public CreativesFilter setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public Dir getDir() {
        return dir;
    }

    public CreativesFilter setDir(Dir dir) {
        this.dir = dir;
        return this;
    }
}
