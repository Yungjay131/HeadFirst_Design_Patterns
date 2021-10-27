package com.slyworks.a03_decorator_pattern;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        abs_description = "Dark Roast";
    }

    public double cost(){
        return .89;
    }
}
