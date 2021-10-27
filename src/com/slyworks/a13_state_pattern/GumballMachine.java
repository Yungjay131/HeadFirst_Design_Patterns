package com.slyworks.a13_state_pattern;

public class GumballMachine {
    //region Vars
    private int mCount = 0;
    private Status mCurrentStatus = Status.NOT_SET;

    private State mCurrentState;

    private State mSoldOutState;
    private State mNoQuarterState;
    private State mHasQuarterState;
    private State mSoldState;

    private State mWinnerState;
    //endregion

    public GumballMachine(int numberOfGumballs) {
        mSoldOutState = new SoldOutState(this);
        mNoQuarterState = new NoQuarterState(this);
        mHasQuarterState = new HasQuarterState(this);
        mSoldState = new SoldState(this);

        mWinnerState = new WinnerState(this);

        this.mCount = numberOfGumballs;
        /*if(numberOfGumballs > 0) mCurrentState = mNoQuarterState;
        else mCurrentState = mSoldOutState;*/

        mCurrentState = (numberOfGumballs > 0) ? mNoQuarterState : mSoldOutState;
        System.out.println(mCurrentState);
    }

    public void setState(State state){
        this.mCurrentState = state;
    }

    public void insertQuarter(){
        mCurrentState.insertQuarter();
    }

    public void ejectQuarter(){
        mCurrentState.ejectQuarter();
    }

    public void turnCrank(){
        mCurrentState.turnCrank();
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");

        if( mCount != 0) mCount--;
    }

    public void refill(int gumballCount){
        mCount += gumballCount;

        //resetting the gumball state
        //mCurrentState.refill();
    }

    public State getCurrentState(){
        return mCurrentState;
    }

    public int getCount(){ return mCount; }

    public State getSoldOutState() {
        return mSoldOutState;
    }

    public State getNoQuarterState() {
        return mNoQuarterState;
    }

    public State getHasQuarterState() {
        return mHasQuarterState;
    }

    public State getSoldState() {
        return mSoldState;
    }

    public State getWinnerState() {
        return mWinnerState;
    }
}
