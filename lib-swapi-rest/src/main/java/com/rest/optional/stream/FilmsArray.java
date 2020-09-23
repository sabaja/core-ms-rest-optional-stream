package com.rest.optional.stream;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-13T18:25:44.628+02:00")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmsArray implements Serializable {

    private static final long serialVersionUID = 2962199792797078463L;
    private Integer count = null;
    private Integer next = null;
    private Integer previous = null;
    private List<Films> filmsList = new ArrayList<>();

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("next")
    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }

    @JsonProperty("previous")
    public Integer getPrevious() {
        return previous;
    }

    public void setPrevious(Integer previous) {
        this.previous = previous;
    }

    @JsonProperty("results")
    public List<Films> getFilmsList() {
        return filmsList;
    }

    public void setFilmsList(List<Films> filmsList) {
        this.filmsList = filmsList;
    }


    @Override
    public int hashCode() {
        return Objects.hash(count, next, previous, filmsList);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FilmsArray filmsArray = (FilmsArray) o;
        return Objects.equals(this.count, filmsArray.count) &&
                Objects.equals(this.next, filmsArray.next) &&
                Objects.equals(this.previous, filmsArray.previous) &&
                Objects.equals(this.filmsList, filmsArray.filmsList);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilmsArray {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    episodeId: ").append(toIndentedString(next)).append("\n");
        sb.append("    next: ").append(toIndentedString(previous)).append("\n");
        sb.append("    results: ").append(toIndentedString(filmsList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

