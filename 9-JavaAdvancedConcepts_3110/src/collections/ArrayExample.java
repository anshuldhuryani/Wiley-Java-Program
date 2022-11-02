package collections;

public class ArrayExample {

	public static void main(String[] args) {

		int numbers[] = { 10, 20, 30, 40, 50 }; // Array Declaration
		
		for (int i = 4; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("----------------------------------");
		
		for (int num : numbers) {
			System.out.println(num);
		}

	}

}
