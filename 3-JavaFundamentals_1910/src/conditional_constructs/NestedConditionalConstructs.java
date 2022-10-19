package conditional_constructs;

public class NestedConditionalConstructs {
	
	// Nested Condition: Condition within Condition

	public static void main(String[] args) {
	
		float sellingPrice = 12000;
		float costPrice = 14000;

		if (sellingPrice > costPrice) {
			System.out.println("Profit");
		} else {
			if(costPrice > sellingPrice) {
				System.out.println("Loss");
			} else {
				System.out.println("No Profit No Loss");
			}
			
		}
	}

}
