package inheritance;

import java.util.Scanner;

class Student {
	private int id;
	private String name;
	private String course;
	private static String schoolName;
	static {
		Student.schoolName = "Shri Ram Global Public School";
	}
	Scanner scan = new Scanner(System.in);

	public void acceptDetails() {
		System.out.print("Enter Student Id : ");
		this.id = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter Student Name : ");
		this.name = scan.nextLine();
		System.out.print("Enter Student Course : ");
		this.course = scan.nextLine();
	}

	public void displayDetails() {
		System.out.println("Student Basic Information:");
		System.out.println("Student Id: " + this.id);
		System.out.println("Student Name: " + this.name);
		System.out.println("Student Course: " + this.course);
		System.out.println("School Name: " + Student.schoolName);
	}
}

class Marks extends Student {
	protected float objectiveMarks;
	protected float subjectiveMarks;

	public void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Objective Marks : ");
		this.objectiveMarks = scan.nextFloat();
		System.out.print("Enter Subjective Marks : ");
		this.subjectiveMarks = scan.nextFloat();
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Marks Scored:");
		System.out.println("Objective Marks: " + this.objectiveMarks);
		System.out.println("Subjective Marks: " + this.subjectiveMarks);
	}
}

class Sports extends Marks {
	protected float score;
	public void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Sports Score : ");
		this.score = scan.nextFloat();
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Sports Score: " + this.score);
	}
}

class Result extends Sports {
	float totalMarks, averageMarks;
	public void calculateResult() {
		this.totalMarks = this.objectiveMarks + this.subjectiveMarks + this.score;
		this.averageMarks = this.totalMarks/3;
		System.out.println("Total Marks: " + this.totalMarks);
		System.out.println("Average Marks: " + this.averageMarks);
		if(this.averageMarks >= 75 && this.objectiveMarks >= 70 && this.subjectiveMarks >= 70) {
			System.out.println("Congratulations!! You are shortlisted.");
		} else {
			System.out.println("OOPS!! Better Luck Next Time.");
		}
	}
	
}

public class MainEntry {
	
	public static void main(String[] args) {
		
		Result obj = new Result();
		
		obj.acceptDetails();
		obj.displayDetails();

		obj.calculateResult();
		
	}

}
