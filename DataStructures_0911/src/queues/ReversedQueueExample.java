package queues;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

class QueueReverser {

	public static void reverse(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<Integer>();
		while (!queue.isEmpty())
			stack.push(queue.remove());
		while (!stack.isEmpty())
			queue.add(stack.pop());
	}

}

public class ReversedQueueExample {

	public static void main(String[] args) {

		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		System.out.println("Original Queue: ");
		Iterator<Integer> iterator = queue.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
		System.out.println("Reversed Queue: ");
		QueueReverser.reverse(queue);
		iterator = queue.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());

	}

}
