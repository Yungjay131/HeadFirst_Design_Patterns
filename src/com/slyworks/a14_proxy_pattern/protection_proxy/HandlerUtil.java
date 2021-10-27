package com.slyworks.a14_proxy_pattern.protection_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HandlerUtil {

    public static PersonBeanMethods getObject(String methodName){
        PersonBeanMethods methodType = mapMethodToEnum(methodName);

        try{
            switch (methodType){
                case GET_METHODS:
                case SET_METHODS:
                    return methodType;
                case SET_RATING: throw new IllegalAccessException();
                case NOT_SET: return null;
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public PersonBean getOwnerProxy(PersonBean personBean){
        var classLoader = personBean.getClass().getClassLoader();
        var interfaces = personBean.getClass().getInterfaces();
        var invocationHandler = new OwnerInvocationHandler(personBean);

        System.setSecurityManager(new SecurityManager());

        var person =  Proxy.newProxyInstance(
                classLoader,
                interfaces,
                invocationHandler
        );

        //System.out.println((PersonBean)person);
        return (PersonBean)person;
    }
    public PersonBean getNonOwnerProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean)
        );

    }

    /*public static Proxy getProxy(InvocationHandler handler, PersonBean personBean){

    }*/

    private  static PersonBeanMethods mapMethodToEnum(String methodName){
         if(methodName.startsWith("get"))
             return PersonBeanMethods.GET_METHODS;
         if(methodName.equals("setHotOrNotRating"))
             return PersonBeanMethods.SET_RATING;
         if(methodName.startsWith("set"))
             return PersonBeanMethods.SET_METHODS;
         else
             return PersonBeanMethods.NOT_SET;
    }
}
