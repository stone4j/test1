package com.cskaoyan.factory;

import com.cskaoyan.bean.Byd;
import com.cskaoyan.bean.Car;

public class BydFactory implements CarFactory{
    @Override
    public Car create() {
        return new Byd();
    }
}
