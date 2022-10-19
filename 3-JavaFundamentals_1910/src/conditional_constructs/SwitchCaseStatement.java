package conditional_constructs;

import java.util.Scanner;

public class SwitchCaseStatement {

	// Switch case works for menu driven application:

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select Option Below");
		System.out.println("1 - Deposit");
		System.out.println("2 - Withdrawal");
		System.out.println("3 - Balance");
		System.out.print("Choice: ");
		int choice = scanner.nextInt();
		// Switch Case
		switch(choice) {
		case 1:
			System.out.println("Depositted the amount.");
			break;
		 case 2: 
			System.out.println("Withdrawal the amount");
			break;
		case 3: 
			System.out.println("Balance in account.");
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		scanner.close();
		
	}

}
