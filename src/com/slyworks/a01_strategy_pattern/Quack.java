package com.slyworks.a01_strategy_pattern;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
