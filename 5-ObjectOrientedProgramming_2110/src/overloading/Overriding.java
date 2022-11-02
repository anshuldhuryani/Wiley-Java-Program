package overloading;

class Person {
	String name;
	String city;
	public Person(String name, String city) {
		this.name = name;
		this.city = city;
	}
	public void showData() {
		System.out.println("Name: " + this.name);
		System.out.println("City: " + this.city);
	}
}

class Employee extends Person {
	String designation;
	float salary;
	public Employee(String name, String city, String designation, float salary) {
		super(name, city);
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public void showData() {
		super.showData();
		System.out.println("Designation: " + this.designation);
		System.out.println("Salary: " + this.salary);
	}
	
}

public class Overriding {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee("BHawna", "Delhi", "Corporate Consultant", 50000);
		emp.showData();
		
		
		
	}

}
