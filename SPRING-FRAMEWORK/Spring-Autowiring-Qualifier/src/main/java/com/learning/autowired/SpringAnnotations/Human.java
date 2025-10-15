package com.learning.autowired.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    @Autowired
    @Qualifier("humanHeart")
    private Heart heart;

    public  void startPumping() {
        if (heart != null) {
            heart.pump();
            System.out.println("name of the animal is : " + heart.getNameOfAnimal() +
                    " no of heart present : " + heart.getNoOfHeart());
        }
        else {
            System.out.println("You are dead");
        }
    }

}
