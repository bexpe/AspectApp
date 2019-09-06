package com.bexpe.impl;

import com.bexpe.api.ICook;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("cook")
public class Cook implements ICook {
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
}
