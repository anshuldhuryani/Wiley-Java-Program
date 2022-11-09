package linkedlist;

public class LinkedList {

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	private Node first;
	private Node last;
	private int size;

	// AddLast
	public void addLast(int item) {
		var node = new Node(item);
		if (isEmpty())
			first = last = node;
		else {
			last.next = node;
			last = node;
		}
		size++;
	}

	// AddFirst
	public void addFirst(int item) {
		var node = new Node(item);
		if (isEmpty())
			first = last = node;
		else {
			node.next = first;
			first = node;
		}
		size++;
	}

	// isEmpty()
	public boolean isEmpty() {
		return first == null;
	}

	// removeLast()
	void removeLast() {
		Node temp = first;
		if (temp == null) {
			return;
		} else if (temp.next == null) {
			first = null;
		} else {
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	// removeFirst()
	public void removeFirst() {
		if (size == 0) {
			System.out.println("Empty");
		} else if (size == 1) {
			first = last = null;
			size = 0;
		} else {
			first = first.next;
			size--;
		}
	}

	// indexOf()
	public void indexOf(int val) {
		int index = 0;
		if (first == null) {
			System.out.println("The list is empty");
		} else {
			Node temp = first;
			while (temp != null) {
				if (temp.value == val) {
					System.out.println("The index of " + val + " is: " + index);
					break;
				}
				temp = temp.next;
				index++;
			}
		}
	}

	// contains()
	public void contains(int item) {
		Node temp = first;
		int c = 0;
		while (temp != null) {
			if (temp.value == item) {
				c += 1;
				break;
			}
			temp = temp.next;
		}
		if (c >= 1) {
			System.out.println(" Element FOund");
		} else {
			System.out.println("No found");
		}
	}

	// size()
	public int size() {
		return size;
	}

	// convertToArray()
	public int[] convertToArray() {
		int[] array = new int[size];
		var current = first;
		var index = 0;
		while (current != null) {
			array[index++] = current.value;
			current = current.next;
		}
		return array;
	}

	// traversal()
	public void traversal() {
		Node temp = first;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

}
