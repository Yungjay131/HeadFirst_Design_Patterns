package com.slyworks.a01_strategy_pattern;

public class MallardDuck extends Duck{
    public MallardDuck(){
        flyBehaviour = new FlyRocketPowered();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

    public void changeFlyBehaviour(){ setFlyBehaviour( new FlyNoWay() ); }
}
