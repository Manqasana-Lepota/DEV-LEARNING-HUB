package controlflowstatements;

import java.util.Scanner;

public class NestedIfStatements {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int age;
		
		System.out.println("Enter your age: ");
		age = kb.nextInt();
		
		if (age >= 0) {
			if (age < 13) {
				System.out.println("You're a child.");
			}
			if (age >= 13) {
				if (age <= 17) {
					System.out.println("You're a teenager");
				}
				if (age >= 18) {
					if (age < 65) {
						System.out.println("You're an adult");
						
					}
					if (age >= 65) {
						System.out.println("You're a senior");
					}
				}
			}
			if (age < 0) {
				System.out.println("Invalid age entered.");
			}
		}
		
	
	}

}
