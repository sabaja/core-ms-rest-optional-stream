package com.rest.optional.stream.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class DuplicateJsonNameRequest implements Serializable {

    @JsonProperty("BISOGNI_ASSICURATIVI")
    private String insuranceNeed;

    @JsonProperty("BISOGNI_ASSICURATIVI")
    private InsuranceNeeds insuranceNeeds;

}
