package queues;

import java.util.Arrays;

class ArrayQueue {
	private int[] items;
	private int rear;
	private int front;
	private int count;

	public ArrayQueue(int capacity) {
		items = new int[capacity];
	}

	// enqueue
	public void enqueue(int item) {
		if (count == items.length)
			throw new IllegalStateException();
		items[rear++] = item;
		count++;
	}

	// dequeue
	public int dequeue() {
		return items[front++];
	}

	// peek
	public int peek() {
		return items[front];
	}

	// isEmpty
	boolean isEmpty() {
		return front == -1;
	}

	// isFull
	public boolean isFull() {
		return count == items.length;
	}

	@Override
	public String toString() {
		return Arrays.toString(items);
	}

	public void traverse() {
		System.out.println("Elements in Queue : ");
		for (int i = front; i < rear; i++) {
			System.out.println(items[i]);

		}
	}

}
