package com.rest.optional.stream.util.repository.converter;

import com.rest.optional.stream.api.constants.ComputerType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import static com.rest.optional.stream.api.constants.ComputerType.*;
import static java.util.Objects.isNull;

@Converter(autoApply = true)
public class ComputerTypeConverter implements AttributeConverter<ComputerType, String> {

    private static final String ND = "ND";

    @Override
    public String convertToDatabaseColumn(ComputerType computerType) {
        if (isNull(computerType)) {
            return null;
        }
        switch (computerType) {
            case MAIN_FRAME:
            case PERSONAL_COMPUTER:
            case WORKSTATION:
            case TABLET:
            case SUPER_COMPUTER:
                return computerType.getValue();
            case NOT_DEFINED:
                return ND;
            default:
                throw new IllegalArgumentException(computerType + " not supported.");
        }
    }

    @Override
    public ComputerType convertToEntityAttribute(String attribute) {
        if (isNull(attribute)) {
            return null;
        }
        switch (attribute) {
            case "MAIN_FRAME":
                return MAIN_FRAME;
            case "PERSONAL_COMPUTER":
                return PERSONAL_COMPUTER;
            case "WORKSTATION":
                return WORKSTATION;

            case "TABLET":
                return TABLET;
            case "AI_SUPER_PC":
                return SUPER_COMPUTER;
            case ND:
                return NOT_DEFINED;
            default:
                throw new IllegalArgumentException(attribute + " not supported.");
        }
    }
}
