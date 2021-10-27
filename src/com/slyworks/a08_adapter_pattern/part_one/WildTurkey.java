package com.slyworks.a08_adapter_pattern.part_one;

public class WildTurkey implements TurkeyBehaviour {
    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
