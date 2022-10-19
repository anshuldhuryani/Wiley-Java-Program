package looping_constructs;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {

//		// Fixed While Loop:
//		Scanner scan = new Scanner(System.in);
//		int value = 0, i = 1;
//		while (i <= 5) {
//			System.out.print("Enter Value: ");
//			value = scan.nextInt();
//			if (value % 5 == 0)
//				System.out.println("Divisible");
//			else
//				System.out.println("Not Divisible");
//			i = i + 1;
//		}
//		scan.close();
		
		// Variable Length While Loop:
		Scanner scan = new Scanner(System.in);
		int value = 0;
		String choice = "y";
		while (choice.equals("y") || choice.equals("Y") || choice.equals("yes") || choice.equals("YES")) {
			System.out.print("Enter Value: ");
			value = scan.nextInt();
			if (value % 5 == 0)
				System.out.println("Divisible");
			else
				System.out.println("Not Divisible");
			System.out.print("Do you wish to continue? ");
			choice = scan.next();
		}
		scan.close();
	}

}
