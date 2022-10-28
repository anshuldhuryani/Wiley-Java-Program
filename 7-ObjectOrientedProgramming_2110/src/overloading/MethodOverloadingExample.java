package overloading;

class Calculation {
	
	public void addition(int num1, int num2) {
		System.out.println("The sum of two integer numbers: " + (num1 + num2));
	}
	
	public void addition(float num1, float num2) {	
		System.out.println("The sum of two float numbers: " + (num1+num2));
	}
	
	public void addition(int num1, int num2, int num3) {
		System.out.println("The sum of three integer numbers: " + (num1 + num2 + num3));
	}
	
	public void addition(int  num1, float num2) {	
		System.out.println("The sum of int and float: " + (num1+num2));
	}
	
	public void addition(float  num1, int num2) {	
		System.out.println("The sum of float and int: " + (num1+num2));
	}
	
}

public class MethodOverloadingExample {

	public static void main(String[] args) {
		
		Calculation calc = new Calculation();
		calc.addition(100, 200);
		calc.addition(12.4F, 23.4F);
		calc.addition(100, 200, 300);
		calc.addition(12.4F, 10);
		calc.addition(10, 12.3F);
	}
	
}
