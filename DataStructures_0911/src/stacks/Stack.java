package stacks;

import java.util.Arrays;

public class Stack {

	private int[] items = new int[5];
	private int count;

	// Push
	public void push(int item) {
		if (count == items.length)
			throw new StackOverflowError();
		items[count++] = item;
	}

	// Pop
	public int pop() {
		if (isEmpty())
			throw new IllegalStateException();
		return items[--count];
	}

	// Peek
	public int peek() {
		return items[count - 1];
	}

	// isEmpty
	public boolean isEmpty() {
		return count == 0;
	}

	// traverse
	public void display() {
		if (count == 0)
			System.out.println("Stack is empty");
		for (int i = 0; i < count; i++)
			System.out.println(items[i]);
	}

	@Override
	public String toString() {
		return Arrays.toString(items);
	}

}
