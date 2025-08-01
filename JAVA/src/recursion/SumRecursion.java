package recursion;

public class SumRecursion {
	
	public static int sum(int n) {
		if (n == 1) return 1;
		return n + sum(n - 1);
		
	}

	public static void main(String[] args) {
		
		 System.out.println("Sum of first 5 numbers: " + sum(5));
		
	}

}
