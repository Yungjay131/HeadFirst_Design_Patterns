package com.slyworks.a04_simple_factory;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        abs_name = "NY Style Sauce and Clam Pizza";
        abs_dough = "Thick Crust Dough";
        abs_sauce = "Tomato Sauce";

        abs_toppings.add("Clams");
    }
}
