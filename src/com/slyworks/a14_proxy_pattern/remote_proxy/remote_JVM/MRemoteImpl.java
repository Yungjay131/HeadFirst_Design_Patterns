package com.slyworks.a14_proxy_pattern.remote_proxy.remote_JVM;

import com.slyworks.a14_proxy_pattern.remote_proxy.MRemote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class MRemoteImpl extends UnicastRemoteObject implements MRemote {
    //region Vars
    public static final long serialVersionUID = -1L;
    //endregion


    protected MRemoteImpl() throws RemoteException {
    }

    protected MRemoteImpl(int port) throws RemoteException {
        super(port);
    }

    protected MRemoteImpl(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }

    public static void registerInRMI(){
        /*this method shouldn't be static its content should be directly in main()*/
        try{
            MRemote service = new MRemoteImpl();
            Naming.rebind("RemoteHello", service);
        }catch(Exception e){
           e.printStackTrace();
        }

        /*run rmiregistry after this
        * start service on other machine(this) with java MRemoteImpl*/
    }
    @Override
    public String displayHello() throws RemoteException {
        return "Server says 'that's whatsup'";
    }

    public static void main(String[] args){

    }
}
