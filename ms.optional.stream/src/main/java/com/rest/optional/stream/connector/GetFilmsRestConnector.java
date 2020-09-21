package com.rest.optional.stream.connector;

import com.rest.optional.stream.Films;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class GetFilmsRestConnector {

    @Value("${swapi_url_getFilms}")
    public String uri;
    @Autowired
    @Qualifier("restTemplate")
    private RestTemplate restTemplate;

    public List<Films> getAllFilms() {
        ResponseEntity<List<Films>> response = null;
        try {
            log.info("START getAllFilms");
            response = restTemplate.exchange("https://swapi.dev/api/films", HttpMethod.GET, null, new ParameterizedTypeReference<List<Films>>() {
            });
            log.info("{}", response.getBody());

        } catch (Exception e) {
            log.info("", e);
        }
        final ResponseEntity<List<Films>> listResponseEntity = new ResponseEntity<>(Collections.singletonList(new Films()), HttpStatus.OK);
        return Optional.ofNullable(response).map(ResponseEntity::getBody).orElse(listResponseEntity.getBody());
    }

}
