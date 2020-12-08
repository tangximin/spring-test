package com.tennis.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends JdbcDaoSupport {

    public void add(){
        String sql = "INSERT INTO `area`( `area_id`, `area_name`, `parent_area_id`, `level`, `area_code`) " +
                "VALUES (1, '北京test', 0, 1, 110000)";
               getJdbcTemplate().execute(sql);
    }

}
