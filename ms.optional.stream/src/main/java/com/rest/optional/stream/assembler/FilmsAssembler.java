package com.rest.optional.stream.assembler;

import aQute.bnd.annotation.component.Component;
import com.rest.optional.stream.FilmsArray;
import com.rest.optional.stream.api.resources.FilmsResource;
import com.rest.optional.stream.mapper.FilmsMapper;
import com.rest.optional.stream.util.resource.BaseResourceAssemblerSupport;
import lombok.SneakyThrows;

@Component
public class FilmsAssembler extends BaseResourceAssemblerSupport<FilmsArray, FilmsResource> {

    private FilmsMapper mapper;

    public FilmsAssembler(Class<?> controllerClass, Class<FilmsResource> resourceType) {
        super(controllerClass, resourceType);
    }

    @Override
    @SneakyThrows
    public FilmsResource toResource(FilmsArray entity) {
        return null;
    }
}
