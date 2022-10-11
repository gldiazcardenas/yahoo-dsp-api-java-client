package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Gabriel Diaz, Oct 11th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteList {

    public enum Type {
        SITE_LIST,
        APP_LIST
    }

    private Long id;
    private String name;
    private Long accountId;
    private Status status;
    private Type type;
    @JsonProperty("isShared")
    private Boolean shared;
    private List<SiteListItem> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public List<SiteListItem> getItems() {
        return items;
    }

    public void setItems(List<SiteListItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "SiteList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountId=" + accountId +
                ", status=" + status +
                ", type=" + type +
                ", shared=" + shared +
                ", items=" + items +
                '}';
    }
}
