package com.rest.optional.stream.api.constants;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public enum ComputerType {
    SERVER("SERVER"),
    PERSONAL_COMPUTER("PERSONAL_COMPUTER"),
    WORKSTATION("WORKSTATION"),
    TABLET("TABLET"),
    PHONE("CELLULAR"),
    SUPER_COMPUTER("AI_SUPER_PC"),
    NOT_DEFINED("NOT_DEFINED");

    private static final Map<String, ComputerType> mappedValue = Stream.of(values()).collect(Collectors.toMap(ComputerType::getValue, Function.identity()));

    private final String value;


    ComputerType(String value) {
        this.value = value;
    }

    public static ComputerType fromValue(String value) {
        return mappedValue.get(value);
    }

    public String getValue() {
        return value;
    }
}
