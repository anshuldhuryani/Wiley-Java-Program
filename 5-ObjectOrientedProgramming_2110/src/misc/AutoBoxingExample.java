package misc;

public class AutoBoxingExample {
	
	public static void main(String[] args) {
		
		// Primitive Type
		int num = 100;
		
		// Conveting Primitive Type into Object (Boxing)
		Integer number = Integer.valueOf(num);
		
		System.out.println(num);
		System.out.println(number);
		System.out.println(number.getClass().getSimpleName());
		
		System.out.println("--------------------------------------------");
		
		// (Automatically assigns as Object after Conversion)AutoBoxing
		Integer anotherNumber  = num;
		System.out.println(num);
		System.out.println(number);
		System.out.println(anotherNumber);
		System.out.println(anotherNumber.getClass().getSimpleName());
		
		System.out.println("--------------------------------------------");
		
		// Converting an Object into primitive type.
		int unboxValue = number.intValue();
		
		System.out.println(unboxValue);
		
	}

}
