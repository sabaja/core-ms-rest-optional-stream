package com.rest.optional.stream.controller;

import com.rest.optional.stream.connector.GetFilmsRestConnectorFacade;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.rest.optional.stream.util.constants.HttpStatusMessage.Constants.*;
import static java.net.HttpURLConnection.*;
import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping(path = "/", produces = {APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class GetUsersController {

    @Autowired
    private GetFilmsRestConnectorFacade connector;

    @GetMapping(path = "/users")
    @ApiOperation(value = "API che crea un nuovo computer")
    @ApiResponses(value = {
            @ApiResponse(code = HTTP_OK, message = OK),
            @ApiResponse(code = HTTP_INTERNAL_ERROR, message = SERVER_ERROR),
            @ApiResponse(code = HTTP_UNAUTHORIZED, message = UNAUTHORIZED),
            @ApiResponse(code = HTTP_FORBIDDEN, message = FORBIDDEN),
            @ApiResponse(code = HTTP_NOT_FOUND, message = NOT_FOUND),
            @ApiResponse(code = HTTP_BAD_REQUEST, message = BAD_REQUEST),
            @ApiResponse(code = HTTP_PRECON_FAILED, message = PRECONDITION_FAILED)
    })
    public ResponseEntity<String> getUsers() {
        return ResponseEntity.ok("");
    }

}
