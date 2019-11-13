package com.cskaoyan.mytest;

import com.cskaoyan.bean.Human;
import com.cskaoyan.builder.HumanBuilder;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void mytest(){
        HumanBuilder humanBuilder = new HumanBuilder();
        humanBuilder.setHeadEq(1000);
        Human build = humanBuilder.build();
        System.out.println(build);
    }
}
