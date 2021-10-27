package com.slyworks.a14_proxy_pattern.protection_proxy;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        new Test().drive();
    }

    public void drive(){
        var handler = new HandlerUtil();

        String[] interests = {"football", "watching movies"};
        String[] interests2 = {"reading", "talking with friends"};
        PersonBean joe = new PersonBeanImpl.Builder("male", "joe")
                .interests(interests)
                .build();

        PersonBean ownerProxy = getOwnerProxy(joe);

        System.out.println("Name is "+ ownerProxy.getName());

        ownerProxy.setInterests(null);

        try{
            ownerProxy.setHotOrNotRating(10);
        }catch (Exception e){
            System.out.println("can't set rating as User");
        }

        System.out.println("rating is "+ ownerProxy.getHotOrNotRating());

        /*==============================================================*/
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);

        System.out.println("Name is "+ nonOwnerProxy.getName());

        try{
            nonOwnerProxy.setInterests(interests2);
        }catch (Exception e){
            System.out.println("can't set user interests as non-user");
        }

        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non-owner proxy");
        System.out.println("rating is "+ ownerProxy.getHotOrNotRating());

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
}
