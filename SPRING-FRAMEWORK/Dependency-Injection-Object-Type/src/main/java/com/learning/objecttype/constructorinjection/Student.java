package com.learning.objecttype.constructorinjection;

public class Student {
    private int id;
    private String name;
    private Address address;

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID : " + id);
        System.out.println("Student Name : " + name);
        address.displayAddress();
    }
}
