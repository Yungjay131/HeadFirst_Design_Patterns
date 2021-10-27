package com.slyworks.a04_simple_factory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(Type type) {
        switch(type){
            case CHEESE,VEGGIE,CLAM,PEPPERONI: new ChicagoStyleCheesePizza();
            default:return new ChicagoStyleCheesePizza();
        }
    }
}
