package stacks;

import java.util.Stack;

class StringReverser {
	public String reverse(String input) {
		String reverse = "";
		Stack<Character> stack = new Stack<Character>();
		// Push elements to Stack
		for (char ch : input.toCharArray())
			stack.push(ch);
		// Pop elements and append the reverse string
		while (!stack.isEmpty())
			reverse += stack.pop();
		// return the reversed String
		return reverse;
	}
}

public class ReverseStringExample {

	public static void main(String[] args) {
		String str = "abcd";
		StringReverser reverser = new StringReverser();
		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + reverser.reverse(str));
	}

}
