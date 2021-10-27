package com.slyworks.a04_simple_factory;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        abs_name = "NY Style pepperoni Pizza";
        abs_dough = "Thin Crust Dough";
        abs_sauce = "Marinara Sauce";

        abs_toppings.add("Pepperoni");
    }
}
