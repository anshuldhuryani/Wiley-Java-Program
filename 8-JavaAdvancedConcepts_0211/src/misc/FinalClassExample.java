package misc;

final class PersonOne {
	public void displayDetails() {
		System.out.println("Displaying Person Details");
	}
}

// The type StudentOne cannot subclass the final class PersonOne
/*
 * class StudentOne extends PersonOne { public void displayDetails() {
 * System.out.println("Displaying Student Details"); } }
 */

public class FinalClassExample {

	public static void main(String[] args) {
		PersonOne s1 = new PersonOne();
		s1.displayDetails();
	}

}
