package generics;


class MyClass {
	
	static <T> void display(T value1) {
		System.out.println(value1.getClass().getName() + " : " + value1);
	}
	
	// Define a method that prints array elements,
	// Type of Array is generic and passed as Parameter
	
}


public class GenericMethodExample {

	public static void main(String[] args) {
		
		MyClass.display(100);
		MyClass.display("King");
	
		// Pass Integer Array
		// Pass Character Array
		
	}

}
