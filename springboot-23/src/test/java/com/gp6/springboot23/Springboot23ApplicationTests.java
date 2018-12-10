package com.gp6.springboot23;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot23ApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        // 数据源class com.zaxxer.hikari.HikariDataSource
        System.out.println("数据源" + dataSource.getClass());

        Connection connection = dataSource.getConnection();
        // 连接HikariProxyConnection@102577332 wrapping com.mysql.cj.jdbc.ConnectionImpl@588307f7
        System.out.println("连接" + connection);
        connection.close();
    }
}
