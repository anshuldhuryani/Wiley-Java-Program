package features;

import java.util.function.BiFunction;

interface Printer {
	void print();
}

class ConsolePrinter {
	
	public ConsolePrinter() {
		System.out.println("I am constructor of Console Printer..!!");
	}

	// Instance Method
	public  void printMessage() {
		System.out.println("I am printing message Here..");
	}

	// Static Method
	public static void printSomething() {
		System.out.println("I am printing something..");
	}

	// Static Method
	public static int addition(int num1, int num2) {
		return num1 + num2;
	}

}

public class MethodReferenceExample {

	public static void main(String[] args) {

		// Reference to a Static Method
		Printer printer = ConsolePrinter::printSomething;
		printer.print();

		// Reference to a Static Method
		BiFunction<Integer, Integer, Integer> additionCall = ConsolePrinter::addition;
		int result = additionCall.apply(100, 200);
		System.out.println(result);
		
		// Reference to an Instance Method
		ConsolePrinter ref = new ConsolePrinter();
		Printer printer1 = ref::printMessage;
		printer1.print();

		// Reference to a constructor
		Printer printer2 = ConsolePrinter::new;
		printer2.print();
	}

}
