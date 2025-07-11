package DataTypes;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		
		//String example
		String greeting = "Hello, Java!";
		System.out.println("String: " + greeting);
		
		//Array example
		int[] numbers = {10, 20, 30, 40, 50};
		System.out.println("Array values:");
		for (int number : numbers) {
			System.out.println(number);
		}
		
		// Object example
		Person person1 = new Person("Manqasana", 25);
		System.out.println("Person details:");
		person1.displayInfo();

	}

}
