package exceptions;

class ArithmeticTest {
	public static void division(int num1, int num2) {
		int result = 0;
		try {
			result = num1 / num2;
		}  	catch(ArithmeticException | IndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Division: " + result);
		}
		System.out.println("Remaining Code Here..");
	}
}

public class ExceptionHandlingExampleSix {

	public static void main(String[] args) {
		ArithmeticTest.division(100, 0); 		// Exception
	}
	
}
