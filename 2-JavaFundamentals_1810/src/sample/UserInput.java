package sample;
import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
		int employeeId;
		String employeeName;
		float employeeSalary;
		String employeeGender;
		Scanner scanner = new Scanner(System.in);
		
		// Input:
		System.out.print("Enter Employee Id: ");
		employeeId = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Employee Name: ");
		employeeName = scanner.nextLine();
		System.out.print("Enter Employee Salary: ");
		employeeSalary =scanner.nextFloat();
		System.out.print("Enter Employee Gender: ");
		employeeGender = scanner.next();
		
		// Output:
		System.out.println("Employee Details:");
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Id: " + employeeId);
		System.out.println("Employee Salary: " + employeeSalary);
		System.out.println("Employee Gender: " + employeeGender);
		
		// class the scanner
		scanner.close();

	}

}
