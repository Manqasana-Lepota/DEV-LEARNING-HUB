package com.learning.variables;

public class Variables {
    public static void main(String[] args) {
        String car = "Hyundai";
        String color = "red";
        int year = 2025;
        char currency = 'R';
        double price = 1200000.00;
        boolean forSale = false;

        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if(forSale) {
            System.out.println("There is a " + car + " for sale");
        }
        else {
            System.out.println("The " + car + " is not for sale.");

        }
    }
}
