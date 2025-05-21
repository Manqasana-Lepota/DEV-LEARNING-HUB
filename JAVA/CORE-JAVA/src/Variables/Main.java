package Variables;

public class Main {
    public static void main(String[] args){

        /*
        Steps to creating a variable
        - declaration
        - Assignment
         */

        int age = 21;
        int year = 2025;
        int quantity = 1;

        double price = 199.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnLine = true;

        String name = "Manqasana Lepota";
        String food = "Ribs";
        String email = "nqhasy@gmail.com";
        String car = "Hyndai";
        String color = "black";


        System.out.println("Hi!, My name is " + name);
        System.out.println("I'm " + age + " years old");
        System.out.println("My gpa is: " + gpa);
        System.out.println("My average letter grade is: " + grade);

        System.out.println("My car is a " + color + " " + year + " " + car);

        System.out.println("The price is: " + currency + " " + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else {
            System.out.println("There is no " + car + " for sale");
        }






    }
}
