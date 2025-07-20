package operators;

public class ArithmeticDemo {

	public static void main(String[] args) {
		
		// addition operator
		int result = 1 + 2;
		System.out.println("1 + 2 = " + result);
		int original_result = result;
		
		// subtraction
		result = result - 1;
		System.out.println(original_result + " - 1 = " + result);
		original_result = result;
		
		// multiplication
		result = result * 2;
		System.out.println(original_result + " * 2 = " + result);
		original_result = result;
		
		// division
		result = result / 2;
		System.out.println(original_result + " / 2 = " + result);
		original_result = result;
		
		// addition again
		result = result + 8;
		System.out.println(original_result + " + 8 = " + result);
		original_result = result;
		
		// modulus
		result = result % 7;
		System.out.println(original_result + " % 7 = " + result);
		

	}

}
