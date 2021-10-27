package com.slyworks.a04_simple_factory;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        abs_name = "NY Style veggie Pizza";
        abs_dough = "Thin Crust Dough";
        abs_sauce = "Marinara Sauce";

        abs_toppings.add("Vegetables");
    }
}
