package controlflowstatements;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int month;
		String monthString;
		
		System.out.println("Enter number of month you are born : ");
		month = scanner.nextInt();
		
		switch(month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Invalid month";
			break;
		
		}
		System.out.println("Your birthday month is " + monthString);

	}

}
