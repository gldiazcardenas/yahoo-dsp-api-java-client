package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportFilterOption {

    private ReportDimensionType dimensionTypeId;
    @JsonProperty("isExcluded")
    private Boolean excluded;
    private List<ReportFilterOptionValue> includeValues;

    public ReportDimensionType getDimensionTypeId() {
        return dimensionTypeId;
    }

    public void setDimensionTypeId(ReportDimensionType dimensionTypeId) {
        this.dimensionTypeId = dimensionTypeId;
    }

    public Boolean getExcluded() {
        return excluded;
    }

    public void setExcluded(Boolean excluded) {
        this.excluded = excluded;
    }

    public List<ReportFilterOptionValue> getIncludeValues() {
        return includeValues;
    }

    public void setIncludeValues(List<ReportFilterOptionValue> includeValues) {
        this.includeValues = includeValues;
    }

    @Override
    public String toString() {
        return "ReportFilterOption{" +
                "dimensionTypeId=" + dimensionTypeId +
                ", excluded=" + excluded +
                ", includeValues=" + includeValues +
                '}';
    }

}
