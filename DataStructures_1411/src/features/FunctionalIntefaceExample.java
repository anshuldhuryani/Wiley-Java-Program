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
