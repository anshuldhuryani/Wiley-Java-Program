package oops;

/**
 * 
 *  Constructor Chaining:
 *  A constructor is invoked from another constructor.
 *
 * Constructor Overloading:
 *  A class can have more than one constructor with different signatures.
 */

class Person {
	
	String name;
	String city;
	String country;
	
	// Default Constructor
	Person() {
		this("King Kochhar");
		this.name = "Shreya Sharma";
		this.city = "Delhi";
		this.country = "India";
	}
	
	// Parameterized Constructor with One Parameter
	Person(String name) {
		this("New Delhi", "India");
		this.name = name;
	}
	
	// Parameterized Constructor with Two Parameters
	Person(String city, String country) {
		this.city = city;
		this.country = country;
	}
	
	// Display Details 
	public void displayDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("City: " + this.city);
		System.out.println("Country: " + this.country);
	}
}

public class ConstructorChainingExample {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.displayDetails();
		
	}
}
