package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetOperationsExample {

	public static void main(String[] args) {
		
		Set<Integer> hashSet1 = new HashSet<Integer>();
		
		hashSet1.add(100);
		hashSet1.add(200);
		hashSet1.add(300);
		hashSet1.add(400);
		hashSet1.add(500);
		hashSet1.add(600);
		
		Set<Integer> hashSet2 = new HashSet<Integer>();
		
		hashSet2.add(100);
		hashSet2.add(200);
		hashSet2.add(300);
		hashSet2.add(400);
		hashSet2.add(500);
		hashSet1.add(700);
		
		// To find Union between Two Sets
		Set<Integer> unionSet = new HashSet<Integer>(hashSet1);
		unionSet.addAll(hashSet2);
		System.out.println(unionSet);
		
		// To find Intersaction  between Two Sets
		Set<Integer> intersectionSet = new HashSet<Integer>(hashSet1);
		intersectionSet.retainAll(hashSet2);
		System.out.println(intersectionSet);
		
		// To find symmetric difference between Two Sets
		Set<Integer> differenceSet = new HashSet<Integer>(hashSet1);
		differenceSet.removeAll(hashSet2);
		System.out.println(differenceSet);
		
		
		
	}
}
