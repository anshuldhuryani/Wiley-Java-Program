package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList<String> preList = new LinkedList<String>();
		preList.add("King");
		preList.add("Kochhar");
		preList.add("John");
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("King");
		list.add("Kochhar");
		list.add("John");
		
		list.add(1, "Sarah");
		list.addAll(preList);
		list.addFirst("Bhawna");
		list.addLast("Gunwani");
		
		list.removeFirst();
		list.removeLast();
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
