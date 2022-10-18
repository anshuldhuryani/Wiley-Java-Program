package assessment;

public class AssessmentTwo {
	
	public static void main(String[] args) {
		
		// Allow user to access course if he is:
		// logged in from email
		// logged in from Google
		// logged in from Facebook
		
		boolean isLoggedInGoogle= true, isLoggedInFacebook = false, isLoggedInEmail = false;
		if(isLoggedInGoogle || isLoggedInFacebook || isLoggedInEmail)
			System.out.println("You can login");
		else
			System.out.println("You can not login");

	}
}
