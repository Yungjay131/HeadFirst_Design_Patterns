package com.slyworks.a03_decorator_pattern;

public class Espresso extends Beverage{
    public Espresso(){
        abs_description = "Espresso";
    }

    public double cost(){
        return 190;
    }
}
