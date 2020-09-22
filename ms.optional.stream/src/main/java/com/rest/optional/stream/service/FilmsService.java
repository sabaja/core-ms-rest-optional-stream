package com.rest.optional.stream.service;

import com.rest.optional.stream.ArrayFilms;
import com.rest.optional.stream.Films;

import java.util.List;


public interface FilmsService {

    Films getFilm();

    List<ArrayFilms> getFilms();
}
