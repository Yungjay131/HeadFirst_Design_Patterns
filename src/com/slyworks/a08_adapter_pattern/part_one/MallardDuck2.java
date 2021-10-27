package com.slyworks.a08_adapter_pattern.part_one;

public class MallardDuck2 implements DuckBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
