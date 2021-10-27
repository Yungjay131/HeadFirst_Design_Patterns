package com.slyworks.a14_proxy_pattern.remote_proxy;

import java.util.Random;

public class HasQuarterState2 implements State2 {
    //region Vars
    public static final long serialVersionUID = 2L;
    private transient GumballMachine2 mGumballMachine2;

    private Random randomWinner = new Random(System.currentTimeMillis());
    //endregion


    public HasQuarterState2(GumballMachine2 machine) {
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
