package com.rest.optional.stream.lib.ms.soggetto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-13T18:25:44.628+02:00")
public class Planets {

    private String name = null;
    private String rotationPeriod = null;
    private String orbitalPeriod = null;
    private String diameter = null;
    private String climate = null;
    private String gravity = null;
    private String terrain = null;
    private String surfaceWater = null;
    private String population = null;
    private List<String> residents = new ArrayList<String>();
    private List<String> films = new ArrayList<String>();
    private String created = null;
    private String edited = null;
    private String url = null;


    /**
     *
     **/
    public Planets name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     *
     **/
    public Planets rotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("rotation_period")
    public String getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }


    /**
     *
     **/
    public Planets orbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("orbital_period")
    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }


    /**
     *
     **/
    public Planets diameter(String diameter) {
        this.diameter = diameter;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("diameter")
    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }


    /**
     *
     **/
    public Planets climate(String climate) {
        this.climate = climate;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("climate")
    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }


    /**
     *
     **/
    public Planets gravity(String gravity) {
        this.gravity = gravity;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("gravity")
    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }


    /**
     *
     **/
    public Planets terrain(String terrain) {
        this.terrain = terrain;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("terrain")
    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }


    /**
     *
     **/
    public Planets surfaceWater(String surfaceWater) {
        this.surfaceWater = surfaceWater;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("surface_water")
    public String getSurfaceWater() {
        return surfaceWater;
    }

    public void setSurfaceWater(String surfaceWater) {
        this.surfaceWater = surfaceWater;
    }


    /**
     *
     **/
    public Planets population(String population) {
        this.population = population;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("population")
    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }


    /**
     *
     **/
    public Planets residents(List<String> residents) {
        this.residents = residents;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("residents")
    public List<String> getResidents() {
        return residents;
    }

    public void setResidents(List<String> residents) {
        this.residents = residents;
    }


    /**
     *
     **/
    public Planets films(List<String> films) {
        this.films = films;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("films")
    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }


    /**
     *
     **/
    public Planets created(String created) {
        this.created = created;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }


    /**
     *
     **/
    public Planets edited(String edited) {
        this.edited = edited;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("edited")
    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }


    /**
     *
     **/
    public Planets url(String url) {
        this.url = url;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Planets planets = (Planets) o;
        return Objects.equals(this.name, planets.name) &&
                Objects.equals(this.rotationPeriod, planets.rotationPeriod) &&
                Objects.equals(this.orbitalPeriod, planets.orbitalPeriod) &&
                Objects.equals(this.diameter, planets.diameter) &&
                Objects.equals(this.climate, planets.climate) &&
                Objects.equals(this.gravity, planets.gravity) &&
                Objects.equals(this.terrain, planets.terrain) &&
                Objects.equals(this.surfaceWater, planets.surfaceWater) &&
                Objects.equals(this.population, planets.population) &&
                Objects.equals(this.residents, planets.residents) &&
                Objects.equals(this.films, planets.films) &&
                Objects.equals(this.created, planets.created) &&
                Objects.equals(this.edited, planets.edited) &&
                Objects.equals(this.url, planets.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rotationPeriod, orbitalPeriod, diameter, climate, gravity, terrain, surfaceWater, population, residents, films, created, edited, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Planets {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rotationPeriod: ").append(toIndentedString(rotationPeriod)).append("\n");
        sb.append("    orbitalPeriod: ").append(toIndentedString(orbitalPeriod)).append("\n");
        sb.append("    diameter: ").append(toIndentedString(diameter)).append("\n");
        sb.append("    climate: ").append(toIndentedString(climate)).append("\n");
        sb.append("    gravity: ").append(toIndentedString(gravity)).append("\n");
        sb.append("    terrain: ").append(toIndentedString(terrain)).append("\n");
        sb.append("    surfaceWater: ").append(toIndentedString(surfaceWater)).append("\n");
        sb.append("    population: ").append(toIndentedString(population)).append("\n");
        sb.append("    residents: ").append(toIndentedString(residents)).append("\n");
        sb.append("    films: ").append(toIndentedString(films)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

