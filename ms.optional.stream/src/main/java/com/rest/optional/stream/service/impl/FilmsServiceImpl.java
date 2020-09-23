package com.rest.optional.stream.service.impl;

import com.rest.optional.stream.Films;
import com.rest.optional.stream.FilmsArray;
import com.rest.optional.stream.connector.GetFilmsRestConnectorFacade;
import com.rest.optional.stream.service.FilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmsServiceImpl implements FilmsService {

    @Autowired
    private GetFilmsRestConnectorFacade connectorFacade;

    @Override
    public Films getFilm() {
        return connectorFacade.getFilm();
    }

    @Override
    public List<FilmsArray> getFilms() {
        return connectorFacade.getFilms();
    }
}
