//package exceptions;
//
//class ArithmaticTest {
//
//	public static void multipleCatchTest() {
//		int array[] = { 10, 20, 30, 40 };
//		int num1 = 50;
//		int num2 = 10;
//		try {
//			try {
//				System.out.println(num1 / num2);
//				System.out.println("4th element of given array = " + array[3]);
//				System.out.println("5th element of given array = " + array[4]);
//			} catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println(e);
//			} catch (ArithmeticException e) {
//				System.out.println(e);
//			}
//			int num = Integer.parseInt("30");
//			System.out.println(num);
//		} catch (NumberFormatException e) {
//			System.out.println(e);
//		}
//		System.out.println("Remaining code after exception handling.");
//	}
//}
//
//public class ExceptionHandlingExampleFive {
//
//	public static void main(String[] args) {
//		ArithmaticTest.multipleCatchTest();
//	}
//
//}
