package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Gabriel Diaz, Sep 16th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContextualCategory {

    private Long id;
    private Integer level;
    private Long parentCategoryId;
    private String name;
    private String description;
    private List<ContextualCategory> children;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ContextualCategory> getChildren() {
        return children;
    }

    public void setChildren(List<ContextualCategory> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "ContextualCategory{" +
                "id=" + id +
                ", level=" + level +
                ", parentCategoryId=" + parentCategoryId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", children=" + children +
                '}';
    }
}
