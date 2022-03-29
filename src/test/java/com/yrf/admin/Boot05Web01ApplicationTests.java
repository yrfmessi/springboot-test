package com.yrf.admin;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
@Slf4j
class Boot05Web01ApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {
        //jdbcTemplate.queryForList("select * from t_user");

//        Long aLong = jdbcTemplate.queryForObject("select count(*) from t_user", Long.class);
//        log.info("记录总数:" + aLong);

        log.info("数据源类型" + dataSource.getClass());
    }

}
