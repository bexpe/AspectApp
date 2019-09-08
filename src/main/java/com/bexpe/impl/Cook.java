package com.bexpe.impl;

import com.bexpe.api.ICook;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("cook")
public class Cook implements ICook {

    String name;
    String surname;
    int age;

    public void takeIngredientsFromWarehouse() {
        System.out.println("Cook is taking food from warehouse");
    }

    public void preparePizza() {
        System.out.println("Cook is preparing pizza");
    }

    public void givePizzaAway() {
        System.out.println("Cook is giving pizza away");
    }

    public void takeIngredientsFromWarehouse(int ingredientsAmount) {
        System.out.println("Cook is taking" + ingredientsAmount + "ingredients");
    }

    public void preparePizza(int idPizza) {
        System.out.println("Cook is preparing pizza with id " + idPizza);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
