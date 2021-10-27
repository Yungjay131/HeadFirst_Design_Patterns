package com.slyworks.a14_proxy_pattern.remote_proxy;


public class NoQuarterState2 implements State2 {
    //region Vars
    public static final long serialVersionUID = 2L;
    private transient GumballMachine2 mGumballMachine2;
    //endregion


    public NoQuarterState2(GumballMachine2 machine) {
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
