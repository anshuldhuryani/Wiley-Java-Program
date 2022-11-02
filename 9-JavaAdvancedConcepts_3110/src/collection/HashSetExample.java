package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("King");
		hashSet.add("Kochhar");
		hashSet.add("Smith");
		hashSet.add("Gautam");
		
		System.out.println(hashSet);
		
		hashSet.add("Gautam");
		
		System.out.println(hashSet);
		
		hashSet.add(null);
		hashSet.add(null);
		
		System.out.println(hashSet);
		
		
		
		
	}

}
