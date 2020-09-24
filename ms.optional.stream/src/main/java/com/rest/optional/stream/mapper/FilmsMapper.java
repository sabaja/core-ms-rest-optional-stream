package com.rest.optional.stream.mapper;

import com.rest.optional.stream.Films;
import com.rest.optional.stream.FilmsArray;
import com.rest.optional.stream.api.bin.FilmsBin;
import com.rest.optional.stream.api.resources.FilmsResource;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Mapper(componentModel = "spring")
public interface FilmsMapper {


    default FilmsResource binToResource(FilmsBin bin) {
        List<Films> films = new ArrayList<>();
        Optional.ofNullable(bin)
                .map(FilmsBin::getFilmsArrays)
                .map(FilmsArray::getFilmsList)
                .ifPresent(films::addAll);
        return new FilmsResource(films);
    }


}
