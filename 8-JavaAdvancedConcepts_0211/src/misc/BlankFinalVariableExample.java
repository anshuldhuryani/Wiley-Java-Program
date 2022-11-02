package misc;

public class BlankFinalVariableExample {

	final int count;

	public BlankFinalVariableExample() {
		this.count = 100;
	}

	public void setCount() {
		System.out.println(this.count);
	}

	public static void main(String[] args) {

		BlankFinalVariableExample obj = new BlankFinalVariableExample();
		obj.setCount();

	}

}
