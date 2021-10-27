package com.slyworks.a01_strategy_pattern;

public class FlyWithWings implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
