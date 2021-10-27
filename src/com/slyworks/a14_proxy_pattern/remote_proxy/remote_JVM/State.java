package com.slyworks.a14_proxy_pattern.remote_proxy.remote_JVM;

import java.io.Serializable;

/*everything associated with this system has to be serializable inorder
* to be transmitted over the network
* som tweaking had to be done in the individual state implementations outside this package*/
public interface State extends Serializable {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
