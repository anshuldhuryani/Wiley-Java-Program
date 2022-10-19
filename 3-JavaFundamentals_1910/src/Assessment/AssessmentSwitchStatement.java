package Assessment;

import java.util.Scanner;

public class AssessmentSwitchStatement {

	// Create an application with following roles:
	// admin - gets full access
	// subadmin - gets access to create/delete courses
	// testprep - gets access to create/delete tests
	// user - gets access to consume content

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Write your role in which are assigned..(admin/subadmin/testprep/user)");
		String role = sc.next();
		role = role.toLowerCase();
		switch (role) {
		case "admin":
			System.out.println(" gets full access");
			break;
		case "subadmin":
			System.out.println(" gets access to create/ delete courses");
			break;
		case "testprep":
			System.out.println(" gets access to craete/delete tests");
			break;
		case "user":
			System.out.println(" gets access to consume content");
		default:
			System.out.println("Invalid Choice");
			break;
		}
		sc.close();
	}

}
