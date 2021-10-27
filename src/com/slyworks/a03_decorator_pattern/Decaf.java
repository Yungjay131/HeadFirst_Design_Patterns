package com.slyworks.a03_decorator_pattern;

public abstract class Decaf extends Beverage {
    public Decaf(){
        abs_description = "Decaf";
    }

    public double cost(){
        return 1.99;
    }
}
