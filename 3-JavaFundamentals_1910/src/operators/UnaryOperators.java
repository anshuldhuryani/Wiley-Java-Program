package operators;

public class UnaryOperators {

	public static void main(String[] args) {

		// When we use increment or decrement operators (Unary Operators)
		// The value of operand gets increase or decrease by 1 respectively.
		//		int num = 100;
		//		// Increment
		//		++num;
		//		System.out.println(num);
		//		num++;
		//		System.out.println(num);
		//		// Decrement
		//		--num;
		//		System.out.println(num);
		//		num--;
		//		System.out.println(num);

		// ---------------------------------------------------------------------------------//
		
		int num = 100, result = 0;
		
		// Post Increment: First Assign then Increase
		result = num++;
		System.out.println(num); 		// 101
		System.out.println(result);		// 100
		
		// Pre Increment: First Increase then Assign
		result = ++num;
		System.out.println(num); 	// 102
		System.out.println(result); 	// 102
		
		// Post Decrement: First Assign then Decrease
		result = num--;
		System.out.println(num); 		// 101
		System.out.println(result);		// 102
		
		// Pre Increment: First Decrease then Assign
		result = --num;
		System.out.println(num); 	// 100
		System.out.println(result); 	// 100
		
		
		
		
		
		
		
		
		
	}

}
