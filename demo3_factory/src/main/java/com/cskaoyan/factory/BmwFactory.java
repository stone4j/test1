package com.cskaoyan.factory;

import com.cskaoyan.bean.Bmw;
import com.cskaoyan.bean.Car;

public class BmwFactory implements CarFactory{
    @Override
    public Car create() {
        return new Bmw();
    }
}
