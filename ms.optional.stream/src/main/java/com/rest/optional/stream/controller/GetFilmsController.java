package com.rest.optional.stream.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.optional.stream.api.resources.FilmsResource;
import com.rest.optional.stream.assembler.FilmsAssembler;
import com.rest.optional.stream.service.FilmsService;
import com.rest.optional.stream.util.MockUtils;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import static com.rest.optional.stream.util.constants.HttpStatusMessage.Constants.*;
import static java.net.HttpURLConnection.*;
import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping(path = "/", produces = {APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class GetFilmsController {

    @Autowired
    private FilmsService filmsService;
    @Autowired
    private FilmsAssembler assembler;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping(path = "/films")
    @ApiOperation(value = "API che ritorna un film")
    @ApiResponses(value = {
            @ApiResponse(code = HTTP_OK, message = OK),
            @ApiResponse(code = HTTP_INTERNAL_ERROR, message = SERVER_ERROR),
            @ApiResponse(code = HTTP_UNAUTHORIZED, message = UNAUTHORIZED),
            @ApiResponse(code = HTTP_FORBIDDEN, message = FORBIDDEN),
            @ApiResponse(code = HTTP_NOT_FOUND, message = NOT_FOUND),
            @ApiResponse(code = HTTP_BAD_REQUEST, message = BAD_REQUEST),
            @ApiResponse(code = HTTP_PRECON_FAILED, message = PRECONDITION_FAILED)
    })
    public ResponseEntity<FilmsResource> getFilms(@RequestParam(name = "mock", required = false) Boolean mock) throws Exception {
        ResponseEntity<FilmsResource> filmsResourceResponseEntity;
        if (BooleanUtils.isTrue(mock)) {
            filmsResourceResponseEntity = loadMock("mocks/json/getFilms.json");
        } else {
            filmsResourceResponseEntity = ok(assembler.toModel(filmsService.getFilms()));
        }
        return filmsResourceResponseEntity;
    }

    private ResponseEntity<FilmsResource> loadMock(String path) throws IOException {
        return ok(MockUtils.objectMapperForMocks(objectMapper)
                .readValue(GetFilmsController.class.getClassLoader().getResourceAsStream(path),
                        FilmsResource.class));
    }


}
