package methodcalling;

public class MethodCallingDemo {
	
	 // Method definition
	public static void greet() {
        System.out.println("Hello from greet method!");
    }
	
	 // Method definition
	public static int add(int a, int b) {
        return a + b;
	}
	
	 // Method definition
	public static void methodA() {
        System.out.println("Inside Method A");
        methodB();
	}
	
	 // Method definition
	private static void methodB() {
		 System.out.println("Inside Method B");
		
	}
	
	 // Method definition
	 public void displayMessage() {
	        System.out.println("Hello from a non-static method!");
	    }


	public static void main(String[] args) {
		
		 greet();// method call
		 
		 int result = add(5, 3);// method call
		 System.out.println("Sum of two numbers: " + result);
		 
		 methodA();// method call
		 
		 MethodCallingDemo obj = new MethodCallingDemo();
		 obj.displayMessage();// method call
		 
		 
		

	}

}
