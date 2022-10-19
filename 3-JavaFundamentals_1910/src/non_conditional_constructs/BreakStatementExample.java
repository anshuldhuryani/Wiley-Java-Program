package non_conditional_constructs;

import java.util.Scanner;

public class BreakStatementExample {

	/**
	 * Break Statement terminates the loop immediately and moves to next statement
	 * following after loop.
	 */

	public static void main(String[] args) {

		// Variable Length While Loop:
		Scanner scan = new Scanner(System.in);
		int value = 0;
		String choice = "y";
		while (choice.equals("y") || choice.equals("Y") || choice.equals("yes") || choice.equals("YES")) {
			System.out.print("Enter Value: ");
			value = scan.nextInt();
			if(value >= 100) 
				break;
			else {
				if (value % 5 == 0)
					System.out.println("Divisible");
				else
					System.out.println("Not Divisible");
			}
			System.out.print("Do you wish to continue? ");
			choice = scan.next();
		}
		scan.close();
	}

}
