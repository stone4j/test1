package com.cskaoyan.builder;

import com.cskaoyan.bean.Human;

public class HumanBuilder {

    Human human = new Human();
    public void setHeadIq(long iq){
        human.getHead().setIq(iq);

    }
    public void setHeadEq(long eq){
        human.getHead().setEq(eq);
    }

    public Human build(){
        return human;
    }
}
