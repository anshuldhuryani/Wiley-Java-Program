package conditional_constructs;

public class IfElseIfElseStatement {

	// When we have more than one condition and one alternative
	// of all the conditions, use if..else if..else

	public static void main(String[] args) {

		float sellingPrice = 12000;
		float costPrice = 14000;

		if (sellingPrice > costPrice) {
			System.out.println("Profit");
		} else if (costPrice > sellingPrice) {
			System.out.println("Loss");
		} else {
			System.out.println("No Profit No Loss");
		}

	}

}
