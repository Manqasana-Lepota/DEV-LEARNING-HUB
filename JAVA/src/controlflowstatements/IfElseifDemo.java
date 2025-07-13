package controlflowstatements;

import java.util.Scanner;

public class IfElseifDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testscore;
		char grade;
		// TODO Auto-generated method stub

		System.out.println("Enter your score: ");
		testscore = sc.nextInt();
		
		if (testscore >= 90) {
			grade = 'A';
		}
		else if (testscore >= 80) {
			grade = 'B';
		}
		else if (testscore >= 70) {
			grade = 'C';
		}
		else if (testscore >=60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("Your Grade = " + grade);
	}

}
