package user_inputs;

import java.io.Console;

public class ConsoleClassExample {

	public static void main(String[] args) throws NullPointerException {
		
		Console console = System.console();
		// System.out.println("Enter username: ");
		// String username =console.readLine();
		System.out.println("Enter Password: ");
		char[] password = System.console().readPassword();
		
		// System.out.println("Hi, Your username is " + username);
		System.out.println("And your password is " + String.valueOf(password));
		
	}
}
