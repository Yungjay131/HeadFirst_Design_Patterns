package com.slyworks.a01_strategy_pattern;

public class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
