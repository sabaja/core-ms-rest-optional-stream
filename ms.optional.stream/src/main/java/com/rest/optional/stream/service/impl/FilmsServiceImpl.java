package com.rest.optional.stream.service.impl;

import com.rest.optional.stream.Films;
import com.rest.optional.stream.FilmsArray;
import com.rest.optional.stream.api.bin.FilmsBin;
import com.rest.optional.stream.connector.GetFilmsRestConnectorFacade;
import com.rest.optional.stream.mapper.FilmsMapper;
import com.rest.optional.stream.service.FilmsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FilmsServiceImpl implements FilmsService {

    @Autowired
    FilmsMapper mapper;
    @Autowired
    private GetFilmsRestConnectorFacade connectorFacade;
    @Value("${swapi.url.get.films}")
    private String url;

    @Override
    public Films getFilm() {
        return connectorFacade.getFilm("");//TODO
    }

    @Override
    public FilmsBin getFilms() {
        final FilmsArray films = connectorFacade.getFilms(url);
        log.info("{}", films);
        return createFimsBin(films);
    }

    private FilmsBin createFimsBin(FilmsArray films) {
        return FilmsBin.builder()
                .filmsArrays(films)
                .build();

    }
}
