package com.rest.optional.stream.util.resource;


import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;


public abstract class BaseResourceAssemblerSupport<T, D extends RepresentationModel<?>> extends RepresentationModelAssemblerSupport<T, D> {

    public BaseResourceAssemblerSupport(Class<?> controllerClass, Class<D> resourceType) {
        super(controllerClass, resourceType);
    }

    public static String buildResourcePath(String id, String resourceCollectionName) {
        return "/" + resourceCollectionName + "/" + id;
    }

    public static String getIdFromResourceLink(Link link) {
        return link.getHref().replaceFirst(".*/([^/?]+).*", "$1");
    }
}
