package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(10);
		treeSet.add(60);
		treeSet.add(80);
		treeSet.add(30);
		
		System.out.println(treeSet);
		
		// Iterate the elements
		Iterator<Integer> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// To check if treeset is empty or not:
		if(treeSet.isEmpty())
			System.out.println("Empty");
		else
			System.out.println("Not Empty");
		
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		treeSet.remove(61);
		System.out.println(treeSet);
		
	}
}
