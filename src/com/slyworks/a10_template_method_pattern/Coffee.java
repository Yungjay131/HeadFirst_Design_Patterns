package com.slyworks.a10_template_method_pattern;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Brewing the coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}

