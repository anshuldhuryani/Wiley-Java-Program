
LinkedHashSet:

	- Implementation of set Interface.
	- Only contains unique elements, doesn't allow duplicates.
	- Maintains the insertion order.
	- Also null values but no duplicates of it.
	- Non-Synchronized.
	
package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> list = new LinkedHashSet<String>();
		list.add("Element One");
		list.add("Element Two");
		list.add("Element Three");
		list.add("Element Four");
		
		System.out.println(list);
		list.add("Element One");
		System.out.println(list);
		list.add(null);
		list.add(null);
		System.out.println(list);

		System.out.println(list);
		
		Iterator<String> iter=list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}
