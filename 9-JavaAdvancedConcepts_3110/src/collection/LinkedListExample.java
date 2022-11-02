package collection;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList<String> preList = new LinkedList<String>();
		preList.add("Amit");
		preList.add("Rohit");
		preList.add("Sumit");
		
		LinkedList<String> list = new LinkedList<String>();
		
		// Adding Elements to LinkedList
		list.add("King");
		list.add("Gautam");
		list.add("Kochhar");
		list.add("Shreya");
		list.add("Gautam");
		list.addFirst("Bhawna");
		list.addLast("Gunwani");
		list.addAll(preList);
		System.out.println(list);
		
		// To get Element from specific Index
		System.out.println(list.get(0));
		System.out.println(list.get(2));		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		// To update element at specific index
		list.set(0, "Trainer Bhawna");
		System.out.println(list);
		
		// To check whether contains the element or not:
		System.out.println(list.contains("Gunwani"));
	
		Object obj = list.poll();
		System.out.println("Element removed is : " + obj);
		obj = list.pollFirst();
		System.out.println("Element removed is : " + obj);
		obj = list.pollLast();
		System.out.println("Element removed is : " + obj);		
		
		list.removeFirstOccurrence("Gautam");
		list.removeLastOccurrence("Gautam");
		
		System.out.println(list);
		
		System.out.println("To check the size of List: " + list.size());
		
		
		// To remove elements from List
		list.remove("Gautam");
		list.removeFirst();
		list.removeLast();
		list.removeAll(preList);
		list.clear();
		System.out.println(list);
		
		
		
		
	}

}
