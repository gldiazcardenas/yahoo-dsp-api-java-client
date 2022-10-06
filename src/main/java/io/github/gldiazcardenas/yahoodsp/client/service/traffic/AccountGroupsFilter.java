package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Dir;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
public class AccountGroupsFilter {

    private String query;
    private String sort;
    private Dir dir;

    public String getQuery() {
        return query;
    }

    public AccountGroupsFilter setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public AccountGroupsFilter setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public Dir getDir() {
        return dir;
    }

    public AccountGroupsFilter setDir(Dir dir) {
        this.dir = dir;
        return this;
    }

}
