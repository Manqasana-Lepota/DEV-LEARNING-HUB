package methodoverloading;

public class MethodOverloadingDemo {
	
	public int multiply(int x, int y) {
		return (x * y);
	}
	
	public int multiply(int x, int y, int z) {
		return (x * y * z);
	}
	

	public double multiply(double x, double y) {
		return (x * y);
	}
	
	public double multiply(double x, double y, double z) {
		return (x * y * z);
	}
	
	
	public static void main(String args []) {
		
		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		System.out.println("Multiplying two integer : " + demo.multiply(10, 20));
		System.out.println("Multiplying three integer : " + demo.multiply(10, 20, 30));
		System.out.println("Multiplying two double numbers : " + demo.multiply(10.5, 20.5));
		System.out.println("Multiplying three double numbers : " + demo.multiply(10.5, 20.5, 30.5));
		
	}

}

