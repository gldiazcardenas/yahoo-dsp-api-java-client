package io.github.gldiazcardenas.yahoodsp.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Gabriel Diaz, Aug 24th 2022.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SeatsResponse extends DspResponse<Seats> {

}
