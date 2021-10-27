package com.slyworks.a13_state_pattern;

public class WinnerState implements State {
    //region Vars
    private GumballMachine mGumballMachine2;
    //endregion

//  some code in the HasQuarterState
    public WinnerState(GumballMachine machine) {
        this.mGumballMachine2 = machine;
    }

    @Override
    public void dispense() {
        mGumballMachine2.releaseBall();

        if( mGumballMachine2.getCount() == 0)
            mGumballMachine2.setState(mGumballMachine2.getSoldOutState());
        else {
            mGumballMachine2.releaseBall();

            System.out.println("YOU WON..you got 2 gumballs instead of 1");

            if( mGumballMachine2.getCount() > 0)
                mGumballMachine2.setState(mGumballMachine2.getNoQuarterState());
            else {
                System.out.println("oops..out of gumballs");
                mGumballMachine2.setState(mGumballMachine2.getSoldOutState());
            }
        }

    }
}
