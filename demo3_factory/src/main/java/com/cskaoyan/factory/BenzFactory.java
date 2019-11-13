package com.cskaoyan.factory;

import com.cskaoyan.bean.Benz;
import com.cskaoyan.bean.Car;

public class BenzFactory implements CarFactory{
    @Override
    public Car create() {
        return new Benz();
    }
}
