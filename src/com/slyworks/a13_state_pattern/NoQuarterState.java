package com.slyworks.a13_state_pattern;

public class NoQuarterState implements State {
    //region Vars
    private GumballMachine mGumballMachine2;
    //endregion


    public NoQuarterState(GumballMachine machine) {
        this.mGumballMachine2 = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        mGumballMachine2.setState(mGumballMachine2.getHasQuarterState());
    }

    //no longer necessary to implement all methods as the default implementation
    //would suffice for some states
    /*@Override
    public void ejectQuarter() { }

    @Override
    public void turnCrank() { }

    @Override
    public void dispense() { }*/
}
