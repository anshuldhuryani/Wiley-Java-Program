package oops;
//package oops;
//
//import java.util.Scanner;
//
//class Student {
//	// Data Members
//	int studentId;
//	String studentName;
//	int studentAge;
//	Scanner scan = new Scanner(System.in);
//	
//	// Default Constructor (No-Argument Constructor/Parameterless Constructor)
//	public Student() {
//		this.studentId = 1000;
//		this.studentName = "Kartik";
//		this.studentAge = 23;
//	}
//	
//	// Parameterized Constructor
//	public Student(int studentId, String studentName, int studentAge) {
//		this.studentId = studentId;
//		this.studentName = studentName;
//		this.studentAge = studentAge;
//	}
//	
//	// Copy Constructor
//	public Student(Student stObj) {
//		this.studentId = stObj.studentId;
//		this.studentName = stObj.studentName;
//		this.studentAge = stObj.studentAge;
//	}
//	
//	// Member Function
//	public void displayDetails() {
//		System.out.println("Student Id is : " + this.studentId);
//		System.out.println("Student Name is : " + this.studentName);
//		System.out.println("Student Age is : " + this.studentAge);
//	}
//}
//
//public class ConstructorExample {
//	
//	public static void main(String[] args) {
//		
//		Student student1 = new Student();
//		student1.displayDetails();
//		System.out.println("-------------------");
//		Student student2 = new Student(1001, "King", 40);
//		student2.displayDetails();
//		System.out.println("-------------------");
//		Student student3 = new Student(student2);
//		student3.displayDetails();
//	}
//
//}
