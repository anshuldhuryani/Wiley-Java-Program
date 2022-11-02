package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIteratorExample {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		// Adding Elements to LinkedList
		list.add("King");
		list.add("Gautam");
		list.add("Kochhar");
		list.add("Shreya");
		list.add("Gautam");
		// using for loop

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");

		}
		System.out.println();
		System.out.println("============================");
		for (String s : list) {
			System.out.print(s + ", ");

		}

		// iterator
		System.out.println();
		System.out.println("============================");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + ", ");

		}
		System.out.println();
		System.out.println("============================");

	}

}
