package com.slyworks.a13_state_pattern;

public class SoldState implements State{
    //region Vars
    private GumballMachine mGumballMachine2;
    //endregion


    public SoldState(GumballMachine machine) {
        this.mGumballMachine2 = machine;
    }

    @Override
    public void dispense() {
       mGumballMachine2.releaseBall();

       if( mGumballMachine2.getCount() > 0)
           mGumballMachine2.setState(mGumballMachine2.getNoQuarterState());
       else
           System.out.println("oops, out of gumballs");
           mGumballMachine2.setState(mGumballMachine2.getSoldOutState());
    }
}
