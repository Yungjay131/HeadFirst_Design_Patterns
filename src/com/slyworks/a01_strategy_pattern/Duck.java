package com.slyworks.a01_strategy_pattern;

public abstract class Duck {
   //region Vars
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    //endregion

    public Duck(){}

    //to change behaviour dynamically at Runtime
 public void setFlyBehaviour(FlyBehaviour fb){ flyBehaviour = fb; }
 public void setQuackBehaviour(QuackBehaviour qb){ quackBehaviour = qb; }

    public void performFly(){ flyBehaviour.fly(); }
    public void performQuack(){ quackBehaviour.quack(); }
    public void swim(){ System.out.println("All ducks float, even decoys"); }
    public abstract void display();

}
