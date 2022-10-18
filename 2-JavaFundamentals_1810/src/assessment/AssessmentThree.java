package assessment;

public class AssessmentThree {

	public static void main(String[] args) {

		// Show user a signout button if he is authenticated,
		// other wise show him option to Login/Signup

		boolean isAuthenticated = true;
		if (isAuthenticated)
			System.out.println("Signout");
		else
			System.out.println("Login/Signup");

	}

}
