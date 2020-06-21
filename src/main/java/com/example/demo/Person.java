package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {

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
  public Person(String firstName, String lastName, String favoriteFood) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.favoriteFood = favoriteFood;
  }

  //variable getters
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
