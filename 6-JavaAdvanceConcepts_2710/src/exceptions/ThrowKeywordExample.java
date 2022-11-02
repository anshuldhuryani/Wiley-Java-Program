package exceptions;

/**
 * Throw keyword helps in throwing the 
 * built-in exception or custom exception manually.
 */

class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyException() {
		super("Not valid to vote.");
	}
	public MyException(String message) {
		super(message);
	}
}

class Calculate {
	public static void validate(int age) throws MyException {
		if(age >= 18)
			System.out.println("You can come for voting window.");
		else
//			throw new MyException("Please enter write age to vote.");
			throw new MyException();
	} 
}

public class ThrowKeywordExample {
	public static void main(String[] args) {
		try {
			Calculate.validate(17);
		} catch(MyException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
}
