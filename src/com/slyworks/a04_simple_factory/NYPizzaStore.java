package com.slyworks.a04_simple_factory;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(Type type) {
        switch (type){
            case CHEESE: return new NYStyleCheesePizza();
            case VEGGIE: return new NYStyleVeggiePizza();
            case CLAM: return new NYStyleClamPizza();
            case PEPPERONI: return new NYStylePepperoniPizza();
            default: return null;
        }
    }
}
