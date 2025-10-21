package com.learninng;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;

import static java.lang.Class.forName;

public class JDBCConnection {

    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Value("${db.driver}")
    private String driver;

    public void displayJDBC () {
        System.out.println("url : " + url +
                "\n" + "username : " + username +
                "\n" + "password : " + password +
                "\n" + "driver : " + driver);
    }

    public void getJDBCConnection () throws Exception {
        Class.forName(driver);
        Connection connetion = DriverManager.getConnection(url, username, password);
        System.out.println("Connection successful! " + connetion);
    }
}
