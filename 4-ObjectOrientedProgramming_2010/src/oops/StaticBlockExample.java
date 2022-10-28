package oops;

import java.util.Scanner;

class Student {
// Data Members
	int studentId;
	String studentName;
	int studentAge;
	static String universityName;
	Scanner scan = new Scanner(System.in);
	
	static {
		universityName = "ABC University";
	}

	public Student() {
		this.studentId = 1000;
		this.studentName = "Kartik";
		this.studentAge = 23;
	}

	public void displayDetails() {
		System.out.println("Student Id is : " + this.studentId);
		System.out.println("Student Name is : " + this.studentName);
		System.out.println("Student Age is : " + this.studentAge);
		System.out.println("University Name : " + Student.universityName);
	}
}

public class StaticBlockExample {
	
	public static void main(String[] args) {
	
		Student s1 = new Student();
		s1.displayDetails();
	
		Student.universityName = "BVIMR University";
		
		System.out.println("------------------------------");
		
		Student s2 = new Student();
		s2.displayDetails();
		
System.out.println("------------------------------");
		
		Student s3 = new Student();
		s3.displayDetails();
		
		
		
	}

}
