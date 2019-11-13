package com.cskaoyan.proxy;

public class HouseOwner implements RentHouse {
    @Override
    public boolean rent(long money) {
        if (money >= 2500)
            return true;
        return false;
    }
}
