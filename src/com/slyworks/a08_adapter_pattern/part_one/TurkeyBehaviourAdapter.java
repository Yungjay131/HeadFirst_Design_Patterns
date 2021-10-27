package com.slyworks.a08_adapter_pattern.part_one;

public class TurkeyBehaviourAdapter implements DuckBehaviour{
    //region Vars
    private TurkeyBehaviour turkeyBehaviour;
    //endregion

    public TurkeyBehaviourAdapter(TurkeyBehaviour turkeyBehaviour){
        this.turkeyBehaviour = turkeyBehaviour;
    }

    @Override
    public void quack() {
        turkeyBehaviour.gobble();
    }

    @Override
    public void fly() {
        turkeyBehaviour.fly();
    }
}
