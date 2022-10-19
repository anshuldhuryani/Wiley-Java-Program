package conditional_constructs;

public class SimpleIfStatement {
	
	// In a program, all the if statements are evaluated one after the another
	// whether the previous condition is true or not.
	
	public static void main(String[] args) {
		
		float sellingPrice = 12000;
		float costPrice = 10000;
		
		if(sellingPrice > costPrice) {
			System.out.println("Profit");
		} if(costPrice > sellingPrice) {
			System.out.println("Loss");
		} if(costPrice == sellingPrice) {
			System.out.println("No Profit No Loss");
		}
		
	}

}
