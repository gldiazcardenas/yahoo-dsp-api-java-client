package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.Instant;
import java.util.List;

/**
 * @author Gabriel Diaz, Sep 16th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contextual {

    /**
     * The owner of the contextual.
     */
    public enum OwnerType {
        ACCOUNT,
        SEAT
    }

    private Long id;
    private TaxonomyType taxonomyType;
    private Long accountId;
    private Long seatId;
    private OwnerType ownerType;
    private String name;
    private List<ContextualCategoryId> categories;
    private ContextualAdvertiserSharingSettings advertiserSharingSettings;
    private ContextualSeatLevelTarget seatLevelTarget;
    private Instant updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TaxonomyType getTaxonomyType() {
        return taxonomyType;
    }

    public void setTaxonomyType(TaxonomyType taxonomyType) {
        this.taxonomyType = taxonomyType;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }

    public OwnerType getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(OwnerType ownerType) {
        this.ownerType = ownerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ContextualCategoryId> getCategories() {
        return categories;
    }

    public void setCategories(List<ContextualCategoryId> categories) {
        this.categories = categories;
    }

    public ContextualAdvertiserSharingSettings getAdvertiserSharingSettings() {
        return advertiserSharingSettings;
    }

    public void setAdvertiserSharingSettings(ContextualAdvertiserSharingSettings advertiserSharingSettings) {
        this.advertiserSharingSettings = advertiserSharingSettings;
    }

    public ContextualSeatLevelTarget getSeatLevelTarget() {
        return seatLevelTarget;
    }

    public void setSeatLevelTarget(ContextualSeatLevelTarget seatLevelTarget) {
        this.seatLevelTarget = seatLevelTarget;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Contextual{" +
                "id=" + id +
                ", taxonomyType=" + taxonomyType +
                ", accountId=" + accountId +
                ", seatId=" + seatId +
                ", ownerType=" + ownerType +
                ", name='" + name + '\'' +
                ", categories=" + categories +
                ", advertiserSharingSettings=" + advertiserSharingSettings +
                ", seatLevelTarget=" + seatLevelTarget +
                ", updatedAt=" + updatedAt +
                '}';
    }

}
