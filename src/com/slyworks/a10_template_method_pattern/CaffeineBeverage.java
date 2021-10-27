package com.slyworks.a10_template_method_pattern;

public abstract class CaffeineBeverage {
//    declared final to prevent subclasses from reworking the order
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();

        if(shouldCondimentsBeAdded()){ addCondiments(); }

        hookTwo();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    //this is a hook cause subclasses can now decide if there should be condiments or not
    public boolean shouldCondimentsBeAdded(){
        return true;
    }

    public <T> void hookOne(T t){ }
    public void hookTwo(){ }
}
