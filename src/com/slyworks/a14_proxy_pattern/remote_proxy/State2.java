package com.slyworks.a14_proxy_pattern.remote_proxy;

public interface State2 {
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
