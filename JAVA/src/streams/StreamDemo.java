package streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> numbersList = new ArrayList<>();
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		numbersList.add(40);
		
//		List<Integer> squaresList = new ArrayList<>();
//		for (Integer i: numbersList) {
//			squaresList.add(i*i);
//		}
		
//		List<Integer> squaresList = numbersList.stream().map(x -> x * x).collect(Collectors.toList());
//		System.out.println("List of squared numbers: " + squaresList);
		
//		Set<Integer> squareSet = new HashSet<>();
//		for (Integer i: numbersList) {
//			squareSet.add(i * i);
//		}
		
//		Set<Integer> squareSet = numbersList.stream().map(x->x*x).collect(Collectors.toSet());
//		System.out.println("Set of squared numbers: " + squareSet);
		
		List<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("Scala");
		languages.add("Python");
		languages.add("Basic");
		languages.add("C#");
		
//		List<String> filterResult = new ArrayList<>();
//		for(String s: filterResult) {
//			if(s.startsWith("P") ) {
//				filterResult.add(s);
//			}
//		}
//		List<String> filterResult = languages.stream().filter(s->s.startsWith("P")).collect(Collectors.toList());
//		System.out.println("Languages starting with 'P': " + filterResult);
		
		List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
		System.out.println("Languages sorted alphabetically: " + sortedList);
		
		System.out.println("printing all elements one by one: ");
		languages.stream().forEach(y-> System.out.println("element is: " + y));
		
		int sum = numbersList.stream().reduce(0, (ans, i)-> ans + i);
		System.out.println("sum of all elements in the numberlist: " + sum);
	
	
	}

}
