package com.learning.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Value;


public class Student {
    private String name;
    private String interestedCourse;
    private String hobby;

    @Value("John Smith")
    public void setName(String name) {
        this.name = name;
    }



    @Value("C#, Python and Java")
    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
    }

    @Value("Ruby, Soccer")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void displayStudentInfo() {
        System.out.println("Student name : " + name);
        System.out.println("Student interest course : " + interestedCourse);
        System.out.println("Student hobby : " + hobby);

    }
}
