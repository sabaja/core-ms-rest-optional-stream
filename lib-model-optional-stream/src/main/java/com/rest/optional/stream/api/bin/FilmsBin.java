package com.rest.optional.stream.api.bin;

import com.rest.optional.stream.FilmsArray;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class FilmsBin {
    private FilmsArray filmsArrays;
}
