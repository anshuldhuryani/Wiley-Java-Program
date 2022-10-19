package Assessment;

public class AssessmentTwo {
	
	// Assessment on Unary Operators:
	
	public static void main(String[] args) {
		
		int a = 1;
        int b = 2;
        int c;
        int d;
        c = --b; 		// b=1, c=1
        d = a--;		// d=1, a=0
        c--;				// 0
        System.out.println("a = " +a); 	// 0
        System.out.println("b = " +b);	// 1
        System.out.println("c = " +c);	// 0
        System.out.println("d = " +d);	// 1
        
	}

}
