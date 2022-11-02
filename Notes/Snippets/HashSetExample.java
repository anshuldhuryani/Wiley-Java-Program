
Set:
	
	- An interface that extends Collection.
	- A set is an unordered collection of objects.
	- No duplicates are allowed in Set.
	- HashSet, LinkedHashSet and TreeSet Classes
	- All basic operations like, add, remove, size and clear are available in Set interface.
	
/* ***************************************** */

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

/* ***************************************** */

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



	