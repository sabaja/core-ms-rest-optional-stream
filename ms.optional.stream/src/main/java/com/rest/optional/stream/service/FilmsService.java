package com.rest.optional.stream.service;

import com.rest.optional.stream.Films;
import com.rest.optional.stream.api.bin.FilmsBin;


public interface FilmsService {

    Films getFilm();

    FilmsBin getFilms();
}
