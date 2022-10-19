package conditional_constructs;

public class IfElseStatement {
	
	//	1. All the if statements gets evaluated.
	//	2. Else always work for immediate above if.
		
	public static void main(String[] args) {
		
		float sellingPrice = 12000;
		float costPrice = 10000;
		
		if(sellingPrice > costPrice) {
			System.out.println("Profit");
		} if(costPrice > sellingPrice) {
			System.out.println("Loss");
		} else {
			System.out.println("No Profit No Loss");
		}
		
//		Output: Profit and No Profit No Loss
		
	}

}
