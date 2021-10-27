package com.slyworks.a04_simple_factory;

public abstract class PizzaStore {

    public Pizza orderPizza(Type type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(Type type);
}
