package generics;

class Test<T> {
	T value;
	String message;

	Test() {
	}

	Test(T value, String message) {
		this.value = value;
		this.message = message;
	}

	public T getValue() {
		return this.value;
	}

	public String getMessage() {
		return this.message;
	}
}

public class GenericClassExample {

	public static void main(String[] args) {

		Test<Integer> test1 = new Test<Integer>(10, "Hello World");
		System.out.println("Value Returned: " + test1.getValue());
		System.out.println("Message Returned: " + test1.getValue());
		
		System.out.println("--------------------------------------------------------");

		Test<String> test2 = new Test<String>("Ten", "Hello World");
		System.out.println("Value Returned: " + test2.getValue());
		System.out.println("Message Returned: " + test2.getValue());
	}

}
