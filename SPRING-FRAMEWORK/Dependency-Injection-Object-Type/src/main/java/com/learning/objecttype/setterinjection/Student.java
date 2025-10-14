package com.learning.objecttype.setterinjection;


public class Student {
    private int id;
    private String name;
    private Address address;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID : " + id);
        System.out.println("Student Name : " + name);
        address.displayAddress();
    }
}
