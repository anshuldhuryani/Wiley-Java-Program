package assessment;

public class AssessmentOne {

	public static void main(String[] args) {

		// User is only allowed to make a purchase when he is:
		// logged in
		// email verified
		// cardInfo - valid
		// If any one is missing, stop purchase

		boolean isLoggedIn = true;
		boolean isEmailVerified = true;
		boolean isCardInfoValid = false;

		// First Way
		if (isLoggedIn && isEmailVerified && !isCardInfoValid)
			System.out.println("You can Purchase");
		else
			System.out.println("You can not Purchase");
		
		// Second Way
		if(isLoggedIn) {
			if(isEmailVerified) {
				if(isCardInfoValid) {
					System.out.println("You can Purchase.");
				}
				else {
					System.out.println("Stop the Purchase");
				}
			}
			else {
				System.out.println("Stop the Purchase");
			}
		}
		else {
			System.out.println("Stop the Purchase");
		}
	}

}
