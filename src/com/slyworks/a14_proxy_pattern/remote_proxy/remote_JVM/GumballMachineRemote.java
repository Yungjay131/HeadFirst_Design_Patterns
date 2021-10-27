package com.slyworks.a14_proxy_pattern.remote_proxy.remote_JVM;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
   public int getCount() throws RemoteException;
   public String getLocation() throws RemoteException;
   public State getState() throws RemoteException;
}
