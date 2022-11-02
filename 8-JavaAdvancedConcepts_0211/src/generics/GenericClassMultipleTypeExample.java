package generics;

class Calculation<T, U> {
	T value1;
	U value2;
	
	public Calculation(T value1, U value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public void display() {
		System.out.println("Value 1 : " + this.value1);
		System.out.println("Value 2 : " + this.value2);
	}
	
	
}

public class GenericClassMultipleTypeExample {
	
	public static void main(String[] args) {
		
		Calculation<Integer, Integer> calc1 = new Calculation<Integer, Integer>(100, 200);
		calc1.display();
		
		Calculation<Float, Float> calc2 = new Calculation<Float, Float>(100.50F, 200.75F);
		calc2.display();
		
		
	}

}
