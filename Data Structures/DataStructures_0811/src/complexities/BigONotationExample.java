package complexities;

class Dummy {

	public void printOne(int[] numbers) {
		// O(1) + O(1)
		// O(2) => O(1) Constant Big O Notation
		System.out.println(numbers[0]); // O(1)
		System.out.println(numbers[0]); // O(1)
	}

	public void printTwo(int[] numbers) {
		// O(n), where size is not fixed
		// O(n) => Linear Big O Notation
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Hello " + i);
		}
		System.out.println("*********************");
		// O(n) => Linear Big O Notation
		for (int num : numbers) {
			System.out.println(num);
		}
		System.out.println("*********************");
		// O(1) + O(n) + O(1)
		// O(n) + O(2)
		// O(n) - Linear Big O Notation
		System.out.println(); // O(1)
		for (int num : numbers) { // O(n)
			System.out.println(num);
		}
		System.out.println(); // O(1)
		System.out.println("*********************");
		// O(n) + O(n)
		// O(2n)
		// O(n) => Linear Big O Notation
		for (int num : numbers) { // O(n)
			System.out.println(num);
		}
		for (int num : numbers) { // O(n)
			System.out.println(num);
		}
	}

	public void display(int[] numbers, String[] names) {
		// O(n) + P(m)
		// O(n) = Linear Big O Notation
		for (int num : numbers) { // O(n)
			System.out.println(num);
		}
		for (String name : names) { // O(m)
			System.out.println(name);
		}
	}

	public void printThree(int[] numbers) {
		// O(n) * O(n)
		// O(n^2) => Quadratic Big O Notation
		for (int first : numbers) { // O(n)
			for (int second : numbers) { // O(n)
				System.out.println(first + ", " + second);
			}
		}
		System.out.println("*********************");
		// O(n) + O(n^2) OR O(n + n^2)
		// O(n^2)
		for (int num : numbers) { // O(n)
			System.out.println(num);
		}
		for (int first : numbers) { // O(n)
			for (int second : numbers) { // O(n)
				System.out.println(first + ", " + second);
			}
		}
		System.out.println("*********************");
		// O(n) * O(n) * O(n)
		// O(n^3) (For Instance, Cubic Notation)
		// O(n^2) => Quadratic Big O Notation
		for (int first : numbers) { // O(n)
			for (int second : numbers) { // O(n)
				for (int third : numbers) { // O(n)
					System.out.println(first + ", " + second + ", " + third);
				}
			}
		}
	}


}

public class BigONotationExample {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50 };
		Dummy dummy = new Dummy();
		dummy.printOne(numbers);

	}

}
