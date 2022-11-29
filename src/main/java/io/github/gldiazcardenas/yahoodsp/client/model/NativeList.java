package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Oct 11th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NativeList {

    private Long id;
    private String name;
    private Long accountId;
    private Status status;
    private List<NativeListItem> items;

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

    public List<NativeListItem> getItems() {
        return items;
    }

    public void setItems(List<NativeListItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "NativeList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountId=" + accountId +
                ", status=" + status +
                ", items=" + items +
                '}';
    }
}
