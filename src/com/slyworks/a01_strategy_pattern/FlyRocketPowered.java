package com.slyworks.a01_strategy_pattern;

public class FlyRocketPowered implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("yeah, i'm a super duck with a rocket!!!");
    }
}
