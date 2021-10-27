package com.slyworks.a14_proxy_pattern.remote_proxy;

/*this project serves as a continuation from where the a_13_state_pattern stopped
  simply refactoring ot test the Proxy Design Pattern */
public class GumballMachine2 {
    //region Vars
    private double[] mLocation;
    private int mCount = 0;

    private State2 mCurrentState;

    private State2 mSoldOutState;
    private State2 mNoQuarterState;
    private State2 mHasQuarterState;
    private State2 mSoldState;

    private State2 mWinnerState;
    //endregion

    public GumballMachine2(double[] location, int numberOfGumballs){
        this.mLocation = location;
        this.mCount = numberOfGumballs;

        initStates();
    }

    private void initStates(){
        mSoldOutState = new SoldOutState2(this);
        mNoQuarterState = new NoQuarterState2(this);
        mHasQuarterState = new HasQuarterState2(this);
        mSoldState = new SoldState2(this);

        mWinnerState = new WinnerState2(this);

        mCurrentState = (mCount > 0) ? mNoQuarterState : mSoldOutState;
    }
    public void setState(State2 state){
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

    public State2 getCurrentState(){
        return mCurrentState;
    }

    public int getCount(){ return mCount; }

    public State2 getSoldOutState() {
        return mSoldOutState;
    }

    public State2 getNoQuarterState() {
        return mNoQuarterState;
    }

    public State2 getHasQuarterState() {
        return mHasQuarterState;
    }

    public State2 getSoldState() {
        return mSoldState;
    }

    public State2 getWinnerState() {
        return mWinnerState;
    }

    public double[] getLocation(){ return mLocation;  }
}
