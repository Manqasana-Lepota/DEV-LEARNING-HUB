package com.learning.objecttype.constructorinjection;

public class Address {
    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public void displayAddress() {
        System.out.println("City : " + city + " , Country : " + country);
    }
}
