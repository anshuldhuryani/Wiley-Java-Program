//
//package collections;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//class Person{
//	private int personId;
//	private String personName;
//	public Person() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Person(int personId, String personName) {
//		super();
//		this.personId = personId;
//		this.personName = personName;
//	}
//	public int getPersonId() {
//		return personId;
//	}
//	public void setPersonId(int personId) {
//		this.personId = personId;
//	}
//	public String getPersonName() {
//		return personName;
//	}
//	public void setPersonName(String personName) {
//		this.personName = personName;
//	}
//	@Override
//	public String toString() {
//		return "Person [personId=" + personId + ", personName=" + personName + "]";
//	}
//	
////	@Override
////	public int compareTo(Person p1) {
////		return this.getPersonId() - p1.getPersonId();
////	}
//}
//
//public class ArraysUtilityClassExample {
//
//	public static void main(String[] args) {
//
//		List<Person> persons = new ArrayList<Person>();
//		
//		Person person1 = new Person();
//		person1.setPersonId(100);
//		person1.setPersonName("Ishika");
//		
//		Person person2 = new Person();
//		person2.setPersonId(30);
//		person2.setPersonName("Aman");
//		
//		Person person3 = new Person();
//		person3.setPersonId(200);
//		person3.setPersonName("Gautam");
//		
//		persons.add(person1);
//		persons.add(person2);
//		persons.add(person3);
//		
//		// Sorting Persons by person compare Method
//		Collections.sort(persons, Comparator.comparing(Person::getPersonId));
//		// Collections.sort(persons);
//		System.out.println(persons);
//		
//		
//	}
//}
