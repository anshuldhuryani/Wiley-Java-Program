package stacks;

public class StackTester {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		System.out.println("Element Ready to Pop: " + stack.peek());
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		// stack.push(60);		// StackOverFlowError
		
		stack.display();
		
		System.out.println("Is stack empty ? " + stack.isEmpty() );
		System.out.println("Element Ready to Pop: " + stack.peek());
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		// stack.pop();					// IllegalStateException
		
		System.out.println(stack);
		
		
	}

}
