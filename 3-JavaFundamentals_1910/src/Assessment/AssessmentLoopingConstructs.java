package Assessment;

public class AssessmentLoopingConstructs {

	public static void main(String[] args) {

		int[] numbers = { 1, 23, 53, 11, 42 };
		int i = 0, sum = 0;
		for (int u = 0; u < numbers.length; u++) {
			sum = sum + numbers[u];
		}
		System.out.println(sum);

		System.out.println("---------------");

		sum = 0;
		do {
			sum = sum + numbers[i];
			i++;
		} while (i < numbers.length);
		System.out.println(sum);

		System.out.println("---------------");

		i = 0;
		sum = 0;
		while (i < numbers.length) {
			sum = sum + numbers[i];
			i++;
		}
		System.out.println(sum);

		System.out.println("---------------");
		sum = 0;
		for (int y : numbers) {
			sum = sum + y;
		}
		System.out.println(sum);
	}

}
