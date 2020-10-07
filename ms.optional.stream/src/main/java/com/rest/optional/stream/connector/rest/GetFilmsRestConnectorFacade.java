package com.rest.optional.stream.connector.rest;

import com.rest.optional.stream.Films;
import com.rest.optional.stream.FilmsArray;
import com.rest.optional.stream.connector.util.BaseConnector;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;
import java.util.Optional;

@Service
@Slf4j
public class GetFilmsRestConnectorFacade extends BaseConnector<FilmsArray> {

    @Autowired
    @Qualifier("restTemplate")
    private RestTemplate restTemplate;


    public Films getFilm(final String url) {
        Films response = null;
        try {
            response = restTemplate.getForObject("https://swapi.dev/api/films/1", Films.class);
        } catch (Exception e) {
            log.info("", e);
        }
        return Optional.ofNullable(response).orElse(new Films());
    }


    public FilmsArray getFilms(String url) {
        FilmsArray filmsArray = null;
        try {
            filmsArray = getVaule(url, FilmsArray.class);
        } catch (Exception e) {
            log.info("error ->", e);
        }
        return Objects.nonNull(filmsArray) ? filmsArray : new FilmsArray();
    }


}
