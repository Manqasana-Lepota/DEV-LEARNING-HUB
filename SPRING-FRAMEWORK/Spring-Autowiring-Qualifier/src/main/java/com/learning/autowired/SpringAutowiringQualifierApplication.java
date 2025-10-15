package com.learning.autowired;

import com.learning.autowired.SpringAnnotations.Human;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAutowiringQualifierApplication {

	public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Human human = context.getBean("human", Human.class);
        human.startPumping();
	}

}
