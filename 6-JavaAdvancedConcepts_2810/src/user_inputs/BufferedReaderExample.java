package user_inputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Your Name: ");
		String name = reader.readLine();
		System.out.print("Enter Your Age: ");
		int age = Integer.parseInt(reader.readLine());
		System.out.println("Your name is : " + name);
		System.out.println("Your age is: " + age);
	}

}
