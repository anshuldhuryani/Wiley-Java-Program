package looping_constructs;

public class EnhancedLoopExample {

	public static void main(String[] args) {

		int[] numbers = { 100, 23, 43, 50, 60 };
		
		// For Loop
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("************************");
		
		// While Loop
		int i = 0;
		while(i<numbers.length)
		{
			System.out.println(numbers[i]+" ");
			i++;
		}
		
		System.out.println("************************");
		
		// Do While Loop
		i=0;
		do {
			System.out.println(numbers[i]+" ");
			i++;
		}while(i<numbers.length);
		
		System.out.println("************************");
		
		// Enhanced Loop
		for (int num : numbers) {
			System.out.println(num);
		}
	
	}

}
