package com.cskaoyan.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public String selectNameById(int id){
        String s = jdbcTemplate.queryForObject("select username from j12_user_t where id = ?", String.class,id);
        return s;
    }
}
