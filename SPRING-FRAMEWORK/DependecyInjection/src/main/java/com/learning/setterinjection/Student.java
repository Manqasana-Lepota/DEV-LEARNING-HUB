package com.learning.setterinjection;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String course;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
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
