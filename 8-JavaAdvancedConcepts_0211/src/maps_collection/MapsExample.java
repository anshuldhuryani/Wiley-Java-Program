package maps_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap is a hash table based upon map interface. Map helps to store data in
 * key-value pair. Few points to remember: - HashMap cannot contain duplicate
 * keys. - HashMap allows null key or null values, considering no null key
 * duplicates. - HashMap is an unordered collection. - HashMap is not
 * thread-safe.
 */

public class MapsExample {

	public static void main(String[] args) {

		Map<Integer, String> mapData = new HashMap<Integer, String>();

		mapData.put(101, "King Kochhar");
		mapData.put(102, "Shreya Sharma");
		mapData.put(103, "Gautam Bhalla");
		mapData.put(104, "Sarah Bowling");
		mapData.put(105, "John Smith");

		System.out.println(mapData);

		mapData.put(104, "Kyara Smith");
		mapData.putIfAbsent(105, "Bhawna Gunwani");

		System.out.println(mapData);

		System.out.println("HashMap is empty or not ? " + mapData.isEmpty());
		System.out.println("HashMap Size: " + mapData.size());

		int keyCheck = 106;
		// get() method returns null, if the value with key doesn't exist.
		System.out.println("The value of " + keyCheck + " : " + mapData.get(keyCheck));
		if (mapData.containsKey(keyCheck))
			System.out.println(mapData.get(keyCheck));

		String valueCheck = "Bhawna Gunwani";
		if (mapData.containsValue(valueCheck))
			System.out.println("Value exists.");

		// returns boolean value, depending upon map set removed or not.
		boolean removeCheck = mapData.remove(105, "John Smith");
		System.out.println(removeCheck);

		// Store HasMap entry sets to set collection.
		Set<Map.Entry<Integer, String>> entrySets = mapData.entrySet();
		System.out.println(entrySets);

		Set<Integer> keySets = mapData.keySet();
		System.out.println(keySets);

		Collection<String> valueSets = mapData.values();
		System.out.println(valueSets);

		// Iterating HashMaps:

		System.out.println("********************************");

		// Iterating HashMap using forEach loop
		mapData.forEach((pId, pName) -> {
			System.out.println(pId + " : " + pName);
		});
		
		System.out.println("********************************");

		// Iterating HashMap using forEach loop using entrySet() Method:
		mapData.entrySet().forEach((entry) -> {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		});
		
		System.out.println("********************************");
		
		// Iterating HashMap using forEach loop using entrySet() Method:
		mapData.keySet().forEach((personKey) -> {
			System.out.println(personKey + " : " + mapData.get(personKey));
		});

		System.out.println("********************************");

		// Iterating HashSet using Iterator
		Set<Map.Entry<Integer, String>> entrySetsData = mapData.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator = entrySetsData.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("********************************");
		
		// Iterating HashMap using enhanced for loop
		for (Map.Entry<Integer, String> entry: mapData.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}


	}

}
