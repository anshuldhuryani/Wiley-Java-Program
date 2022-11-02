package misc;

import java.util.HashSet;
import java.util.Set;

/**
 * equals() and hashCode() Methods: - As we know, Object is the parent class for
 * all java classes. - These methods have been defined in Object class.
 * 
 * equals() Method: Verifies the equality of two objects. This method checks
 * whether two object reference of same class are equal or not. Tip: Be default,
 * two objects are equal if they refer to the same memory location.
 * 
 * hashCode() Method: If we override equals() then we must override hashCode()
 * 
 */

class Employee {

	private Integer id;
	private String firstName;
	private String lastName;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;

		if (obj == this)
			return true;

		if (getClass() != obj.getClass())
			return false;

		Employee emp = (Employee) obj;
		return (this.getId() == emp.getId());

	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + getId();
		return result;
	}
	
	/**
	 * Conclusion:
	 * 	e1.equals(e2) then, e1.hashCode() == e2.hashCode() should always be true.
	 * But,
	 * 	If e1.hashCode() == e2.hashCode is true, it doesn't mean that e1.equals(e2) will be true.
	 */
	

}

public class Example {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.setId(101);
		e2.setId(101);

		System.out.println(e1.getId() == e2.getId());
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode() == e2.hashCode());
		
		/**
		 * 	If both employee objects are equal, 
		 * 	In a set collection that store unique object,
		 * 	There must be one object inside HashSet gets created
		 * 	because both objects refers to the same employee.
		 */

		Set<Employee> employees = new HashSet<Employee>();
		employees.add(e1);
		employees.add(e2);
		
		System.out.println(employees);
		
	}

}
