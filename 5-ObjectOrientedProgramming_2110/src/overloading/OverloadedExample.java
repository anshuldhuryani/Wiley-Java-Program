package overloading;

//Automatic type conversions apply to overloading
class OverloadDemo {
	
	void test() {
		System.out.println("No parameters");
	}

	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}

	void test(double a) {
		System.out.println("Inside test (double) a : " + a);
	}
}

public class OverloadedExample {
	public static void main(String args[]) {
		OverloadDemo ob = new OverloadDemo();
		ob.test();
		ob.test(5);
		ob.test(10, 20);
		ob.test(23, 56);
	}
}