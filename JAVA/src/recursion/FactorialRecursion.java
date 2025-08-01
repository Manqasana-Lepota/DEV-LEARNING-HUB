package recursion;

public class FactorialRecursion {
	
	public static int factorial(int n) {
		if ((n == 0) || (n == 1)) {
			return 1;
		}
		return n * factorial(n - 1);
	
		
	}

	public static void main(String[] args) {
		
		
		System.out.println("Factorial of 5 is: " + factorial(5));
		System.out.println("Factorial of 4 is: " + factorial(4));
		System.out.println("Factorial of 3 is: " + factorial(3));
		System.out.println("Factorial of 2 is: " + factorial(2));
		System.out.println("Factorial of 1 is: " + factorial(1));
		
		

	}

}
