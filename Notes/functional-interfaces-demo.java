
/* Functional Interace by implementing interface in sub classes*/

package features;

// Define a Functional Interface
@FunctionalInterface
interface Printer {
	public void print(String message);
}

class ConsolePrinter implements Printer {

	@Override
	public void print(String message) {
		System.out.println(message);
	}

}

public class FunctionalIntefaceExample {

	public static void main(String[] args) {
		
		ConsolePrinter cPrinter = new ConsolePrinter();
		cPrinter.print("Hello World");

	}

}

-----------------------------------------------------------------------

/* Functional Interace by by using Lambda Expressions */

package features;

// Define a Functional Interface
@FunctionalInterface
interface Printer {
	public void print(String message);
}

public class FunctionalIntefaceExample {

	public static void main(String[] args) {

		// Implementing the abstract method of the Interace using Lambda Expression.
		Printer printer = (message) -> System.out.println(message);
		
		// Invoking print Method
		printer.print("Hello Everyone!!");

	}

}

-----------------------------------------------------------------------

/* Functional Interace by by annonymous Inner Class */

package features;

// Define a Functional Interface
@FunctionalInterface
interface Printer {
	public void print(String message);
}

public class FunctionalIntefaceExample {

	public static void main(String[] args) {

		// Annonymous Inner Class
	Printer printer = new Printer() {
		
		@Override
		public void print(String message) {
			System.out.println(message);
			
		}
	};
	
	// Invoke print() Method
	printer.print("Hello Folks!!");

	}

}

-----------------------------------------------------------------------

/* Accessing Local, Static and Instance Variable with Functional Interface or Lambda expressions */

package features;

// Define a Functional Interface
@FunctionalInterface
interface Printer {
	public void print(String message);
}

class Demo {
	String msg = "Hello Folks!!";
}

public class FunctionalIntefaceExample {
	
	String msg = "Hello Folks!!";
	static String prefix = " - ";

	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		String postfix = "$";
		// Implementing the abstract method of the Interace using Lambda Expression.
		Printer printer = (message) -> System.out.println(prefix + d.msg + message + postfix);
		
		// Invoking print Method
		printer.print("Hello Everyone!!");

	}

}

-----------------------------------------------------------------------

/* Functional Interface Example: */

package features;

import java.util.function.Function;

public class FunctionalIntefaceExample {

	public static void main(String[] args) {
	
		Function<String, Integer> functionRef = (str) -> str.length();
		int length = functionRef.apply("Hello World!!");
		System.out.println("Length of String Variable: " + length);
		
	}

}

-----------------------------------------------------------------------

/* Functional Interface Example: */

package features;

import java.util.HashMap;
import java.util.function.Function;

class Student {
	
	static HashMap<Integer, String> students = new HashMap<Integer, String>();
	
	public static void addStudent(String studentName, int studentId) {
		if(!students.containsKey(studentId))
			students.put(studentId, studentName);
		else
			System.out.println("Student already registered.");
	}
}

public class FunctionalIntefaceExample {

	public static void main(String[] args) {
	
		Function<Integer, String> getDetails  = (Integer id) -> {
			if(Student.students.containsKey(id))
				return Student.students.get(id);
			else
				return "Student doesn't exist with this Id.";
		};
		
		Student.addStudent("Bhawna", 102);
		Student.addStudent("Gunwani", 103);
		Student.addStudent("Pushpit", 104);
		Student.addStudent("Sumit", 105);
		Student.addStudent("Sumit", 105);
		
		System.out.println(getDetails.apply(1102));
	}

}

-----------------------------------------------------------------------------------

/* Binary Operator with Functional Interface */

package features;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FunctionalIntefaceExample {

	public static void main(String[] args) {
	
		BinaryOperator<Integer> addition = (num1, num2) -> num1 + num2;
		var result = addition.apply(100, 200);
		System.out.println(result);
	
	}	

}

----------------------------------------------------------------------------------

/* Binary Operator with Functional Interface and Chaining */

package features;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FunctionalIntefaceExample {

	public static void main(String[] args) {
	
		BinaryOperator<Integer> addition = (num1, num2) -> num1 + num2;
		Function<Integer, Integer> square = num -> num * num;
		var result =  addition.andThen(square).apply(100, 200);
		System.out.println(result);
		
	
	}	

}

-------------------------------------------------------------------------------------

/* Unary Operator with Functional Interface */

package features;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionalIntefaceExample {

	public static void main(String[] args) {

		UnaryOperator<Integer> square = (num) -> num * num;
		var result = square.apply(10);
		System.out.println(result);

	}

}

--------------------------------------------------------------------------------------

/* Unary Operator with Functional Interface with Chaining */

package features;
import java.util.function.UnaryOperator;

public class FunctionalIntefaceExample {

	public static void main(String[] args) {

		UnaryOperator<Integer> square = (num) -> num * num;
		UnaryOperator<Integer> increment = (num) -> num + 1;
		var result = square.andThen(increment).apply(10);
		System.out.println(result);

	}

}

--------------------------------------------------------------------------------------

/* Predicate Interface Example */

package features;

import java.util.function.Predicate;

public class FunctionalIntefaceExample {

	public static void main(String[] args) {
		Predicate<String> isLongerThan5 = (str) -> str.length() > 5;
		var result = isLongerThan5.test("BG");
		System.out.println(result);

	}

}

--------------------------------------------------------------------------------------

/* Predicate Interface Example */

package features;

import java.util.function.Predicate;

public class FunctionalIntefaceExample {

	public static void main(String[] args) {
		Predicate<String> isLongerThan5 = (str) -> str.length() > 5;
		if(isLongerThan5.test("Hello World"))
			System.out.println("Very Nice");
		else
			System.out.println("Very Bad.");

	}

}


--------------------------------------------------------------------------------------

/* Predicate Interface Example */

package features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {
	private Integer Id;
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer id, String firstName, String lastName, String gender, Integer age) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", age=" + age + "]";
	}
}

class EmployeePredicates  {
		
	public static Predicate<Employee> isAduleFemale() {
		return e -> e.getAge() > 18 && e.getGender().equalsIgnoreCase("Female");
	}
	
	public static Predicate<Employee> isAduleMale() {
		return e -> e.getAge() > 21 && e.getGender().equalsIgnoreCase("Male");
	}
	
	public static Predicate<Employee> isAgeMoreThan(Integer age) {
		return e ->e.getAge() > age;
	}
	
	public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
		return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
	}
	
}

public class FunctionalIntefaceExample {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(101, "Kartik", "Singhal", "Male", 20));
		employees.add(new Employee(102, "Gautam", "Bhalla", "Male", 25));
		employees.add(new Employee(103, "Shreya", "Sharma", "Female", 17));
		employees.add(new Employee(104, "Sarah", "Bowling", "Female", 22));
		employees.add(new Employee(105, "John", "Smith", "Male", 23));
		employees.add(new Employee(106, "King", "Kochhar", "Male", 28));
		employees.add(new Employee(107, "Rasiya", "Bond", "Female", 23));
		employees.add(new Employee(108, "Roger", "Lee", "Male", 12));
		
		System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAduleFemale()));
		System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAduleMale()));
		System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAgeMoreThan(25)));
		System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAgeMoreThan(25)));
		System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAgeMoreThan(25).negate()));

	}

}

--------------------------------------------------------------------------------------

/* Consumer Interface Example: */

package features;

import java.util.List;

public class FunctionalIntefaceExample {

	public static void main(String[] args) {

		List<Integer> list = List.of(101, 102, 103, 104, 105);
		
		// Imperative Programming (for, if/else, switch-case)
		for (var item : list)
			System.out.println(item);
		
		// Internally, forEach implements Consumer Interface.
		// Declarative Programming (Functional Programming)
		list.forEach(item -> System.out.println(item));
	

	}

}


--------------------------------------------------------------------------------------

/* Consumer Interface Example: */

package features;

import java.util.List;
import java.util.function.Consumer;

public class FunctionalIntefaceExample {

	public static void main(String[] args) {

		List<String> names = List.of("King", "Kochhar", "Shreya", "Gautam");
		Consumer<String> printNames = item -> System.out.println(item);
		Consumer<String> printNamesUpperCase = item -> System.out.println(item.toUpperCase());

		names.forEach(printNames);
		System.out.println("---------------------");
		names.forEach(printNamesUpperCase);
		System.out.println("---------------------");
		names.forEach(printNames.andThen(printNamesUpperCase).andThen(printNames));
		System.out.println("---------------------");

	}

}

------------------------------------------------------------------------


/* Supplier Interface Example: */


package features;

import java.util.function.BiConsumer;

public class FunctionalIntefaceExample {

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> checkCriteria = (age, marks) -> {
			if(age >=18 && marks >=75)
				System.out.println("Congratualions, You are shortListed..");
			else 
				System.out.println("Better Luck Next Time.");
		};
		checkCriteria.accept(24, 79);
		
	}

}

--------------------------------------------------------------------------

/* Supplier Interface Example: */

package features;

import java.util.function.Supplier;

public class FunctionalIntefaceExample {

	public static void main(String[] args) {

		Supplier<Double> getRandom = () -> Math.random();
		var result = getRandom.get();
		System.out.println(result);

	}

}

-------------------------------------------------------------------------------

package features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class Employee {
	private Integer Id;
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String firstName, String lastName, String gender, Integer age) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", age=" + age + "]";
	}
}

public class FunctionalIntefaceExample {
	
	public static Supplier<List<Employee>>  populateEmployees() {
		Supplier<List<Employee>> employeeList = () -> {
			ArrayList<Employee> employees = new ArrayList<Employee>();
			employees.add(new Employee(101, "Kartik", "Singhal", "Male", 20));
			employees.add(new Employee(102, "Gautam", "Bhalla", "Male", 25));
			employees.add(new Employee(103, "Shreya", "Sharma", "Female", 17));
			employees.add(new Employee(104, "Sarah", "Bowling", "Female", 22));
			employees.add(new Employee(105, "John", "Smith", "Male", 23));
			employees.add(new Employee(106, "King", "Kochhar", "Male", 28));
			employees.add(new Employee(107, "Rasiya", "Bond", "Female", 23));
			employees.add(new Employee(108, "Roger", "Lee", "Male", 12));
			return employees;
		};
		return employeeList;
	}

	public static void main(String[] args) {

		System.out.println(populateEmployees().get());

	}

}

--------------------------------------------------------------------

package features;

import java.util.function.BiFunction;

interface Printer {
	void print();
}

class ConsolePrinter {
	
	public ConsolePrinter() {
		System.out.println("I am constructor of Console Printer..!!");
	}

	// Instance Method
	public  void printMessage() {
		System.out.println("I am printing message Here..");
	}

	// Static Method
	public static void printSomething() {
		System.out.println("I am printing something..");
	}

	// Static Method
	public static int addition(int num1, int num2) {
		return num1 + num2;
	}

}

public class MethodReferenceExample {

	public static void main(String[] args) {

		// Reference to a Static Method
		Printer printer = ConsolePrinter::printSomething;
		printer.print();

		// Reference to a Static Method
		BiFunction<Integer, Integer, Integer> additionCall = ConsolePrinter::addition;
		int result = additionCall.apply(100, 200);
		System.out.println(result);
		
		// Reference to an Instance Method
		ConsolePrinter ref = new ConsolePrinter();
		Printer printer1 = ref::printMessage;
		printer1.print();

		// Reference to a constructor
		Printer printer2 = ConsolePrinter::new;
		printer2.print();
	}

}

