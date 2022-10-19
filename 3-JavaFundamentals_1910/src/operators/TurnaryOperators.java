package operators;

public class TurnaryOperators {
	
	public static void main(String[] args) {
		
		int num = 45;
		
		// First Way: Using if..else Statement
		if(num%5 == 0) 
			System.out.println("Divisible by 5!!");
		else 
			System.out.println("Not Divisible by 5!!");
		
		// Second Way: Turnary Operator
		String result;
		result = (num%5 == 0)?"Divisible": "Not Divisible";
		System.out.println(result);
		
	}

}
