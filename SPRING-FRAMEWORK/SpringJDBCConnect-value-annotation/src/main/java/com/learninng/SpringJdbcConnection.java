package com.learninng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJdbcConnection {

	public static void main(String[] args) throws Exception {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        JDBCConnection jdbcConnection = applicationContext.getBean("jdbc", JDBCConnection.class);
        jdbcConnection.displayJDBC();

        jdbcConnection.getJDBCConnection();

        }
	}


