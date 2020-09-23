package com.rest.optional.stream.assembler;

import aQute.bnd.annotation.component.Component;
import com.rest.optional.stream.api.bin.FilmsBin;
import com.rest.optional.stream.api.resources.FilmsResource;
import com.rest.optional.stream.controller.GetFilmsController;
import com.rest.optional.stream.mapper.FilmsMapper;
import com.rest.optional.stream.util.resource.BaseResourceAssemblerSupport;
import lombok.SneakyThrows;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;


@Component
public class FilmsAssembler extends BaseResourceAssemblerSupport<FilmsBin, FilmsResource> {

    private FilmsMapper mapper;

    public FilmsAssembler(Class<?> controllerClass, Class<FilmsResource> resourceType) {
        super(controllerClass, resourceType);
    }

    @Override
    @SneakyThrows
    public FilmsResource toResource(FilmsBin bin) {
        FilmsResource resource = instantiateResource(bin);
        resource.add(linkTo(methodOn(GetFilmsController.class)
                .getFilms()
        ).withSelfRel().expand());

        return null;
    }

    @Override
    protected FilmsResource instantiateResource(FilmsBin bin) {
        return mapper.binToResource(bin);
    }
}
