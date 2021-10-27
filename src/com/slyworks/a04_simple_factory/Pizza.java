package com.slyworks.a04_simple_factory;

import java.util.ArrayList;

public abstract class Pizza {
    //region Vars
    protected String abs_name;
    protected String abs_dough;
    protected String abs_sauce;

    protected ArrayList<String> abs_toppings = new ArrayList<>();
    //endregion

    void prepare(){
        System.out.println("preparing");
    }
    void bake(){
        System.out.println("baking");
    }
    void cut(){
        System.out.println("cutting");
    }
    void box(){
        System.out.println("boxing");
    }

    public String getName(){
        return abs_name;
    }
}
