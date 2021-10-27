package com.slyworks.a14_proxy_pattern.protection_proxy;

import java.lang.reflect.*;

public class OwnerInvocationHandler implements InvocationHandler {
    //region Vars
    private PersonBean mPersonBean;
    //endregion


    public OwnerInvocationHandler(PersonBean bean) {
        mPersonBean = bean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws IllegalAccessException {
       PersonBeanMethods _method = HandlerUtil.getObject(method.getName());

       if(_method == null) return null; //meaning its not set any other invalid option would throw an exception

        try{
            return method.invoke(mPersonBean,args);
        }catch (InvocationTargetException ite){
            ite.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

}

