package user_inputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderWithLoopExample {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String message = "";
		while(!message.equals("stop")) {
			System.out.print("Enter Your Message: ");
			message = reader.readLine();
			System.out.println(message);
		}
		
	}

}
