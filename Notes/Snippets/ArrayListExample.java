
/*

ArrayList Class: 

	- ArrayList Class implements List Interface.
	- This class allows duplicated values.
	- Here, elements can be accessing using index or with element value.
	- We can also use iterator or ListIterator to access the elements.
	- The elements here in ArrayList can grow or shrink dynamically.
	
*/

/* ************************************************************* */	

package arraylist;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// Adding Elements to ArrayList
		arrayList.add("King");
		arrayList.add("Kochhar");
		arrayList.add("Shreya");
		arrayList.add(1, "Bhawna");

		System.out.println(arrayList);
		
		// Remove Element from ArrayList
		arrayList.remove("Bhawna");
		arrayList.remove(1);
		
		System.out.println(arrayList);
		
		// Update ArrayList Element
		arrayList.set(0, "John");
		
		System.out.println(arrayList);
		
		// To get index of an element from Element
		System.out.println(arrayList.indexOf("Johnn"));
		
		// To get the Object from ArrayLIst
		System.out.println(arrayList.get(0));
		
		// To get the size of the ArrayList
		System.out.println(arrayList.size());
		
		// To check whether ArrayList contains the element or not
		System.out.println(arrayList.contains("John"));
		
		// To remove all the elements from ArrayList
		arrayList.clear();
		System.out.println(arrayList.isEmpty());
		
	}
	
}

/* ************************************************************* */	

/*

	ArrayList can be iterated in four ways:
	
		- Using For Loop
		- Using Enchanced For Loop
		- While Loop
		- Iterator

*/

package arraylist;

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
