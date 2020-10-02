package com.rest.optional.stream.api.bin;

import com.rest.optional.stream.api.constants.ComputerType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DomainElementBin {
    private BigInteger id;
    private String name;
    private List<ComputerType> computerTypes;
}
