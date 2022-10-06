package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Gabriel Diaz, Oct 06th 2022.
 */
public class ReportHaving {

    @JsonProperty("type")
    private ReportHavingOperator operator;
    @JsonProperty("havingSpecs")
    private List<ReportHavingCondition> conditions;



}
