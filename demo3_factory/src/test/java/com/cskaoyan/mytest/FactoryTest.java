package com.cskaoyan.mytest;

import com.cskaoyan.bean.Car;
import com.cskaoyan.factory.BmwFactory;
import com.cskaoyan.factory.BydFactory;
import com.cskaoyan.factory.CarFactory;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void mytest1(){
        CarFactory carFactory = new BydFactory();
        Car car = carFactory.create();
        System.out.println(car);
    }
}
