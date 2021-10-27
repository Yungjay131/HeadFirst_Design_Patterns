package com.slyworks.a14_proxy_pattern.remote_proxy;

import java.rmi.*;

public interface MRemote extends Remote{
    //region Vars
    //endregion

    public String displayHello() throws RemoteException;
}
