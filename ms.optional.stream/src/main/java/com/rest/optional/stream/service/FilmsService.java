package com.rest.optional.stream.service;

import com.rest.optional.stream.Films;
import com.rest.optional.stream.FilmsArray;

import java.util.List;


public interface FilmsService {

    Films getFilm();

    List<FilmsArray> getFilms();
}
