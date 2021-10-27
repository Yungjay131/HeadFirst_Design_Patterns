package com.slyworks.a14_proxy_pattern.remote_proxy;

public class SoldOutState2 implements State2 {
    //region Vars
    public static final long serialVersionUID = 2L;
    private transient GumballMachine2 mGumballMachine2;
    //endregion


    public SoldOutState2(GumballMachine2 machine) {
        this.mGumballMachine2 = machine;
    }

    //shouldn't be able to do anything until the gumballMachine is filled
    @Override
    public void turnCrank() {
        System.out.println("sorry this machine is all out...");
        //gumballMachine.setState(gumballMachine.getSoldOutState());
    }
}
