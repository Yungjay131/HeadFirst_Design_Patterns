package com.slyworks.a13_state_pattern;

import java.util.Random;

public class HasQuarterState implements State{
    //region Vars
    private GumballMachine mGumballMachine2;

    private Random randomWinner = new Random(System.currentTimeMillis());
    //endregion


    public HasQuarterState(GumballMachine machine) {
        this.mGumballMachine2 = machine;
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        mGumballMachine2.setState(mGumballMachine2.getNoQuarterState());

        mGumballMachine2.ejectQuarter();
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");

        int winningNumber = randomWinner.nextInt(10);

        boolean conditionOne = winningNumber == 0;
        boolean conditionTwo = mGumballMachine2.getCount() > 1;

        if(conditionOne && conditionTwo) {
            mGumballMachine2.setState(mGumballMachine2.getWinnerState());
        }else {
            mGumballMachine2.releaseBall();

            mGumballMachine2.setState(mGumballMachine2.getSoldState());
        }

    }


}
