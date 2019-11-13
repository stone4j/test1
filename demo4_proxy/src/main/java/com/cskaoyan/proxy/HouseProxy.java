package com.cskaoyan.proxy;

public class HouseProxy extends HouseOwner {
    @Override
    public boolean rent(long money) {
        money -= 500;
        return super.rent(money);
    }
}
