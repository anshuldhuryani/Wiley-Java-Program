package looping_constructs;
import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {

//		for (int i = 1; i <= 10; i++) {
//			System.out.println("Hello World: " + i);
//		}

		Scanner scan = new Scanner(System.in);
		int value = 0;
		// Check whether a number is divisible by 5 or not (5 Times):
		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter Value: ");
			value = scan.nextInt();
			if (value % 5 == 0)
				System.out.println("Divisible");
			else
				System.out.println("Not Divisible");
		}
		scan.close();
	}

}
