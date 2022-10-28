package overriding;

interface IManageAccount {
	void openAccount();
	void closeAccount();
}

interface IBankAccount  {
	public static final int rate_of_interest = 0;
	public static void welcomeMessage() {
		System.out.println("Welcome to ABC Bank!!");
	}
	public default void welcome() {
		System.out.println("Default Welcome Method Here..");
	}
	void deposit();
	void withdraw();
	void balance();
}

class SavingAccountHere implements IBankAccount, IManageAccount {

	@Override
	public void deposit() {
		System.out.println("Deposit in Saving Account.");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdrwal from Saving Account.");
	}

	@Override
	public void balance() {
		System.out.println("Balance in Saving Account.");
	}

	@Override
	public void openAccount() {
		System.out.println("Opening an account.");
	}

	@Override
	public void closeAccount() {
		System.out.println("Closing an account.");
		
	}
}

public class InterfaceOverridingExample {

	public static void main(String[] args) {
		
		IBankAccount.welcomeMessage();
		
		SavingAccountHere savingHere = new SavingAccountHere();
		savingHere.welcome();
		savingHere.openAccount();
		savingHere.deposit();
		savingHere.withdraw();
		savingHere.balance();
		savingHere.closeAccount();
	}

}
