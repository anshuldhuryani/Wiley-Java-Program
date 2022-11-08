package complexities;

class Array {

	private int[] items;
	private int count;

	public Array(int length) {
		items = new int[length];
		count = 0;
	}

	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}

	public void insert(int item) {
		// If the array is full, resize it.
		if (items.length == count) {
			// Create a new array and twice the size of array
			int[] newItems = new int[count * 2];
			// Copy all existing items to this new array
			for (int i = 0; i < count; i++)
				newItems[i] = items[i];
			items = newItems;
		}
		// Add the new item at the end.
		items[count++] = item;
	}

	public void removeAt(int index) {
		// Validate the index
		if (index < 0 || index >= count)
			throw new IllegalArgumentException();
		// Shift the items to the left to fill the hold
		// [10, 20,30,40] => // 1
		for (int i = index; i < count; i++)
			items[i] = items[i + 1];
		count--;
	}

}

public class CreatingArrayExample {

	public static void main(String[] args) {
		Array numbers = new Array(3);
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(40);
		numbers.insert(50);
		numbers.insert(60);
		numbers.insert(70);
		numbers.removeAt(10);
		numbers.print();

	}

}
