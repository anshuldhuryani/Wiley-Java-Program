
/*

	This Collections is a utility class that consists all static methods that operate or return collections after certain operations.

*/

	List<String> studentNames = new ArrayList<String>();			
	studentNames.add("King Kochhar");
	studentNames.add("Sarah Bowling");
	studentNames.add("King Kochhar");
	studentNames.add("Roger Lee");
	studentNames.add("John Smith");
	// Print Original List Elements
	System.out.println("Original Collection: " + studentNames);
	// Reverse List Elements
	Collections.reverse(studentNames);
	System.out.println("Reversed Collection: " + studentNames);
	// Shuffle List Elements
	Collections.shuffle(studentNames);
	System.out.println("Shuffled Collection: " + studentNames);
	// Check Frequency of Element in Collection
	System.out.println("Occurance of specific element in Collection: " + Collections.frequency(studentNames, "John Smith"));
	
/* ************************************************************* */	


	List<String> studentNames = new ArrayList<String>();
	studentNames.add("King Kochhar");
	studentNames.add("Sarah Bowling");
	studentNames.add("King Hochhar");
	studentNames.add("Roger Lee");
	studentNames.add("John Smith");
	System.out.println("Original Collection List: " + studentNames);
	// Sort this List into ascending Order:
	Collections.sort(studentNames);
	System.out.println("List Sorted in Ascending Order: " + studentNames);
	Collections.reverse(studentNames);
	System.out.println("List Sorted in Decending Order: " + studentNames);
	
/* ************************************************************* */	

/* Demonstrating Comparator Interface for Collection Sorting */

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {
	private int personId;
	private String personName;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}
	
	@Override
	public int compareTo(Person p1) {
		return this.getPersonId() - p1.getPersonId();
	}
}

public class CollectionsUtilityClass {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();
		
		Person person1 = new Person();
		person1.setPersonId(100);
		person1.setPersonName("Ishika");
		
		Person person2 = new Person();
		person2.setPersonId(30);
		person2.setPersonName("Aman");
		
		Person person3 = new Person();
		person3.setPersonId(200);
		person3.setPersonName("Gautam");
		
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		
		// Sorting Persons by person compare Method
		// Collections.sort(persons, Comparator.comparing(Person::getPersonId));
		System.out.println(persons);
		
		
	}
}

/* ************************************************************* */	

/* Demonstrating Comparator Interface for Collection Sorting */

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
	private int personId;
	private String personName;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}
	
//	@Override
//	public int compareTo(Person p1) {
//		return this.getPersonId() - p1.getPersonId();
//	}
}

public class ArraysUtilityClassExample {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();
		
		Person person1 = new Person();
		person1.setPersonId(100);
		person1.setPersonName("Ishika");
		
		Person person2 = new Person();
		person2.setPersonId(30);
		person2.setPersonName("Aman");
		
		Person person3 = new Person();
		person3.setPersonId(200);
		person3.setPersonName("Gautam");
		
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		
		// Sorting Persons by person compare Method
		Collections.sort(persons, Comparator.comparing(Person::getPersonId));
		// Collections.sort(persons);
		System.out.println(persons);
		
		
	}
}

/* ************************************************************* */	

/* Demonstrating Comparator Interface for Collection Sorting */


package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int personId;
	private String personName;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}

	public static Comparator<Person> idComparator = new Comparator<Person>() {
		@Override
		public int compare(Person p1, Person p2) {
			return p1.personId - p2.personId;
		}
	};
	
	public static Comparator<Person> nameComparator = new Comparator<Person>() {
		@Override
		public int compare(Person p1, Person p2) {
			return p1.personName.compareTo(p2.personName);
		}
	};
}

public class CollectionsUtilityClass {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();
		
		Person person1 = new Person();
		person1.setPersonId(100);
		person1.setPersonName("Ishika");
		
		Person person2 = new Person();
		person2.setPersonId(30);
		person2.setPersonName("Aman");
		
		Person person3 = new Person();
		person3.setPersonId(200);
		person3.setPersonName("Gautam");
		
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		
		System.out.println("Comaring By Person Id: ");
		Collections.sort(persons, Person.idComparator);
		System.out.println(persons);

		System.out.println("Comaring By Person Name: ");
		Collections.sort(persons, Person.nameComparator);
		System.out.println(persons);		
	}
}

/* ************************************************************* */

/* Demonstrating Comparator Interface for Collection Sorting */	

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int personId;
	private String personName;
	private int personAge;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int personId, String personName, int personAge) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + "]";
	}

	public static Comparator<Person> idComparator = new Comparator<Person>() {
		@Override
		public int compare(Person p1, Person p2) {
			return p1.personId - p2.personId;
		}
	};
	
	public static Comparator<Person> nameComparator = new Comparator<Person>() {
		@Override
		public int compare(Person p1, Person p2) {
			return p1.personName.compareTo(p2.personName);
		}
	};
	
	public static Comparator<Person> nameAgeComparator = new Comparator<Person>() {
		
		@Override
		public int compare(Person p1, Person p2) {
			int compare = p1.personAge - p2.personAge;
			if(compare == 0) 
				return p1.personName.compareTo(p2.personName);
			else
				return compare;
		}
	};
}

public class CollectionsUtilityClassExample {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();
		
		Person person1 = new Person();
		person1.setPersonId(100);
		person1.setPersonName("Ishika");
		person1.setPersonAge(20);
		
		Person person2 = new Person();
		person2.setPersonId(30);
		person2.setPersonName("Aman");
		person2.setPersonAge(23);
		
		Person person3 = new Person();
		person3.setPersonId(200);
		person3.setPersonName("Gautam");
		person3.setPersonAge(30);;
		
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		
		System.out.println("Comaring By Person Id: ");
		Collections.sort(persons, Person.idComparator);
		System.out.println(persons);

		System.out.println("Comaring By Person Name: ");
		Collections.sort(persons, Person.nameComparator);
		System.out.println(persons);
		
		System.out.println("Comaring By Person age and Person Name: ");
		Collections.sort(persons, Person.nameAgeComparator);
		System.out.println(persons);		
	}
}

