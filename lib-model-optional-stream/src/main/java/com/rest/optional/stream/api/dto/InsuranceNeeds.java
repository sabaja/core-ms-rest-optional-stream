package com.rest.optional.stream.api.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class InsuranceNeeds implements Serializable {

    private String question1;
    private String question2;
    private String question3;
    private String question4;
}
