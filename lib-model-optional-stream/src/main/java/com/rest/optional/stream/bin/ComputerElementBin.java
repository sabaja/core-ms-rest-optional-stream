package com.rest.optional.stream.bin;

import com.rest.optional.stream.constants.DomainElement;
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
public class ComputerElementBin {
    private BigInteger id;
    private String name;
    private List<DomainElement> domainElements;
}
