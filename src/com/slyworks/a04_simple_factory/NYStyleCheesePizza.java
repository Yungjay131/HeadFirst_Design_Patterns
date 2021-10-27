package com.slyworks.a04_simple_factory;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        abs_name = "NY Style Sauce and Cheese Pizza";
        abs_dough = "Thin Crust Dough";
        abs_sauce = "Marinara Sauce";

        abs_toppings.add("Grated Reggiano Cheese");
    }
}

