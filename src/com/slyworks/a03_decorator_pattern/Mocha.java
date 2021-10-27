package com.slyworks.a03_decorator_pattern;

public class Mocha extends CondimentDecorator {
    //region Vars
    private double COST = .20;
    private Beverage beverage;
    //endregion
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription().concat(", Mocha");
    }

    @Override
    public double cost() {
        return beverage.cost() + COST;
    }
}
