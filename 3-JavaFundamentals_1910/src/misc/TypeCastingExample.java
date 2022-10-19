package misc;

public class TypeCastingExample {
	
	public static void main(String[] args) {
		
		// Type Casting: To convert data type of a variable depending upon the calcuation and evaluation.
		// Implict Casting -> Performed by Compiler itself.
		// Explict Casting -> Developer perfom this casting as chances of data loss is there.
		
		
		// Demonstration 1:
//		int num1 = 100;
//		int num2 = num1;
//		System.out.println(num1);	// 100
//		System.out.println(num2);	// 100
		
		// Demnostration 2:
		//int num1 = 100;
		//float num2 = num1;		// Implicit Casting
		//System.out.println(num1);	// 100
		//System.out.println(num2);	// 100.0
		
		// Demonstration 3:
		float num1 = 100.45F;
		int num2 = (int)num1;	// Explicit TypeCasting
		System.out.println(num1);	// 100
		System.out.println(num2);	// 100
		
	}

}
