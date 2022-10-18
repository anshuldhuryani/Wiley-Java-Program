package operators;

public class ArithmeticAssignmentOperators {
	
	public static void main(String[] args) {
		
		int num1 = 100, num2 = 200;
		
		num1 = num2;
		System.out.println(num1);
		System.out.println(num2);
		
		num1+= num2;
		System.out.println(num1);
		System.out.println(num2);
		
		num1-= num2;
		System.out.println(num1);
		System.out.println(num2);
		
		num1*= num2;
		System.out.println(num1);
		System.out.println(num2);
		
		num1/= num2;
		System.out.println(num1);
		System.out.println(num2);
		
		num1%= num2;
		System.out.println(num1);
		System.out.println(num2);
			
	}

}
