package com.rest.optional.stream.controller;

import com.rest.optional.stream.FilmsArray;
import com.rest.optional.stream.api.bin.FilmsBin;
import com.rest.optional.stream.api.resources.FilmsResource;
import com.rest.optional.stream.assembler.FilmsAssembler;
import com.rest.optional.stream.service.FilmsService;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.BDDMockito.given;

@SpringBootTest
class GetFilmsControllerTest {

    @InjectMocks
    private GetFilmsController controller;

    @Mock
    private FilmsService filmsService;
    @Mock
    private FilmsAssembler assembler;

    @Test
    @SneakyThrows
    void getFilms() {
        //given
        given(filmsService.getFilms()).willReturn(mockFilms());

        //when
        final ResponseEntity<FilmsResource> response = controller.getFilms(false);

        //then
        assertNotNull(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    private FilmsBin mockFilms() {
        return FilmsBin.builder().filmsArrays(new FilmsArray()).build();
    }
}