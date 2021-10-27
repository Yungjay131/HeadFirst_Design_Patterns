package com.slyworks.a06_singleton_pattern;

public class Singleton1 {
    //to avoid issues with multithreading
    //#1:use synchronized
    private static Singleton1 INSTANCE;

    private Singleton1(){}

    public static synchronized Singleton1 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton1();
        }

        return INSTANCE;
    }
}
