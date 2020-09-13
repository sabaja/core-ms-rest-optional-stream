package com.rest.optional.stream.lib.ms.soggetto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-13T18:25:44.628+02:00")
public class People   {
  
  private String name = null;
  private String height = null;
  private String mass = null;
  private String hairColor = null;
  private String skinColor = null;
  private String eyeColor = null;
  private String birthYear = null;
  private String gender = null;
  private String homeworld = null;
  private List<String> films = new ArrayList<String>();
  private List<Object> species = new ArrayList<Object>();
  private List<String> vehicles = new ArrayList<String>();
  private List<String> starships = new ArrayList<String>();
  private String created = null;
  private String edited = null;
  private String url = null;

  
  /**
   **/
  public People name(String name) {
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
   **/
  public People height(String height) {
    this.height = height;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("height")
  public String getHeight() {
    return height;
  }
  public void setHeight(String height) {
    this.height = height;
  }

  
  /**
   **/
  public People mass(String mass) {
    this.mass = mass;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mass")
  public String getMass() {
    return mass;
  }
  public void setMass(String mass) {
    this.mass = mass;
  }

  
  /**
   **/
  public People hairColor(String hairColor) {
    this.hairColor = hairColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hair_color")
  public String getHairColor() {
    return hairColor;
  }
  public void setHairColor(String hairColor) {
    this.hairColor = hairColor;
  }

  
  /**
   **/
  public People skinColor(String skinColor) {
    this.skinColor = skinColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skin_color")
  public String getSkinColor() {
    return skinColor;
  }
  public void setSkinColor(String skinColor) {
    this.skinColor = skinColor;
  }

  
  /**
   **/
  public People eyeColor(String eyeColor) {
    this.eyeColor = eyeColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eye_color")
  public String getEyeColor() {
    return eyeColor;
  }
  public void setEyeColor(String eyeColor) {
    this.eyeColor = eyeColor;
  }

  
  /**
   **/
  public People birthYear(String birthYear) {
    this.birthYear = birthYear;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("birth_year")
  public String getBirthYear() {
    return birthYear;
  }
  public void setBirthYear(String birthYear) {
    this.birthYear = birthYear;
  }

  
  /**
   **/
  public People gender(String gender) {
    this.gender = gender;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  
  /**
   **/
  public People homeworld(String homeworld) {
    this.homeworld = homeworld;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("homeworld")
  public String getHomeworld() {
    return homeworld;
  }
  public void setHomeworld(String homeworld) {
    this.homeworld = homeworld;
  }

  
  /**
   **/
  public People films(List<String> films) {
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
   **/
  public People species(List<Object> species) {
    this.species = species;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("species")
  public List<Object> getSpecies() {
    return species;
  }
  public void setSpecies(List<Object> species) {
    this.species = species;
  }

  
  /**
   **/
  public People vehicles(List<String> vehicles) {
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
  public People starships(List<String> starships) {
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
  public People created(String created) {
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
  public People edited(String edited) {
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
  public People url(String url) {
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
    People people = (People) o;
    return Objects.equals(this.name, people.name) &&
        Objects.equals(this.height, people.height) &&
        Objects.equals(this.mass, people.mass) &&
        Objects.equals(this.hairColor, people.hairColor) &&
        Objects.equals(this.skinColor, people.skinColor) &&
        Objects.equals(this.eyeColor, people.eyeColor) &&
        Objects.equals(this.birthYear, people.birthYear) &&
        Objects.equals(this.gender, people.gender) &&
        Objects.equals(this.homeworld, people.homeworld) &&
        Objects.equals(this.films, people.films) &&
        Objects.equals(this.species, people.species) &&
        Objects.equals(this.vehicles, people.vehicles) &&
        Objects.equals(this.starships, people.starships) &&
        Objects.equals(this.created, people.created) &&
        Objects.equals(this.edited, people.edited) &&
        Objects.equals(this.url, people.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, height, mass, hairColor, skinColor, eyeColor, birthYear, gender, homeworld, films, species, vehicles, starships, created, edited, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class People {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    mass: ").append(toIndentedString(mass)).append("\n");
    sb.append("    hairColor: ").append(toIndentedString(hairColor)).append("\n");
    sb.append("    skinColor: ").append(toIndentedString(skinColor)).append("\n");
    sb.append("    eyeColor: ").append(toIndentedString(eyeColor)).append("\n");
    sb.append("    birthYear: ").append(toIndentedString(birthYear)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    homeworld: ").append(toIndentedString(homeworld)).append("\n");
    sb.append("    films: ").append(toIndentedString(films)).append("\n");
    sb.append("    species: ").append(toIndentedString(species)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
    sb.append("    starships: ").append(toIndentedString(starships)).append("\n");
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

