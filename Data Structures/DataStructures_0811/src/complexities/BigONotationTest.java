package complexities;

import java.util.List;

class Calculation {

	// Method 1:
	public boolean isFirstNumberEqualToOne(List<Integer> numbers) {
		return numbers.get(0) == 1;
	}

	// Method 2:
	public boolean containsNumber(List<Integer> numbers, int comparisonNumber) {
		for (Integer number : numbers) {
			if (number == comparisonNumber) {
				return true;
			}
		}
		return false;
	}

	// Method 3:
	public static boolean containsDuplicates(List<String> input) {
		for (int outer = 0; outer < input.size(); outer++) {
			for (int inner = 0; inner < input.size(); inner++) {
				if (outer != inner && input.get(outer).equals(input.get(inner))) {
					return true;
				}
			}
		}
		return false;
	}

	// Method 4:
	public boolean containsNumbers(List<Integer> numbers, int comparisonNumber) {
		int low = 0;
		int high = numbers.size() - 1;
		while (low <= high) {
			int middle = low + (high - low) / 2;
			if (comparisonNumber < numbers.get(middle)) {
				high = middle - 1;
			} else if (comparisonNumber > numbers.get(middle)) {
				low = middle + 1;
			} else {
				return true;
			}
		}
		return false;
	}

	// Method 5:
	public int fibonacci(int number) {
		if (number <= 1) {
			return number;
		} else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
	}

}

public class BigONotationTest {

	public static void main(String[] args) {

		Calculation calc = new Calculation();
		calc.fibonacci(5);
	}

}
