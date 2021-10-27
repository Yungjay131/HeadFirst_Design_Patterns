package com.slyworks.a03_decorator_pattern;

public abstract class Beverage {
    //region Vars
    String abs_description = "Unknown Beverage";
    //endregion

    public String getDescription(){ return abs_description; }

    public abstract double cost();
}
