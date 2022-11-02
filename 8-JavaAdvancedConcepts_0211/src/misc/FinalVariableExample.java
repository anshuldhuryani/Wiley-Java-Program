package misc;

public class FinalVariableExample {

	final int count = 100;

	public void setCount() {
		System.out.println(this.count);
		// Error: The final field FinalKeywordExample.count cannot be assigned
		// count += 200;
	}

	public static void main(String[] args) {

		FinalVariableExample obj = new FinalVariableExample();
		obj.setCount();

	}

}
