package com.learning.autowired.SpringXML;

public class Human {

    private Heart heart;

    public Human(Heart heart) {
        this.heart = heart;
        System.out.println("From Constructor method");
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
        System.out.println("From Setter method");
    }

    public void startPumping () {
        if (heart != null) {
            heart.pump();
        }
        else {
            System.out.println("You are dead");
        }
    }
}
