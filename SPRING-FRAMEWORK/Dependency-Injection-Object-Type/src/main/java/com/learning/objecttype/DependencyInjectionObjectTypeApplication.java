package com.learning.objecttype;


import com.learning.objecttype.setterinjection.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionObjectTypeApplication {

	public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextSI.xml");

        Student student = applicationContext.getBean("stud", Student.class);

        student.displayStudentInfo();
	}

}
