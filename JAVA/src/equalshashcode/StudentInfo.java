package equalshashcode;

public class StudentInfo {

	public static void main(String[] args) {
		Student student = new Student(1, "John", "23 East, California");
		Student student2 = new Student(1, "John1", "231 East, California");
		Student student3 = new Student(1, "John", "23 East, California");
		
		System.out.println(student.equals(student2));
	
	}

}
