package operators;

public class ShiftOperators {

	public static void main(String[] args) {

		// 0010
		// Left Shift: 00100
		int number = 2;
		int result = number << 2;
		System.out.println(result); // Result: 8

		// RIght Shift: 1000
		number = 8;
		System.out.println(8 >> 2); // Result: 0010
	

	}
}
