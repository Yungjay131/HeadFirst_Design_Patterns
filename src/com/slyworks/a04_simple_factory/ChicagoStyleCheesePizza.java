package com.slyworks.a04_simple_factory;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        abs_name = "Chicago Style Deep Dish Cheese Pizza";
        abs_dough = "Extra Thick Crust Dough";
        abs_sauce = " Plum Tomato Sauce";

        abs_toppings.add("Shredded Mozzarella Cheese");
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
