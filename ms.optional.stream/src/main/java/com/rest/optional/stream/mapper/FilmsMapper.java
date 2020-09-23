package com.rest.optional.stream.mapper;

import com.rest.optional.stream.api.bin.FilmsBin;
import com.rest.optional.stream.api.resources.FilmsResource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface FilmsMapper {

    @Mapping(target = "filmArrays", source = "filmsArrays")
    FilmsResource binToResource(FilmsBin bin);
}
