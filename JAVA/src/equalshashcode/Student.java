package equalshashcode;

import java.util.Objects;

public class Student {
	
	private int rollNumber;
	private String name;
	private String address;
	
	public Student(int rollNumber, String name, String address) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
	
	
	
	
	
	

}
