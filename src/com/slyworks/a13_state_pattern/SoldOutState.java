package com.slyworks.a13_state_pattern;

public class SoldOutState implements State {
    //region Vars
    private GumballMachine mGumballMachine2;
    //endregion


    public SoldOutState(GumballMachine machine) {
        this.mGumballMachine2 = machine;
    }

    //shouldn't be able to do anything until the gumballMachine is filled
    @Override
    public void turnCrank() {
        System.out.println("sorry this machine is all out...");
        //gumballMachine.setState(gumballMachine.getSoldOutState());
    }
}
