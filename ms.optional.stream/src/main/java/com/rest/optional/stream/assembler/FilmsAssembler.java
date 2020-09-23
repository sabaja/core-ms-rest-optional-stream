package com.rest.optional.stream.assembler;

import aQute.bnd.annotation.component.Component;
import com.rest.optional.stream.api.bin.FilmsBin;
import com.rest.optional.stream.api.resources.FilmsResource;
import com.rest.optional.stream.controller.GetFilmsController;
import com.rest.optional.stream.mapper.FilmsMapper;
import com.rest.optional.stream.util.resource.BaseResourceAssemblerSupport;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@Component
public class FilmsAssembler extends BaseResourceAssemblerSupport<FilmsBin, FilmsResource> {

    @Autowired
    private FilmsMapper mapper;

    public FilmsAssembler(Class<?> controllerClass, Class<FilmsResource> resourceType) {
        super(controllerClass, resourceType);
    }

    @Override
    public FilmsResource toModel(FilmsBin bin) {
        FilmsResource resource = instantiateResource(bin);
        resource.add(linkTo(methodOn(GetFilmsController.class)
                .getFilms()
        ).withSelfRel().expand());

        return resource;
    }


    private FilmsResource instantiateResource(FilmsBin bin) {

        return mapper.binToResource(bin);
    }


}
