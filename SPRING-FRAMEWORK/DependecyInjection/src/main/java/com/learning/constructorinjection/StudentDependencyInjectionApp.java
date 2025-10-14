package com.learning.constructorinjection;

import com.learning.constructorinjection.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDependencyInjectionApp {

	public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructorInjectionbeans.xml");

        Student student = applicationContext.getBean("stud", Student.class);
        student.displayStudentInfo();




	}

}
