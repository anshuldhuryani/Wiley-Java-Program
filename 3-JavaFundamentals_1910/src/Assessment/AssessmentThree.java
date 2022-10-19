package Assessment;

import java.util.Scanner;

public class AssessmentThree {

	public static void main(String[] args) {

		// Implement below case-study using if..else if..else and Turnary Operator:

		// Accept sellingPrice and costPrice of an article from user.
		// Check whether customer has Profit/Loss/No Profit No Loss

		Scanner s = new Scanner(System.in);
		System.out.println("Enter cost price");
		int costPrice = s.nextInt();
		System.out.println("Enter Selling price");
		int sellingPrice = s.nextInt();
		
		// First Way: Using if..else..else statement
		//		if (sellingPrice > costPrice) {
		//			System.out.println("Profit");
		//		} else if (sellingPrice < costPrice) {
		//			System.out.println("Loss");
		//		} else {
		//			System.out.println("No Profit No loss");
		//		}

		// Second Way: Using Turnary Operator
		String result;
		result = (sellingPrice > costPrice) ? "Profit" : (sellingPrice < costPrice) ? "Loss" : "No prfit no loss";
		System.out.println(result);

		s.close();
	}

}
