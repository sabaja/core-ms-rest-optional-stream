package com.rest.optional.stream.connector;

import com.rest.optional.stream.ArrayFilms;
import com.rest.optional.stream.Films;
import com.rest.optional.stream.connector.util.BaseConnector;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class GetFilmsRestConnectorFacade extends BaseConnector<ArrayFilms> {

    @Value("${swapi_url_getFilms}")
    public String uri;
    @Autowired
    @Qualifier("restTemplate")
    private RestTemplate restTemplate;

    public Films getFilm() {
        Films response = null;
        try {
            log.info("START getAllFilms");
            response = restTemplate.getForObject("https://swapi.dev/api/films/1", Films.class);
            log.info("{}", response);

        } catch (Exception e) {
            log.info("", e);
        }
        return Optional.ofNullable(response).orElse(new Films());
    }


    public List<ArrayFilms> getFilms() {
        Collection<ArrayFilms> readValues = null;
        try {
            log.info("START getAllFilms");
            final String url = "https://swapi.dev/api/films";
            readValues = readValue(url);
            log.info("{}", readValues);

        } catch (Exception e) {
            log.info("error ->", e);
        }
        return new ArrayList<>(CollectionUtils.emptyIfNull(readValues));
    }


}
