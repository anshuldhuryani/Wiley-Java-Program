package non_conditional_constructs;

import java.util.Scanner;

public class ContinueStatementExample {

	public static void main(String[] args) {

		// Variable Length While Loop:
		Scanner scan = new Scanner(System.in);
		int value = 0;
		String choice = "y";
		while (choice.equals("y") || choice.equals("Y") || choice.equals("yes") || choice.equals("YES")) {
			System.out.print("Enter Value: ");
			value = scan.nextInt();
			if (value >= 100)
				continue;
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
