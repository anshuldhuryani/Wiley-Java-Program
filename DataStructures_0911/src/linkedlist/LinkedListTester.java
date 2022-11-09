package linkedlist;

public class LinkedListTester {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.addLast(100);
		list.addLast(200);
		list.addFirst(50);

		System.out.println(list.isEmpty() ? "List is empty." : "List is not Empty.");
		list.traversal();
		
		int[] returnedArray = list.convertToArray();
		for (int value : returnedArray) {
			System.out.println(value);
		}
	}

}
