package com.bexpe.api;

public interface ICook {
    void takeIngredientsFromWarehouse(int ingredientsAmount);
    void takeIngredientsFromWarehouse();
    void preparePizza();
    void preparePizza(int idPizza);
    void givePizzaAway();
}
