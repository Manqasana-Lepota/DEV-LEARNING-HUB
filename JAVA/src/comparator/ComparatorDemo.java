package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
	ArrayList<Student> list = new ArrayList<Student>();
		
		Student john = new Student(3, "John", 21);
		Student jane = new Student(1, "Jane", 18);
		Student tom = new Student(2, "Tom", 10);
		
		list.add(john);
		list.add(jane);
		list.add(tom);
		
		Collections.sort(list);
		System.out.println("Students after sorting : ");
		list.forEach(Student -> System.out.println(Student.getName()));
		
		Collections.sort(list, new AgeComparator());
		System.out.println("Students after AGE sorting : ");
		list.forEach(Student -> System.out.println(Student.getName()));
	}

}
