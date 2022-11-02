package misc;

class Person {
	public final void displayDetails() {
		System.out.println("Displaying Person Details");
	}
}
class Student extends Person {
	// Cannot override the final method from Person
	/*
	 * public void displayDetails() {
	 * System.out.println("Displaying Student Details"); }
	 */
}

public class FinalMethodExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.displayDetails();
	}
	
}
