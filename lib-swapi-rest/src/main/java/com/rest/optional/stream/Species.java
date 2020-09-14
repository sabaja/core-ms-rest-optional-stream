package com.rest.optional.stream;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;





@Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-13T18:25:44.628+02:00")
public class Species   {
  
  private String name = null;
  private String classification = null;
  private String designation = null;
  private String averageHeight = null;
  private String skinColors = null;
  private String hairColors = null;
  private String eyeColors = null;
  private String averageLifespan = null;
  private String homeworld = null;
  private String language = null;
  private List<String> people = new ArrayList<String>();
  private List<String> films = new ArrayList<String>();
  private String created = null;
  private String edited = null;
  private String url = null;

  
  /**
   **/
  public Species name(String name) {
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
  public Species classification(String classification) {
    this.classification = classification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("classification")
  public String getClassification() {
    return classification;
  }
  public void setClassification(String classification) {
    this.classification = classification;
  }

  
  /**
   **/
  public Species designation(String designation) {
    this.designation = designation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("designation")
  public String getDesignation() {
    return designation;
  }
  public void setDesignation(String designation) {
    this.designation = designation;
  }

  
  /**
   **/
  public Species averageHeight(String averageHeight) {
    this.averageHeight = averageHeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("average_height")
  public String getAverageHeight() {
    return averageHeight;
  }
  public void setAverageHeight(String averageHeight) {
    this.averageHeight = averageHeight;
  }

  
  /**
   **/
  public Species skinColors(String skinColors) {
    this.skinColors = skinColors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skin_colors")
  public String getSkinColors() {
    return skinColors;
  }
  public void setSkinColors(String skinColors) {
    this.skinColors = skinColors;
  }

  
  /**
   **/
  public Species hairColors(String hairColors) {
    this.hairColors = hairColors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hair_colors")
  public String getHairColors() {
    return hairColors;
  }
  public void setHairColors(String hairColors) {
    this.hairColors = hairColors;
  }

  
  /**
   **/
  public Species eyeColors(String eyeColors) {
    this.eyeColors = eyeColors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eye_colors")
  public String getEyeColors() {
    return eyeColors;
  }
  public void setEyeColors(String eyeColors) {
    this.eyeColors = eyeColors;
  }

  
  /**
   **/
  public Species averageLifespan(String averageLifespan) {
    this.averageLifespan = averageLifespan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("average_lifespan")
  public String getAverageLifespan() {
    return averageLifespan;
  }
  public void setAverageLifespan(String averageLifespan) {
    this.averageLifespan = averageLifespan;
  }

  
  /**
   **/
  public Species homeworld(String homeworld) {
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
  public Species language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  
  /**
   **/
  public Species people(List<String> people) {
    this.people = people;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("people")
  public List<String> getPeople() {
    return people;
  }
  public void setPeople(List<String> people) {
    this.people = people;
  }

  
  /**
   **/
  public Species films(List<String> films) {
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
  public Species created(String created) {
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
  public Species edited(String edited) {
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
  public Species url(String url) {
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
    Species species = (Species) o;
    return Objects.equals(this.name, species.name) &&
        Objects.equals(this.classification, species.classification) &&
        Objects.equals(this.designation, species.designation) &&
        Objects.equals(this.averageHeight, species.averageHeight) &&
        Objects.equals(this.skinColors, species.skinColors) &&
        Objects.equals(this.hairColors, species.hairColors) &&
        Objects.equals(this.eyeColors, species.eyeColors) &&
        Objects.equals(this.averageLifespan, species.averageLifespan) &&
        Objects.equals(this.homeworld, species.homeworld) &&
        Objects.equals(this.language, species.language) &&
        Objects.equals(this.people, species.people) &&
        Objects.equals(this.films, species.films) &&
        Objects.equals(this.created, species.created) &&
        Objects.equals(this.edited, species.edited) &&
        Objects.equals(this.url, species.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, classification, designation, averageHeight, skinColors, hairColors, eyeColors, averageLifespan, homeworld, language, people, films, created, edited, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Species {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
    sb.append("    averageHeight: ").append(toIndentedString(averageHeight)).append("\n");
    sb.append("    skinColors: ").append(toIndentedString(skinColors)).append("\n");
    sb.append("    hairColors: ").append(toIndentedString(hairColors)).append("\n");
    sb.append("    eyeColors: ").append(toIndentedString(eyeColors)).append("\n");
    sb.append("    averageLifespan: ").append(toIndentedString(averageLifespan)).append("\n");
    sb.append("    homeworld: ").append(toIndentedString(homeworld)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    people: ").append(toIndentedString(people)).append("\n");
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

