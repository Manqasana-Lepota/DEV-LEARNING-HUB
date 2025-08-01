package staticdemo;

public class StaticDemo {

	public static void main(String[] args) {
		
		Student std = new Student("John", 25, "23 East, Califonia");
		
		System.out.println("Name: " + std.getName());
		System.out.println("Age: " + std.getAge());
		System.out.println("Address: " + std.getAddress());
		System.out.println("College: " + Student.college);

	}

}
