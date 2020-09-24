package com.rest.optional.stream.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.Collections;
import java.util.List;

public class MockUtils {

    @Autowired
    private ObjectMapper objectMapper;

    public static ObjectMapper objectMapperForMocks(ObjectMapper objectMapper) {
        ObjectMapper objectMapperForMock = objectMapper.copy();
        objectMapperForMock.setAnnotationIntrospector(new JacksonAnnotationIntrospector() {
            @Override
            public boolean hasIgnoreMarker(final AnnotatedMember m) {
                List<String> exclusions = Collections.singletonList("messagesForm");
                return exclusions.contains(m.getName()) || super.hasIgnoreMarker(m);
            }
        });
        return objectMapperForMock;
    }

    public Object loadMock(String path, Class<?> clazz)
            throws java.io.IOException {
        return objectMapper.readValue(clazz.getClassLoader().getResourceAsStream(path),
                clazz);
    }

    public Object loadMockList(String path, Class<?> clazz)
            throws java.io.IOException {
        return ResponseEntity.ok(objectMapper.readValue(clazz.getClassLoader().getResourceAsStream(path),
                objectMapper.getTypeFactory().constructCollectionType(List.class, clazz)));
    }

}