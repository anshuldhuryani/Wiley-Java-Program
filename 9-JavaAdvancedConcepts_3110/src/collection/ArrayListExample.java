package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// Adding Elements to ArrayList
		arrayList.add("King");
		arrayList.add("Kochhar");
		arrayList.add("Shreya");
		arrayList.add(1, "Bhawna");
		
		// Iterate ArrayList using For Loop
		for (int i = 0; i < arrayList.size(); i++) {
				System.out.println(arrayList.get(i));
		}
		
		System.out.println("*********************");
		
		// Iterate ArrayList using For each Loop
		for (String value : arrayList) {
			System.out.println(value);
		}
		
		System.out.println("*********************");
		
		// Iterate ArrayList using While Loop
		int count = 0;
		while(count < arrayList.size()) {
			System.out.println(arrayList.get(count));
			count++;
		}
		
		System.out.println("*********************");

		// Iterate ArrayList using Iterator
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());

		
	}
	
}
