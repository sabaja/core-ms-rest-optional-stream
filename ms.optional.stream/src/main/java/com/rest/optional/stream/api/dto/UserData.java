package com.rest.optional.stream.api.dto;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonTypeInfo(use = Id.CLASS, include = As.PROPERTY, property = "data")
public class UserData implements Serializable {

    private static final long serialVersionUID = -3413836556179887134L;
    private BigInteger id;
    private String name;
    private String email;
    private String gender;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
