package com.slyworks.a13_state_pattern;

public interface State {
    default void insertQuarter(){
        System.out.println("You inserted a quarter");
    };

    default void ejectQuarter(){
        System.out.println("You haven't inserted a quarter");
    };

    default void turnCrank(){
        System.out.println("You turned but there's no quarter");
    };

    default void dispense(){
        System.out.println("You need to pay first");
    };

}
