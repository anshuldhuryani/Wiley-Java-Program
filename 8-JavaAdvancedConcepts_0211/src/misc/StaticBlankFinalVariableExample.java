package misc;

public class StaticBlankFinalVariableExample {

	static final int count = 100;
	static final int maxTime;
	
	static {
		maxTime = 200;
	}

	public void setCount() {
		System.out.println(count);
		System.out.println(maxTime);
	}

	public static void main(String[] args) {

		FinalVariableExample obj = new FinalVariableExample();
		obj.setCount();

	}

}

