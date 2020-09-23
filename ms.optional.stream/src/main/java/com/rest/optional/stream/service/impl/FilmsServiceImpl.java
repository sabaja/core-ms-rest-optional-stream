package com.rest.optional.stream.service.impl;

import com.rest.optional.stream.Films;
import com.rest.optional.stream.FilmsArray;
import com.rest.optional.stream.api.bin.FilmsBin;
import com.rest.optional.stream.connector.GetFilmsRestConnectorFacade;
import com.rest.optional.stream.mapper.FilmsMapper;
import com.rest.optional.stream.service.FilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmsServiceImpl implements FilmsService {

    @Autowired
    FilmsMapper mapper;
    @Autowired
    private GetFilmsRestConnectorFacade connectorFacade;

    @Override
    public Films getFilm() {
        return connectorFacade.getFilm();
    }

    @Override
    public FilmsBin getFilms() {
        return createFimsBin(connectorFacade.getFilms());
    }

    private FilmsBin createFimsBin(List<FilmsArray> films) {
        return FilmsBin.builder()
                .filmsArrays(films)
                .build();

    }
}
