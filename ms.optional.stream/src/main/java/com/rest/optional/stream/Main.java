package com.rest.optional.stream;

import org.apache.commons.lang3.BooleanUtils;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        String cpp;
        Boolean sogg = Boolean.TRUE;
        final String s = Optional.ofNullable(sogg)
                .map(Main::getSoggetto)
                .orElse(null);
        cpp = s == null ? "false" : "true";

        System.out.println(s + " " + cpp);


    }

    private static String getSoggetto(Boolean sogg) {
        return BooleanUtils.toStringTrueFalse(sogg);
    }
}
