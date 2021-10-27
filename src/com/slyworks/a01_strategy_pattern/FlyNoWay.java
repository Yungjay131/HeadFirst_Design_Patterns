package com.slyworks.a01_strategy_pattern;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}
