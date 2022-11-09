package stacks;

import java.util.Stack;

/**
 * Stack: works in Last-In-First-Out / First-In-Last-Out manner. Stack:
 * implements Iterable, Collection, and List Stack: extends the Vector class
 * 
 * Stack is being used when: - Implementing Undo Feature - Build Compilers
 * (Syntax Checking) - Evaluate Expressions - Build Navigation (Forward/Back)
 * 
 * Stack Operations: - push(item): adds the item at the top - pop(): removes the
 * item from the top - peek(): returns the item which is ready to pop -
 * isEmpty(): to check whether stack is empty or not.
 *
 */

public class StackExample {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();

		System.out.println("Is the stack empty ? " + stack.isEmpty());

		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);

		for (Integer element : stack) {
			System.out.println(element);
		}

		System.out.println("Element popped out is: " + stack.pop());

		for (Integer element : stack) {
			System.out.println(element);
		}

		System.out.println("Element ready to pop is: " + stack.peek());

	}

}
