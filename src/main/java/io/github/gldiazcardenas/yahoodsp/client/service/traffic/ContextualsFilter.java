package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

/**
 * @author Gabriel Diaz, Sep 16th 2022.
 */
public class ContextualsFilter {

    public enum Dir {
        ASC,
        DESC
    }

    private Long seatId;
    private Long accountId;
    private String query;
    private Integer page;
    private Integer limit;
    private String sort;
    private Dir dir;

    public Long getSeatId() {
        return seatId;
    }

    public ContextualsFilter setSeatId(Long seatId) {
        this.seatId = seatId;
        return this;
    }

    public Long getAccountId() {
        return accountId;
    }

    public ContextualsFilter setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public ContextualsFilter setQuery(String query) {
        this.query = query;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public ContextualsFilter setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public ContextualsFilter setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public ContextualsFilter setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public Dir getDir() {
        return dir;
    }

    public ContextualsFilter setDir(Dir dir) {
        this.dir = dir;
        return this;
    }

}
