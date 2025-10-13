package com.learning.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDependencyInjectionApp {

	public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterInjectionbeans.xml");

        Student student = applicationContext.getBean("student", Student.class);
        student.displayStudentInfo();

        Student student1 = applicationContext.getBean("student1", Student.class);
        student1.displayStudentInfo();


	}

}
