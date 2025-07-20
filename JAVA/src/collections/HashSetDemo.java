package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("A");
		hashSet.add("B");
		boolean r1 = hashSet.add("C");
		boolean r2 = hashSet.add("C");
		
		System.out.println(hashSet);
		
		System.out.println("Set contains C or not? " + hashSet.contains("C"));
		
		hashSet.remove("A");
		
		System.out.println("Set after removing A:" + hashSet);
		
		for(String item: hashSet) {
			System.out.println(item);
		}
		


	}

}
