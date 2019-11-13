package com.cskaoyan.mytest;

import com.cskaoyan.proxy.HouseOwner;
import com.cskaoyan.proxy.HouseProxy;
import com.cskaoyan.proxy.RentHouse;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyTest {
    @Test
    public void mytest1(){
        HouseOwner houseOwner = new HouseOwner();
        System.out.println(houseOwner.rent(2500));

        HouseProxy houseProxy = new HouseProxy();
        System.out.println(houseProxy.rent(2500));
        System.out.println(houseProxy.rent(3000));
        //Proxy.newProxyInstance()
    }

    @Test
    public void mytest2(){
        HouseOwner houseOwner = new HouseOwner();
        RentHouse houseOwnerProxy = (RentHouse) Proxy.newProxyInstance(houseOwner.getClass().getClassLoader(), houseOwner.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName());
                System.out.println(Arrays.toString(args));

                if ("rent".equals(method.getName())){
                    args[0] = (long)args[0] - 500;
                }
                Object invoke = method.invoke(houseOwner, args);

                return invoke;
            }
        });

        boolean rent = houseOwnerProxy.rent(2500);
        System.out.println(rent);

    }

    @Test
    public void mytest(){
        HouseOwner houseOwner = new HouseOwner();
        HouseOwner houseOwnerProxy = (HouseOwner) Enhancer.create(HouseOwner.class, new org.springframework.cglib.proxy.InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                if ("rent".equals(method.getName())){
                    args[0] = (long)args[0] - 500;
                }
                Object invoke = method.invoke(houseOwner, args);
                return invoke;
            }
        });
        System.out.println(houseOwnerProxy.rent(2500));
    }
}
