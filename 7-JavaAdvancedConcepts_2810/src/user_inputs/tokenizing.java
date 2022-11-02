package user_inputs;

import java.util.*;

/**
 * StringTokenizer class comes inside java.util package. This class helps in
 * breaking a string into tokens.
 * 
 */

public class tokenizing {

	public static void main(String[] args) {

		// Demonstration 3:
		StringTokenizer message = new StringTokenizer("Learning, Java, Fundamentals", ",", false);
		int count = message.countTokens();
		for (int i = 0; i < count ; i++) {
			System.out.println("Token at " + i + " : " + message.nextToken());
		}
		

	}
}
