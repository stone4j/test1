package com.cskaoyan.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int selectMoneyById(int id) {
        String sql = "select money from j12_account_t where id = ?";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class, id);
        return integer;
    }

    @Override
    public void updateMoneyById(int id, int money) {
        String sql = "update j12_account_t set money = ? where id =?";
        jdbcTemplate.update(sql,money,id);
    }
}
