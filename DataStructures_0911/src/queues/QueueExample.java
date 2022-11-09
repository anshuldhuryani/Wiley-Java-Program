package queues;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/* Queue works in FIFO(First-In First-Out Manner)
 * 	Elements gets added in queue from Rear and
 * 	Elements gets deleted from queue from Front.
 * 	
 * Application that can be performed with Queue:
 * 	- Printer
 * 	- Operating System
 * 	- Web Servers
 * 	- Live Support Systems
 *
 *Operations that can be performed with Queue:
 *		- enqueue: To add element in queue
 *		- dequeue: To remove element from queue
 *		- peek: To return which element is ready to dequeue
 *		- isEmpty: To check whether queue is empty or not.
 *		- isFull: To check whether queue is full or not.
 */

public class QueueExample {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(60);
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		System.out.println("Head of the queue: " + queue.element());
		System.out.println("Head of the queue: " + queue.peek());

		Iterator<Integer> iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
		
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		
	}

}
