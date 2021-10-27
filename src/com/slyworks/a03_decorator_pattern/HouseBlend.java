package com.slyworks.a03_decorator_pattern;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        abs_description = "House Blend Coffee";
    }

    public double cost(){
        return .90;
    }
}
