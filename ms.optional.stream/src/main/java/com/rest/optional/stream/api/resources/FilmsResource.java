package com.rest.optional.stream.api.resources;

import com.rest.optional.stream.Films;
import com.rest.optional.stream.util.resource.BaseResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;


@ApiModel(
        value = "FilmsResource",
        description = "swapi Films"
)
public class FilmsResource extends BaseResource<FilmsResource> implements Serializable {
    private static final long serialVersionUID = 5970247953747542368L;

    @ApiModelProperty("Arrays of Swapi films")
    private List<Films> films;

    public FilmsResource() {
        //Default Constructor

    }

    public FilmsResource(List<Films> films) {
        this.films = films;
    }

    public List<Films> getFilms() {
        return films;
    }

    public void setFilms(List<Films> films) {
        this.films = films;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FilmsResource)) return false;
        if (!super.equals(o)) return false;

        FilmsResource that = (FilmsResource) o;

        return getFilms() != null ? getFilms().equals(that.getFilms()) : that.getFilms() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getFilms() != null ? getFilms().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FilmsResource{" +
                "films=" + films +
                '}';
    }
}
