package io.github.gldiazcardenas.yahoodsp.client.service.traffic;

import io.github.gldiazcardenas.yahoodsp.client.model.Dir;

/**
 * @author Gabriel Diaz, Sep 19th 2022.
 */
public class GeosFilter {

    private String query;
    private String countryCode;
    private String sort;
    private Dir dir;

    public String getQuery() {
        return query;
    }

    public GeosFilter setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public GeosFilter setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public GeosFilter setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public Dir getDir() {
        return dir;
    }

    public GeosFilter setDir(Dir dir) {
        this.dir = dir;
        return this;
    }

    public static GeosFilter zipCodes(String countryCode, String query) {
        return new GeosFilter()
                .setCountryCode(countryCode)
                .setQuery(query);
    }

    public static GeosFilter byName(String query) {
        return new GeosFilter()
                .setQuery(query);
    }

}
