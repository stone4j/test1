package com.cskaoyan.dao;

public interface AccountDao {
    int selectMoneyById(int id);

    void updateMoneyById(int id,int money);
}
