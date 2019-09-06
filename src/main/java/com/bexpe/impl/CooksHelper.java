package com.bexpe.impl;

import com.bexpe.api.ICook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CooksHelper implements ICook {

    @Autowired
    @Qualifier("cooks_helper")
    private ICook cook;

    public void takeIngredientsFromWarehouse(int ingredientsAmount) {
        System.out.println("Helper takes " + ingredientsAmount + " from warehouse");
    }

    public void takeIngredientsFromWarehouse() {
        System.out.println("Helper is taking ingredients from warehouse");
    }

    public void preparePizza() {
        System.out.println("Helper delegate task to cook");
        cook.preparePizza();
    }

    public void preparePizza(int idPizza) {
        System.out.println("Helper delegate task with id " + idPizza + " to cook");
        cook.preparePizza(idPizza);
    }

    public void givePizzaAway() {
        System.out.println("Helper is giving pizza away");
    }
}