package loops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int num1;
		int num2;
		int sum;
		char choice;
		
		do {
			System.out.print("Enter your num1: ");
			num1 = sc.nextInt();
			System.out.print("Enter your num2: ");
			num2 = sc.nextInt();
			
			sum = num1 + num2;
			System.out.println("The sum of two numbers is = " + sum);
			
			System.out.println("Do you want to enter another numbers? Yes or No:");
			choice = sc.next().charAt(0);
			 
				

		}while(choice == 'Y' || choice == 'y');
		System.out.println("Thank you for using the calculator!");

	}

}
