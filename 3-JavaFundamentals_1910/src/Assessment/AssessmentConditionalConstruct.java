package Assessment;

import java.util.Scanner;

public class AssessmentConditionalConstruct {

	public static void main(String[] args) {

		// If age < 60:
		// if income is less than 250000 then no tax applicable.
		// if income is more than 250001 and less than 500000 then tax percentage is 10%
		// if income is more than 500001 and less than 1000000 then tax percentage is
		// 20%
		// if income is more than 1000001 then tax percentage is 30%

		// if age >=60 and age < 80
		// if income is less than 300000 then no tax applicable
		// if income is between 300001 and 500000 then tax percentage is 10%
		// if income is between 500001 and 1000000 then tax percentage is 20%
		// if income is more than 1000001 then tax_percentage is 30%

		// Otherwise
		// if income is less than 500000 then no tax applicable
		// if income is between 500001 and 1000000 then tax percentage is 0.2
		// if income is more than 1000001 then tax_percentage is 30%

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Age: ");
		int age = scanner.nextInt();
		System.out.print("Enter Income");
		int income = scanner.nextInt();
		float tax_percent = 0, tax;
		
		if (age < 60) {
			if (income <= 250000)
				tax_percent = 0;
			else if (income >= 250001 && income <= 500000)
				tax_percent = 0.1F;
			else if (income >= 500001 && income <= 1000000)
				tax_percent = 0.2F;
			else
				tax_percent = 0.3F;
		} else if (age >= 60 && age < 80) {
			if (income <= 300000)
				tax_percent = 0;
			else if (income >= 300001 && income <= 500000)
				tax_percent = 0.1F;
			else if (income >= 500001 && income >= 1000000)
				tax_percent = 0.2F;
			else
				tax_percent = 0.3F;
		} else {
			if (income <= 500000)
				tax_percent = 0;
			else if (income >= 500001 && income <= 1000000)
				tax_percent = 0.2F;
			else
				tax_percent = 0.3F;
		}
		
		tax = tax_percent * income;
		System.out.println("Tax : " + tax);

		scanner.close();

	}

}
