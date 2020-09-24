package com.rest.optional.stream.connector.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@Slf4j
public abstract class BaseConnector<T> {

    @Autowired
    @Qualifier("restTemplate")
    private RestTemplate restTemplate;

    public final Collection<T> readValue(String url) throws JsonProcessingException {
        String responseAsString = restTemplate.getForObject(url, String.class);
        final ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        return mapper.readValue(responseAsString, new TypeReference<Collection<T>>() {
        });
    }

    public final T getVaule(String url, Class<T> clazz) {
        return restTemplate.getForObject(url, clazz);
    }
}
