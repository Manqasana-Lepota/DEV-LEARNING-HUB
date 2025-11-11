package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class SpringBeanLifeCycleApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        StudentDAO studentDAO = applicationContext.getBean("studentDAO", StudentDAO.class);
        System.out.println(studentDAO);
        studentDAO.selectAllRows();
        applicationContext.close();
	}

}
