package assessment;

abstract class Account {
	
	protected int accountNumber;
	protected String accountName;
	public Account(int accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}
	abstract void display();
}

class Saving extends Account {
	private int balance;
	public Saving(int accountNumber, String accountName, int balance) {
		super(accountNumber, accountName);
		this.balance = balance;
	}
	@Override
	void display() {
		System.out.println("Saving Account Details: ");
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Account Name: " + this.accountName);
		System.out.println("Balance: " + this.balance);
	}
	
	
}

public class OverridingBankingAssessment {

	
}
