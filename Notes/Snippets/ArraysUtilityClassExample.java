

		// Array Initialization
		int numbers[] = { 10, 20, 30, 40, 50 };		
		// Array Declaration
		int numbers[] = new int[5];		
		// Array Assignment
		numbers[0] = 10;				
		numbers[0] = 20;								
		numbers[0] = 30;								
		numbers[0] = 40;								
		numbers[0] = 50;	

/* ************************************************************* */		

	// Array Initialization
	Integer numbers[] = { 10, 20, 30, 40, 50 };
	List<Integer> arrayList = Arrays.asList(numbers);
	System.out.println(arrayList);

/* ************************************************************* */		

	// Array Initialization
	Integer numbers[] = { 10, 40, 30, 10, 5 };
	List<Integer> arrayList = Arrays.asList(numbers);
	System.out.println(arrayList);

/* ************************************************************* */		
	
	// Sorting the Array elements
	Integer numbers[] = { 10, 40, 30, 10, 5 };
	Arrays.sort(numbers);
	for (Integer num : numbers) {
		System.out.println(num);
	}
	
/* ************************************************************* */		
	
	// Arrays: BinarySearch (Search Element)
	Integer numbers[] = { 10, 40, 30, 20, 5 };
	Arrays.sort(numbers);
	System.out.println("Integer Array: " + Arrays.toString(numbers));
	System.out.println("Element Found: " + Arrays.binarySearch(numbers, 40));
	
/* ************************************************************* */		

	// Arrays: Copyof Method to copy elements into New Array
	Integer numbers[] = { 10, 40, 30, 20, 5 };
	System.out.println("Integer Array: " + Arrays.toString(numbers));
	// Creating New Array and Copying elements from existing Array
	Integer newNumbers[] = Arrays.copyOf(numbers, 10);
	System.out.println("New Integer Array: " + Arrays.toString(newNumbers));
	// Alternatively, we can copy and print at one go.
	System.out.println("New Integer Array: " + Arrays.toString(Arrays.copyOf(numbers, 10)));
	System.out.println("New Integer Array: " + Arrays.toString(Arrays.copyOfRange(numbers, 0, 3)));

/* ************************************************************* */	
	

	// Arrays: Comparing to Arrays
	Integer number_array_one[] = { 10, 40, 30, 20, 5 };
	Integer number_array_two[] = { 10, 40, 30, 20 };
	System.out.println("Integer Array: " + Arrays.equals(number_array_one,number_array_two));	
	
/* ************************************************************* */	
	
	// Arrays: Filling Array elements with Default Type
	Integer numbers[] = { 10, 40, 30, 20, 5 };
	Arrays.fill(numbers, 25);
	System.out.println("Integer Array: " + Arrays.toString(numbers));