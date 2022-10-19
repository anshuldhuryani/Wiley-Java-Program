package looping_constructs;

import java.util.Scanner;

public class DoWhileLoopExample {
	public static void main(String[] args) {

		// Variable Length While Loop:
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String choice = "y";
		do {
			System.out.println("Enter Number");
			num = sc.nextInt();
			if (num % 5 == 0) {
				System.out.println("Divisibe");
			} else {
				System.out.println("Not dicisible");
			}
			System.out.println("do you want to continue?");
			choice = sc.next();
		} while (choice.equals("y") || choice.equals("Y") || choice.equals("YES") || choice.equals("yes"));
		sc.close();
	}
}
