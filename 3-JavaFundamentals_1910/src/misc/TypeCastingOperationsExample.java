package misc;

public class TypeCastingOperationsExample {
	
	public static void main(String[] args) {
		
//		int num1 = 100;
//		int num2 = 200;
//		int num3 = num1 + num2;
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
		
//		byte num1 = 10;
//		byte num2 = 20;
//		int num3 = num1 + num2;							// Implicit Casting (Widening)
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
		
		byte num1 = 10;
		byte num2 = 20;
		byte num3 = (byte)(num1 + num2);	// Explicit Casting (Narrowing)
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
//		Note: byte,  short, char
//		These data types gets converted into integer before calculation.
		
		
	}

}
