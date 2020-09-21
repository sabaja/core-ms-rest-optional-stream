package com.rest.optional.stream;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-13T18:25:44.628+02:00")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Films   {
  
  private String title = null;
  private Integer episodeId = null;
  private String openingCrawl = null;
  private String director = null;
  private String producer = null;
  private String releaseDate = null;
  private List<String> characters = new ArrayList<String>();
  private List<String> planets = new ArrayList<String>();
  private List<String> starships = new ArrayList<String>();
  private List<String> vehicles = new ArrayList<String>();
  private List<String> species = new ArrayList<String>();
  private String created = null;
  private String edited = null;
  private String url = null;

  
  /**
   **/
  public Films title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  public Films episodeId(Integer episodeId) {
    this.episodeId = episodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("episode_id")
  public Integer getEpisodeId() {
    return episodeId;
  }
  public void setEpisodeId(Integer episodeId) {
    this.episodeId = episodeId;
  }

  
  /**
   **/
  public Films openingCrawl(String openingCrawl) {
    this.openingCrawl = openingCrawl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("opening_crawl")
  public String getOpeningCrawl() {
    return openingCrawl;
  }
  public void setOpeningCrawl(String openingCrawl) {
    this.openingCrawl = openingCrawl;
  }

  
  /**
   **/
  public Films director(String director) {
    this.director = director;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("director")
  public String getDirector() {
    return director;
  }
  public void setDirector(String director) {
    this.director = director;
  }

  
  /**
   **/
  public Films producer(String producer) {
    this.producer = producer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("producer")
  public String getProducer() {
    return producer;
  }
  public void setProducer(String producer) {
    this.producer = producer;
  }

  
  /**
   **/
  public Films releaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("release_date")
  public String getReleaseDate() {
    return releaseDate;
  }
  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  
  /**
   **/
  public Films characters(List<String> characters) {
    this.characters = characters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("characters")
  public List<String> getCharacters() {
    return characters;
  }
  public void setCharacters(List<String> characters) {
    this.characters = characters;
  }

  
  /**
   **/
  public Films planets(List<String> planets) {
    this.planets = planets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("planets")
  public List<String> getPlanets() {
    return planets;
  }
  public void setPlanets(List<String> planets) {
    this.planets = planets;
  }

  
  /**
   **/
  public Films starships(List<String> starships) {
    this.starships = starships;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("starships")
  public List<String> getStarships() {
    return starships;
  }
  public void setStarships(List<String> starships) {
    this.starships = starships;
  }

  
  /**
   **/
  public Films vehicles(List<String> vehicles) {
    this.vehicles = vehicles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vehicles")
  public List<String> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<String> vehicles) {
    this.vehicles = vehicles;
  }

  
  /**
   **/
  public Films species(List<String> species) {
    this.species = species;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("species")
  public List<String> getSpecies() {
    return species;
  }
  public void setSpecies(List<String> species) {
    this.species = species;
  }

  
  /**
   **/
  public Films created(String created) {
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
   **/
  public Films edited(String edited) {
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
   **/
  public Films url(String url) {
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
    Films films = (Films) o;
    return Objects.equals(this.title, films.title) &&
        Objects.equals(this.episodeId, films.episodeId) &&
        Objects.equals(this.openingCrawl, films.openingCrawl) &&
        Objects.equals(this.director, films.director) &&
        Objects.equals(this.producer, films.producer) &&
        Objects.equals(this.releaseDate, films.releaseDate) &&
        Objects.equals(this.characters, films.characters) &&
        Objects.equals(this.planets, films.planets) &&
        Objects.equals(this.starships, films.starships) &&
        Objects.equals(this.vehicles, films.vehicles) &&
        Objects.equals(this.species, films.species) &&
        Objects.equals(this.created, films.created) &&
        Objects.equals(this.edited, films.edited) &&
        Objects.equals(this.url, films.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, episodeId, openingCrawl, director, producer, releaseDate, characters, planets, starships, vehicles, species, created, edited, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Films {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    episodeId: ").append(toIndentedString(episodeId)).append("\n");
    sb.append("    openingCrawl: ").append(toIndentedString(openingCrawl)).append("\n");
    sb.append("    director: ").append(toIndentedString(director)).append("\n");
    sb.append("    producer: ").append(toIndentedString(producer)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    planets: ").append(toIndentedString(planets)).append("\n");
    sb.append("    starships: ").append(toIndentedString(starships)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
    sb.append("    species: ").append(toIndentedString(species)).append("\n");
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

