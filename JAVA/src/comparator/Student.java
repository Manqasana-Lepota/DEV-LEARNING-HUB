package comparator;


public class Student implements Comparable<Student> {
	
	private int rollNumber;
	private String name;
	private int age;
	
	public Student(int rollNumber, String name, int age) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		
		Student student = (Student) obj;
		return (student.rollNumber == this.rollNumber);
	}

	@Override
	public int compareTo(Student student) {
		return this.rollNumber - student.rollNumber;
	}
	
	
	
	
	
	

}
