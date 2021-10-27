package com.slyworks.a14_proxy_pattern.remote_proxy.client;

import com.slyworks.a14_proxy_pattern.remote_proxy.MRemote;

import java.rmi.Naming;

public class MRemoteClient {
    //region Vars
    //endregion

    public static void main(String[] args) {
        /*
        * rememeber that rmiregistry must be running before starting remote service*
        remember to make argumnents and return types serialisable*/
        new MRemoteClient().go();
    }

    public void go(){
        try{
            //TODO:try this while hosting the remote on an AWS server
            MRemote service = (MRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");

            String receivedMessage = service.displayHello();

            System.out.println(receivedMessage);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
