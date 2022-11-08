package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {

		// Empty Stream:
		Stream<String> stream = Stream.empty();

		// Printing Stream Elements:
		stream.forEach(element -> {
			System.out.println(element);
		});

		System.out.println("************************************");

		// Creating stream with string elements
		Stream<String> stringStream = Stream.of("King", "Kochhar", "John", "Smith");

		// Printing Stream Elements
		stringStream.forEach(element -> {
			System.out.println(element);
		});

		System.out.println("************************************");

		// Creating stream with integer elements
		Stream<Integer> integerStream = Stream.of(100, 200, 300, 400);

		// Printing Stream Elements
		integerStream.forEach(element -> {
			System.out.println(element);
		});

		System.out.println("************************************");

		// Stream of array:
		// Stream<Integer> arrayStream = Stream.of(new Integer[] { 10, 20, 30, 40, 50
		// });
		Integer[] numberArray = new Integer[] { 10, 20, 30, 40, 50 };
		Stream<Integer> arrayStream = Stream.of(numberArray);
		arrayStream = Arrays.stream(numberArray);

		// Printing Stream Elements
		arrayStream.forEach(element -> {
			System.out.println(element);
		});

		System.out.println("************************************");

		// Stream of Collections
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1000);
		integerList.add(2000);
		integerList.add(3000);
		integerList.add(4000);
		integerList.add(5000);
		Stream<Integer> collectionStream = integerList.stream();

		// Printing Stream Elements
		collectionStream.forEach(element -> {
			System.out.println(element);
		});
		
		System.out.println("************************************");
		
		// Create String builder using Stream
		Stream<String > builderStream = Stream.<String>builder().add("King").add("Kochhar").add("John").add("Smith").build();
		// Printing Stream Element
		builderStream.forEach(element -> {
			System.out.println(element);
		});
		
		System.out.println("************************************");
		
		// Stream to generate exclusive range:
		IntStream rangeStream = IntStream.range(3, 6);
		// Printing Stream Element
		rangeStream.forEach(element -> {
			System.out.println(element);
		});
		
		

	}

}
