
/*

	Final Keyword:
	
	Final Keyword can be used with :
	- Variable
		* Final Variable
		* Blank Final Variable
		* Static Blank Final Variable
	- Method 
	- Class

*/

/* *********************************************** */

/* Final Variable: 
	The value of final variable can't be changed. */
	
	package misc;

public class FinalVariableExample {

	final int count = 100;

	public void setCount() {
		System.out.println(this.count);
		// Error: The final field FinalKeywordExample.count cannot be assigned
		// count += 200;
	}

	public static void main(String[] args) {

		FinalVariableExample obj = new FinalVariableExample();
		obj.setCount();

	}

}

/* *********************************************** */

/* Blank Final Variable: 
	If the value is not assigned to the final variable at the time of declaration, is known as blank final variable. This can only be initialized in constructor. */

package misc;

public class BlankFinalVariableExample {

	final int count;

	public BlankFinalVariableExample() {
		this.count = 100;
	}

	public void setCount() {
		System.out.println(this.count);
	}

	public static void main(String[] args) {

		BlankFinalVariableExample obj = new BlankFinalVariableExample();
		obj.setCount();

	}

}

/* *********************************************** */

/*

	Static Blank Final Variable: This is field if not initalized at the time declaring, then can be initialized in static block only.

*/

package misc;

public class StaticBlankFinalVariableExample {

	static final int count = 100;
	static final int maxTime;
	
	static {
		maxTime = 200;
	}

	public void setCount() {
		System.out.println(count);
		System.out.println(maxTime);
	}

	public static void main(String[] args) {

		FinalVariableExample obj = new FinalVariableExample();
		obj.setCount();

	}

}

/* *********************************************** */

/* final Method: 
	You can't override the final method in subclasses.
	You can call parent class final method through subclass object.
*/

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

/* *********************************************** */

Final Class: If you declare a class final, you can't extend it.

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