package exceptions;

import java.util.Scanner;

public class Demonstration {
	
	public static void main(String[] args) {
		
//		String message;
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter Message: ");
//		message = scan.nextLine();
//		System.out.println("Message: " + message);
//		scan.close();
		
		String message;
		try(Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter Message: ");
			message = scan.nextLine();
			System.out.println("Message: " + message);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
	}

}
