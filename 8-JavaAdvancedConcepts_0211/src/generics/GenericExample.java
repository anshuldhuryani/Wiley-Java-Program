package generics;

import java.util.ArrayList;

/**
 * 
 * 	The generic collections were introduced from Java 5 onwards.
 * 	The generic collections allow the data-types to pass as parameters to the classes and methods.
 * 	The generic collections disable the type-casting usage.
 * 	The generic collections are type safe and checked at compile time.
 * 	The generic collections syntax:
 * 		class<data-type> , interface<data-type>
 *		Elements to be used while-creating user-defined generics:
 *		T - Type
 *		E - Element
 *		K - Key
 *		N- Number
 *		V - Value
 */

public class GenericExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Gautam");
		list.add("100");
		
	}

}
