package com.cskaoyan.bean;

import com.cskaoyan.bean.component.Arm;
import com.cskaoyan.bean.component.Head;
import com.cskaoyan.bean.component.Leg;
import lombok.Data;

@Data
public class Human {

    Arm arm = new Arm();
    Leg leg = new Leg();
    Head head = new Head();



    @Override
    public String toString() {
        return "Human{" +
                "arm=" + arm +
                ", leg=" + leg +
                ", head=" + head +
                '}';
    }
}
