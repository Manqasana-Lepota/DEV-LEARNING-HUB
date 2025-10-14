package com.learning.constructorinjection;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String course;

    public Student(int studentId, String firstName, String lastName, int age, String course) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
    }

    public void displayStudentInfo() {
        System.out.println("***********Student Information**********");
        System.out.println("ID : " + studentId + "\n"
        + "First Name : " + firstName + "\n"
        + "Last Name: " + lastName + "\n"
        + "Age : " + age + "\n"
        + "Course : " + course);
    }
}
