//Person.java provides the person object for person_form.html and person_show.html
//a person object has firstName, lastName, and favoriteFood

package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Entity indicates a class that is going to be persistent in the database
@Entity
public class Person {

  //create the database ID
  @Id
  @GeneratedValue
  private long id;

  //error checking that will be used to check person_form when displaying person_show.html
  @NotNull
  @Size(min=3, max=25)
  private String firstName;

  @NotNull
  @Size(min=3, max=25)
  private String lastName;

  @NotNull
  @Size(min=3, max=25)
  private String favoriteFood;

  //default constructor
  public Person() {

  }

  //constructor
  public Person(long id, String firstName, String lastName, String favoriteFood) {
    super();
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.favoriteFood = favoriteFood;
  }

  //variable getters
  public long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFavoriteFood() {
    return favoriteFood;
  }

  //variable setters
  public void setId(long id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setFavoriteFood(String favoriteFood) {
    this.favoriteFood = favoriteFood;
  }


}
