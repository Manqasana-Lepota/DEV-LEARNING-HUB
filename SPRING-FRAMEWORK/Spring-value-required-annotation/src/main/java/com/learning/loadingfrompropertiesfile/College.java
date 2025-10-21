package com.learning.loadingfrompropertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class College {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("beans.xml file loaded");
        Student stud = applicationContext.getBean("student", Student.class);
        stud.displayStudentInfo();
    }
}
