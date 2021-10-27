package com.slyworks.a06_singleton_pattern;

public class Singleton2 {
    //to avoid issues with multithreading
    //#2:use an eagerly created instance instead of a lazily created one
    private static Singleton2 INSTANCE = new Singleton2();

    private Singleton2(){}

    public static Singleton2 getInstance(){
        return INSTANCE;
    }
}
