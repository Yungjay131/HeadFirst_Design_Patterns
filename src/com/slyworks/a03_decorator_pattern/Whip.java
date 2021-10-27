package com.slyworks.a03_decorator_pattern;

public class Whip extends Beverage{
    //region Vars
    private final double COST = 1.90;
    private Beverage beverage;
    //endregion

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription().concat(" ,whip");
    }

    @Override
    public double cost() {
        return beverage.cost() + COST;
    }
}
