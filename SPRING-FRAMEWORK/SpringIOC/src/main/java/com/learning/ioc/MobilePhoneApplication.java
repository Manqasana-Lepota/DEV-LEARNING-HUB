package com.learning.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobilePhoneApplication {

	public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config loaded:");
//        MTN mtn = (MTN) applicationContext.getBean("mtn");
//        mtn.calling();
//        mtn.data();
//        Telkom telkom = applicationContext.getBean("telkom", Telkom.class);
//        telkom.calling();
//        telkom.data();
        SimCard simCard = applicationContext.getBean("simCard", SimCard.class);
        simCard.calling();
        simCard.data();

	}

}
