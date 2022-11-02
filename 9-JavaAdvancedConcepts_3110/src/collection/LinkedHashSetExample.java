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
