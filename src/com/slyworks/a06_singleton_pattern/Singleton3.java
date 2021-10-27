package com.slyworks.a06_singleton_pattern;

public class Singleton3 {
    //to avoid issues with multithreading
    //#3:use "double-checked locking" to reduce the use of synchronization in getInstance()
    //note doesn't work on java1.4 or earlier

    private volatile static Singleton3 INSTANCE;

    private Singleton3(){}

    /*
    to avoid unnecessary synchronized locking, first check
    if there is a valid INSTANCE, if not then enter the synchronized
    block, once in the synchronized block, check again,if its still null
    then instantiate a new instance
     */
    public static Singleton3 getInstance(){
        if(INSTANCE == null){
            synchronized (Singleton3.class){
                if(INSTANCE == null){
                    INSTANCE = new Singleton3();
                }
            }
        }

        return INSTANCE;
    }
}
