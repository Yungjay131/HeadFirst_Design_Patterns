package com.slyworks.a14_proxy_pattern.remote_proxy;

import java.util.Arrays;

public class GumballMonitor {
    //region Vars
    private GumballMachine2 machine;
    //endregion

    public GumballMonitor(GumballMachine2 machine){
        this.machine = machine;
    }

    public void report(){
        System.out.println("gumball machine: " + Arrays.toString(machine.getLocation()) );
        System.out.println("current inventory: " + machine.getCount() );
        System.out.println("current state: " + machine.getCurrentState() );
    }
}
