package com.slyworks.a03_decorator_pattern;

public class Soy extends CondimentDecorator {
    //region Vars
    private double COST = .50;
    private Beverage beverage;
    //endregion

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription().concat(" ,Soy");
    }

    @Override
    public double cost() {
        return beverage.cost() + COST;
    }
}
